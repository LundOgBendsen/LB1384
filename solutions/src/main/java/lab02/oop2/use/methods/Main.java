package lab02.oop2.use.methods;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(final String[] args) {
		try {
			controllerFrame = new ControllerFrame();

			// ///////////////////////////////////
			// INSERT YOUR CODE AFTER THIS LINE //
			// ///////////////////////////////////

			DrivingArea heathy = new DrivingArea(10, 10);
			printAndWait("DrivingArea heathy = new DrivingArea( 10, 10 );");
			System.out.println("HEJ");
			heathy.setName("HEATHY");
			printAndWait("heathy.setName( \"HEATHY\" );");

			DrivingArea grassy = new DrivingArea(6, 8);
			printAndWait("DrivingArea grassy = new DrivingArea( 6, 8 );");

			grassy.setName("GRASSY");
			printAndWait("grassy.setName( \"GRASSY\" );");

			Car ford = new Car();
			printAndWait("Car ford = new Car( );");

			heathy.addCar(ford);
			printAndWait("heathy.addCar( ford );");

			ford.startEngine();
			printAndWait("ford.startEngine();");

			ford.moveForward(3);
			printAndWait("ford.moveForward(3);");

			Car toyota = new Car();
			printAndWait("Car toyota = new Car( );");

			grassy.addCar(toyota);
			printAndWait("grassy.addCar( toyota );");

			Car mazda = new Car();
			printAndWait("Car mazda = new Car( );");

			heathy.addCar(mazda);
			printAndWait("heathy.addCar( mazda );");

			mazda.startEngine();
			printAndWait("mazda.startEngine();");

			toyota.startEngine();
			printAndWait("toyota.startEngine();");

			ford.moveForward(1);
			printAndWait("ford.moveForward(1);");

			mazda.moveForward(1);
			printAndWait("mazda.moveForward(1);");

			toyota.turnLeft();
			printAndWait("toyota.turnLeft();");

			ford.turnLeft();
			printAndWait("ford.turnLeft();");

			mazda.stopEngine();
			printAndWait("mazda.stopEngine();");

			toyota.turnLeft();
			printAndWait("toyota.turnLeft();");

			ford.moveForward(1);
			printAndWait("ford.moveForward(1);");

			ford.moveForward(1);
			printAndWait("ford.moveForward(1);");

			ford.turnLeft();
			printAndWait("ford.turnLeft();");

			toyota.moveForward(1);
			printAndWait("toyota.moveForward(1);");

			ford.moveForward(1);
			printAndWait("ford.moveForward(1);");

			toyota.moveForward(1);
			printAndWait("toyota.moveForward(1);");

			mazda.startEngine();
			printAndWait("mazda.startEngine();");

			ford.turnRight();
			printAndWait("ford.turnRight();");

			toyota.stopEngine();
			printAndWait("toyota.stopEngine();");

			mazda.turnRight();
			printAndWait("mazda.turnRight();");

			ford.moveForward(1);
			printAndWait("ford.moveForward(1);");

			toyota.startEngine();
			printAndWait("toyota.startEngine();");

			mazda.moveForward(1);
			printAndWait("mazda.moveForward(1);");

			ford.moveForward(1);
			printAndWait("ford.moveForward(1);");

			toyota.turnRight();
			printAndWait("toyota.turnRight();");

			mazda.moveForward(1);
			printAndWait("mazda.moveForward(1);");

			ford.turnLeft();
			printAndWait("ford.turnLeft();");

			toyota.moveForward(1);
			printAndWait("toyota.moveForward(1);");

			mazda.turnLeft();
			printAndWait("mazda.turnLeft();");

			ford.moveForward(1);
			printAndWait("ford.moveForward(1);");

			toyota.moveForward(1);
			printAndWait("toyota.moveForward(1);");

			ford.turnLeft();
			printAndWait("ford.turnLeft();");

			mazda.turnLeft();
			printAndWait("mazda.turnLeft();");

			toyota.turnRight();
			printAndWait("toyota.turnRight();");

			ford.moveForward(1);
			printAndWait("ford.moveForward(1);");

			mazda.moveForward(1);
			printAndWait("mazda.moveForward(1);");

			toyota.stopEngine();
			printAndWait("toyota.stopEngine();");

			ford.stopEngine();
			printAndWait("ford.stopEngine();");

			mazda.stopEngine();
			printAndWait("mazda.stopEngine();");

			// /////////////////////////////////////
			// INSERT YOUR CODE BEFORE THIS LINE //
			// /////////////////////////////////////

			printAndWait("DONE RUNNING YOUR CODE...");
		} catch (Exception e) {
			System.out.println("\n##################\n");
			e.printStackTrace();
			System.out.println("\n##################\n");
		} finally {
			System.exit(0);
		}
	}

	public static void printAndWait(final String msg) {
		controllerFrame.addMessage(msg);
		System.gc();
		DrivingArea.refreshAll();
		sleep = true;
		while (sleep) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// do nothing
			}
		}
	}

	private static ControllerFrame controllerFrame;

	private static boolean sleep = false;

	private static class ControllerFrame {

		JFrame frame;

		JButton goButton;

		JTextArea textArea;

		JScrollPane textScrollPane;

		private ControllerFrame() {
			frame = new JFrame("Controller");
			frame.getContentPane().setLayout(new BorderLayout());
			frame.addWindowListener(new WindowAdapter() {

				@Override
				public void windowClosing(final WindowEvent e) {
					System.exit(0);
				}
			});
			textArea = new JTextArea();
			textScrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			frame.getContentPane().add(textScrollPane, BorderLayout.CENTER);
			goButton = new JButton("Go!");
			frame.getContentPane().add(goButton, BorderLayout.SOUTH);
			goButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(final ActionEvent e) {
					Main.sleep = false;
				}
			});
			frame.pack();
			frame.setSize(300, 200);
			frame.setVisible(true);
		}

		void addMessage(final String message) {
			try {
				SwingUtilities.invokeAndWait(new Runnable() {

					@Override
					public void run() {
						frame.toFront();
						textArea.append("\n" + message);
						textScrollPane.getVerticalScrollBar()
								.setValue(textScrollPane.getVerticalScrollBar().getMaximum());
					}
				});
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
	}
}
