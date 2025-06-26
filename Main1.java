// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

// Subclass: Car
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}

// Garage class
class Garage {
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}

// Main class
public class Main1 {
    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Car myCar = new Car();
        Motorcycle myBike = new Motorcycle();

        // Create Garage instance
        Garage garage = new Garage();

        // Service both vehicles
        garage.serviceVehicle(myCar);     // Output: Car started. Vehicle serviced.
        garage.serviceVehicle(myBike);    // Output: Motorcycle started. Vehicle serviced.
    }
}