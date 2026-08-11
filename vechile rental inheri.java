class Vehicle {
    String regNo;
    double dailyRate;

    Vehicle(String regNo, double dailyRate) {
        this.regNo = regNo;
        this.dailyRate = dailyRate;
    }

    double computeRent(int days) {
        return dailyRate * days;
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(String regNo, double dailyRate, int numDoors) {
        super(regNo, dailyRate);
        this.numDoors = numDoors;
    }

    @Override
    double computeRent(int days) {
        return super.computeRent(days) + 200;
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("KL01AB1234", 1000, 4);

        System.out.println("Rent = " + c.computeRent(3));
    }
}