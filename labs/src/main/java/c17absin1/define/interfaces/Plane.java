package c17absin1.define.interfaces;

public class Plane extends Vehicle {

    public Plane(int maxNoOfPassengers) {
        super(maxNoOfPassengers);
    }

    public String toString(){
        String result = "Plane[";
        result += "maxNoOfPassengers=" + getMaxNoOfPassengers();
        result += "]";
        return result;
    }
}
