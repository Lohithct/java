class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with a roar!");
    }
}
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with a vroom!");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        myCar.start(); 
        myBike.start(); 
    }
}
