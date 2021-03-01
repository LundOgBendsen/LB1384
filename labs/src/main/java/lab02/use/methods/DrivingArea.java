package lab02.use.methods;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrivingArea {

	private static Vector all = new Vector();

	private DrivingAreaFrame drivingAreaFrame;

	private String name;

	private Vector cars = new Vector();

	private int height;

	private int width;

	Vector getCars() {
		return this.cars;
	}

	public DrivingArea(int width, int height) {
		this("", width, height);
	}

	public DrivingArea(String name, int width, int height) {
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
			all.add(this);
		}
	}

	public void refresh() {
		drivingAreaFrame.refresh();
	}

	public static void refreshAll() {
		for (int n = 0; n < all.size(); n++) {
			((DrivingArea) all.get(n)).refresh();
		}
	}

	public void addCar(Car car) {
		if (car == null) {
			String msg = "";
			msg += "Tried to add null to a DrivingArea";
			throw new IllegalArgumentException(msg);
		} else {
			cars.add(car);
			car.addToDrivingArea(this, width / 2, height / 2);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null) {
			name = "";
		}
		this.name = name;
		drivingAreaFrame.setName(this.name);
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

	void setName(String name) {
		frame.setTitle(name);
	}

	void refresh() {
		frame.repaint();
		visualDrivingArea.repaint();
	}

	DrivingAreaFrame(String name, int width, int height, Vector cars) {
		visualDrivingArea = new VisualDrivingArea(cars, width, height);

		frame = new JFrame();

		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setName(name);

		frame.getContentPane().setLayout(new BorderLayout());

		frame.getContentPane().add(visualDrivingArea, BorderLayout.CENTER);

		frame.setVisible(true);
		frame.pack();
	}
}

class VisualDrivingArea extends JComponent {

	private Vector cars;

	private int SQUARE_WIDTH = 66;

	private int SQUARE_HEIGHT = 66;

	private static BufferedImage grass = ImageUtilities
			.makeBufferedImage(ImageUtilities.blockingLoad("bin/gifs/grass.gif"));

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
}
