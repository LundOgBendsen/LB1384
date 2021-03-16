
package lab01.oop1.use.fields;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrivingArea {

	public static Thread mainThread;

	private static long sleepTime = 100;

	private DrivingAreaFrame drivingAreaFrame;

	private String name;

	@SuppressWarnings("rawtypes")
	private Vector cars = new Vector();

	private int height;

	private int width;

	public static DrivingArea singleton = new DrivingArea("Cars", 13, 13);

	@SuppressWarnings({ "rawtypes", "unchecked" })
	Vector getCars() {
		Vector cars = new Vector();
		Iterator i = this.cars.iterator();
		while (i.hasNext()) {
			WeakReference wr = (WeakReference) i.next();
			if (wr.get() != null) {
				cars.add(wr.get());
			}
		}
		return cars;
	}

	private DrivingArea(String name, int width, int height) {
		if (width < 1) {
			String msg = "";
			msg += "Tried to make DrivingArea with width < 1";
			throw new IllegalArgumentException(msg);
		} else if (height < 1) {
			String msg = "";
			msg += "Tried to make DrivingArea with height < 1";
			throw new IllegalArgumentException(msg);
		} else {
			this.name = name;
			this.width = width;
			this.height = height;
			drivingAreaFrame = new DrivingAreaFrame(name, width, height, cars);
		}
	}

	public void setMessage(String message) {
		drivingAreaFrame.setMessage(message);
	}

	public static void setSleepTime(long millis) {
		if (sleepTime < 1) {
			String msg = "";
			msg += "Sleep time cannot be 0 or less";
			throw new IllegalArgumentException(msg);
		}
		sleepTime = millis;
	}

	public static long getSleepTime() {
		return sleepTime;
	}

	public void refresh() {
		drivingAreaFrame.refresh();
		/*
		 * try{ Thread.sleep( sleepTime ); } catch( InterruptedException e ){
		 * String msg = ""; msg += "The sleep was unexpectedly interrupted";
		 * throw new IllegalStateException( msg );
		 */
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addCar(Car car) {
		if (car == null) {
			String msg = "";
			msg += "Tried to add null to a DrivingArea";
			throw new IllegalArgumentException(msg);
		} else {
			cars.add(new WeakReference(car));
			car.addToDrivingArea(this, getHorizontalStartLocation(),
					getVerticalStartLocation());
		}
	}

	private int horizontalStartLocation = -1;

	private int getHorizontalStartLocation() {
		if (horizontalStartLocation == (width - 1)) {
			horizontalStartLocation = 0;
			verticalStartLocation++;
		} else {
			horizontalStartLocation++;
		}
		return horizontalStartLocation;
	}

	private int verticalStartLocation = 0;

	private int getVerticalStartLocation() {
		return verticalStartLocation;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null) {
			String msg = "";
			msg += "Tried to set a car's name to null";
			throw new IllegalArgumentException(msg);
		} else if (name.trim() == "") {
			String msg = "";
			msg += "Tried to set a car's name to the empty String";
			throw new IllegalArgumentException(msg);
		} else {
			this.name = name;
			drivingAreaFrame.setName(this.name);
		}
	}

	boolean isLegalPosition(int verticalPosition, int horizontalPosition) {
		if (verticalPosition < 0 || verticalPosition >= width) {
			return false;
		} else if (horizontalPosition < 0 || horizontalPosition >= height) {
			return false;
		} else {
			return true;
		}
	}
}

class DrivingAreaFrame {

	private VisualDrivingArea visualDrivingArea;

	private JFrame frame;

	private JLabel messageLabel;

	void setName(String name) {
		frame.setName(name);
	}

	void setMessage(String message) {
		messageLabel.setText(message);
	}

	void refresh() {
		frame.repaint();
		visualDrivingArea.repaint();
	}

	@SuppressWarnings("rawtypes")
	DrivingAreaFrame(String name, int width, int height, Vector cars) {
		visualDrivingArea = new VisualDrivingArea(cars, width, height);

		frame = new JFrame();

		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setName(name);
		messageLabel = new JLabel("Ready...");

		frame.getContentPane().setLayout(new BorderLayout());

		frame.getContentPane().add(visualDrivingArea, BorderLayout.CENTER);
		JPanel bottom = new JPanel();
		bottom.setLayout(new BorderLayout());
		bottom.add(messageLabel, BorderLayout.CENTER);
		JButton go = new JButton("go!");
		go.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				DrivingArea.mainThread.interrupt();
			}
		});
		bottom.add(go, BorderLayout.EAST);

		frame.getContentPane().add(bottom, BorderLayout.SOUTH);

		frame.setVisible(true);
		frame.pack();
	}
}

@SuppressWarnings("rawtypes")
class VisualDrivingArea extends JComponent {
	private static final long serialVersionUID = 1L;

	private Vector cars;

	private int SQUARE_WIDTH = 66;

	private int SQUARE_HEIGHT = 66;

	private static BufferedImage grass;
	static {
		try {
			grass = ImageIO.read(Car.class.getResourceAsStream("/grass.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private int height;

	private int width;

	VisualDrivingArea(Vector cars, int width, int height) {
		this.cars = cars;
		this.width = width;
		this.height = height;
		this.setPreferredSize(new Dimension(SQUARE_WIDTH * width, SQUARE_HEIGHT
				* height));
	}

	protected void paintComponent(Graphics g) {
		Vector cars = getCars();
		Graphics2D g2 = (Graphics2D) g;
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				g2.drawImage(grass, null, x * SQUARE_WIDTH, y * SQUARE_HEIGHT);
			}
		}
		for (int n = 0; n < cars.size(); n++) {
			((Car) cars.get(n)).draw(g2);
		}
	}

	@SuppressWarnings("unchecked")
	Vector getCars() {
		Vector cars = new Vector();
		Iterator i = this.cars.iterator();
		while (i.hasNext()) {
			WeakReference wr = (WeakReference) i.next();
			if (wr.get() != null) {
				cars.add(wr.get());
			}
		}
		return cars;
	}

}
