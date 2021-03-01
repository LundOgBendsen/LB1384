package lab28.define.interfaces;

public abstract class Vehicle {

    private int maxNoOfPassengers;

    public Vehicle(int maxNoOfPassengers) {
        this.maxNoOfPassengers = maxNoOfPassengers;
    }

    public int getMaxNoOfPassengers() {
        return maxNoOfPassengers;
    }

    public void setMaxNoOfPassengers(int maxNoOfPassengers) {
        this.maxNoOfPassengers = maxNoOfPassengers;
    }
}
