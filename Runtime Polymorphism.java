class Vehicle {

    void fuelType() {
        System.out.println("Vehicle uses fuel");
    }
}

class Car extends Vehicle {

    @Override
    void fuelType() {
        System.out.println("Car uses petrol");
    }
}

class Bike extends Vehicle {

    @Override
    void fuelType() {
        System.out.println("Bike uses petrol");
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.fuelType();
        v2.fuelType();
    }
}