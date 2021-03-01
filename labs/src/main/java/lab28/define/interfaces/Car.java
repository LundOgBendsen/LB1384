package lab28.define.interfaces;

public class Car extends Vehicle {

    public Car(int maxNoOfPassengers) {
        super(maxNoOfPassengers);
    }

    public String toString(){
        String result = "Car[";
        result += "maxNoOfPassengers=" + getMaxNoOfPassengers();
        result += "]";
        return result;
    }
}
