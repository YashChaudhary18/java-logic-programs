/* Create Vehicle → Car/Bike inheritance example. */
package OOP;
// Parent class
class Vehicle {

    String brand;
    int speed;

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display vehicle details
    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}


// Child class Car
class Car extends Vehicle {

    int doors;

    // Constructor
    Car(String brand, int speed, int doors) {
        super(brand, speed); // call parent constructor
        this.doors = doors;
    }

    // Method to display car details
    void displayCar() {
        displayVehicle();
        System.out.println("Doors: " + doors);
    }
}


// Child class Bike
class Bike extends Vehicle {

    boolean hasGear;

    // Constructor
    Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed); // call parent constructor
        this.hasGear = hasGear;
    }

    // Method to display bike details
    void displayBike() {
        displayVehicle();
        System.out.println("Has Gear: " + hasGear);
    }
}


// Main class
public class InheritanceExample {

    public static void main(String[] args) {

        // Create Car object
        Car car = new Car("Toyota", 180, 4);

        // Create Bike object
        Bike bike = new Bike("Yamaha", 120, true);

        System.out.println("Car Details:");
        car.displayCar();

        System.out.println("\nBike Details:");
        bike.displayBike();
    }
}
