package c02oop2.use.methods;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Car {

	private String name;

	private int direction = 0; // 0=n, 1=e, 2=s, 3=w

	private final int NORTH = 0;

	private final int EAST = 1;

	private final int SOUTH = 2;

	private final int WEST = 3;

	private boolean running = false;

	private DrivingArea drivingArea;

	private int horizontalPosition;

	private int verticalPosition;

	public Car() {
		this("NO_NAME");
	}

	public Car(String name) {
		this.setName(name);
	}

	public String getDirection() {
		makeSureCarIsOnDrivingArea();
		switch (direction) {
		case 0:
			return "NORTH";
		case 1:
			return "EAST";
		case 2:
			return "SOUTH";
		case 3:
			return "WEST";
		}
		String msg = "";
		msg += "Car " + name + " is going in an illegal direction " + direction;
		throw new IllegalStateException(msg);
	}

	private void makeSureEngineIsRunning() {
		if (!running) {
			String msg = "";
			msg += "Car " + name
					+ " tried to turn or move car without the engine running";
			throw new IllegalStateException(msg);
		}
	}

	private void makeSureCarIsOnDrivingArea() {
		if (drivingArea == null) {
			String msg = "";
			msg += "Tried work with car " + name
					+ " which is not on a Driving Area";
			throw new IllegalStateException(msg);
		}
	}

	public void turnLeft() {
		makeSureCarIsOnDrivingArea();
		makeSureEngineIsRunning();
		if (this.direction == 0) {
			this.direction = 3;
		} else if (this.direction >= 1 && this.direction <= 3) {
			this.direction = this.direction - 1;
		} else {
			String msg = "";
			msg += "Car " + name + " is going in an illegal direction "
					+ direction;
			throw new IllegalStateException(msg);
		}
	}

	public void turnRight() {
		makeSureCarIsOnDrivingArea();
		makeSureEngineIsRunning();
		if (this.direction == 3) {
			this.direction = 0;
		} else if (this.direction >= 0 && this.direction <= 2) {
			this.direction = this.direction + 1;
		} else {
			String msg = "";
			msg += "Car " + name + " is going in an illegal direction "
					+ direction;
			throw new IllegalStateException(msg);
		}
	}

	public String getName() {
		makeSureCarIsOnDrivingArea();
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
		}
	}

	// Note this method has package-only access
	void addToDrivingArea(DrivingArea drivingArea, int x, int y) {
		if (this.drivingArea != null) {
			String msg = "";
			msg += "Tried to add Car " + name + " to a map twice";
			throw new IllegalArgumentException(msg);
		}
		this.drivingArea = drivingArea;
		this.horizontalPosition = x;
		this.verticalPosition = y;
	}

	public boolean isRunning() {
		makeSureCarIsOnDrivingArea();
		return this.running;
	}

	public void stopEngine() {
		makeSureCarIsOnDrivingArea();
		if (this.running == false) {
			String msg = "";
			msg += "Tried to turn off engine of car " + name
					+ ", but engine is already off";
			throw new IllegalArgumentException(msg);
		} else {
			running = false;
		}
	}

	public void startEngine() {
		makeSureCarIsOnDrivingArea();
		if (running == true) {
			String msg = "";
			msg += "Tried to turn on engine of " + name
					+ ", but engine is already running";
			throw new IllegalArgumentException(msg);
		} else {
			running = true;
		}
	}

	private void move(boolean forWards, int howFar) {
		makeSureCarIsOnDrivingArea();
		makeSureEngineIsRunning();
		if (howFar <= 0) {
			String msg = "";
			msg += "Tried to move 0 or less with car " + name
					+ ", which isn't possible";
			throw new IllegalArgumentException(msg);
		} else {
			int newVerticalPosition = verticalPosition;
			int newHorizontalPosition = horizontalPosition;
			if (forWards && direction == NORTH) {
				newVerticalPosition -= howFar;
			} else if (forWards && direction == EAST) {
				newHorizontalPosition += howFar;
			} else if (forWards && direction == SOUTH) {
				newVerticalPosition += howFar;
			} else if (forWards && direction == WEST) {
				newHorizontalPosition -= howFar;
			} else if ((!forWards) && direction == NORTH) {
				newVerticalPosition += howFar;
			} else if ((!forWards) && direction == EAST) {
				newHorizontalPosition -= howFar;
			} else if ((!forWards) && direction == SOUTH) {
				newVerticalPosition -= howFar;
			} else if ((!forWards) && direction == WEST) {
				newHorizontalPosition += howFar;
			}
			if (this.drivingArea.isLegalPosition(newHorizontalPosition,
					newVerticalPosition)) {
				this.verticalPosition = newVerticalPosition;
				this.horizontalPosition = newHorizontalPosition;
			} else {
				String msg = "";
				msg += "Tried to move car " + name + " out of the Driving Area";
				throw new IllegalArgumentException(msg);
			}
		}
	}

	public void moveForward(int howFar) {
		move(true, howFar);
	}

	public void moveBackward(int howFar) {
		move(false, howFar);
	}

	void draw(Graphics2D g2) {
		BufferedImage currentCar = null;
		if (direction == NORTH && running == false) {
			currentCar = imageNorthOff;
		} else if (direction == EAST && running == false) {
			currentCar = imageEastOff;
		} else if (direction == SOUTH && running == false) {
			currentCar = imageSouthOff;
		} else if (direction == WEST && running == false) {
			currentCar = imageWestOff;
		} else if (direction == NORTH && running == true) {
			currentCar = imageNorthOn;
		} else if (direction == EAST && running == true) {
			currentCar = imageEastOn;
		} else if (direction == SOUTH && running == true) {
			currentCar = imageSouthOn;
		} else if (direction == WEST && running == true) {
			currentCar = imageWestOn;
		}
		g2.drawImage(currentCar, null, horizontalPosition * SQUARE_WIDTH,
				verticalPosition * SQUARE_HEIGHT);
	}

	private int SQUARE_WIDTH = 66;

	private int SQUARE_HEIGHT = 66;

	private static BufferedImage imageNorthOff;
	private static BufferedImage imageEastOff;
	private static BufferedImage imageSouthOff;
	private static BufferedImage imageWestOff;
	private static BufferedImage imageNorthOn;
	private static BufferedImage imageEastOn;
	private static BufferedImage imageSouthOn;
	private static BufferedImage imageWestOn;
	static {
		try {
			imageNorthOff = ImageIO.read(Car.class.getResourceAsStream("/car_north_off.gif"));
			imageEastOff = ImageIO.read(Car.class.getResourceAsStream("/car_east_off.gif"));
			imageSouthOff = ImageIO.read(Car.class.getResourceAsStream("/car_south_off.gif"));
			imageWestOff = ImageIO.read(Car.class.getResourceAsStream("/car_west_off.gif"));
			imageNorthOn = ImageIO.read(Car.class.getResourceAsStream("/car_north_on.gif"));
			imageEastOn = ImageIO.read(Car.class.getResourceAsStream("/car_east_on.gif"));
			imageSouthOn = ImageIO.read(Car.class.getResourceAsStream("/car_south_on.gif"));
			imageWestOn = ImageIO.read(Car.class.getResourceAsStream("/car_west_on.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
