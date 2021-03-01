package lab28.define.interfaces;

public class Ship extends Vehicle {

    public Ship(int maxNoOfPassengers) {
        super(maxNoOfPassengers);
    }

    public String toString(){
        String result = "Ship[";
        result += "maxNoOfPassengers=" + getMaxNoOfPassengers();
        result += "]";
        return result;
    }
}
