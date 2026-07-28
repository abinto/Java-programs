abstract class Vehicle {

    abstract void start();

}
interface GPS {

    void navigate();

}
class Car extends Vehicle implements GPS {

    void start() {

        System.out.println("Car Started");

    }

    public void navigate() {

        System.out.println("GPS Navigation Started");

    }

}
public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();

        car.navigate();

    }

}