package c16absin1.define.interfaces;


public class TestVehicles {

    public static void main(String[] args) {
        
        Vehicle[] vehicles  = new Vehicle[6];
        
        vehicles[0] = new Car(5);
        vehicles[1] = new Car(2);
        vehicles[2] = new Ship(8);
        vehicles[3] = new Ship(1000);
        vehicles[4] = new Plane(150);
        vehicles[5] = new Plane(3);
        
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
    }
}
