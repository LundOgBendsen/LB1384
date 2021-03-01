package lab02.use.methods;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) throws Exception {
		try {
			controllerFrame = new ControllerFrame();

			printAndWait("READY TO RUN YOUR CODE...");

			// ///////////////////////////////////
			// INSERT YOUR CODE AFTER THIS LINE //
			// ///////////////////////////////////

			// ////////////////////////////////////
			// INSERT YOUR CODE BEFORE THIS LINE //
			// ////////////////////////////////////

			printAndWait("DONE RUNNING YOUR CODE...");
		} catch (Exception e) {
			System.out.println("\n##################\n");
			e.printStackTrace();
			System.out.println("\n##################\n");
		} finally {
			System.exit(0);
		}
	}

	public static void printAndWait(String msg) {
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

		JLabel[] msgLabels;

		JButton goButton;

		JPanel labelPanel;

		JTextArea textArea;

		JScrollPane textScrollPane;

		private ControllerFrame() {
			frame = new JFrame("Controller");
			frame.getContentPane().setLayout(new BorderLayout());
			frame.addWindowListener(new WindowAdapter() {

				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			textArea = new JTextArea();
			textScrollPane = new JScrollPane(textArea,
					JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			frame.getContentPane().add(textScrollPane, BorderLayout.CENTER);
			goButton = new JButton("Go!");
			frame.getContentPane().add(goButton, BorderLayout.SOUTH);
			goButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
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

					public void run() {
						frame.toFront();
						textArea.append("\n" + message);
						textScrollPane.getVerticalScrollBar().setValue(
								textScrollPane.getVerticalScrollBar()
										.getMaximum());
					}
				});
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
	}
}
