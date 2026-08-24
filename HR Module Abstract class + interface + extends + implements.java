abstract class Employee {

    abstract double calculateSalary();
}

interface Taxable {

    double calculateTax();
}

class FullTimeEmployee extends Employee implements Taxable {

    double basicSalary;

    FullTimeEmployee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double calculateSalary() {
        return basicSalary;
    }

    @Override
    public double calculateTax() {
        return basicSalary * 0.10;
    }
}

public class Q11 {

    public static void main(String[] args) {

        FullTimeEmployee emp =
            new FullTimeEmployee(50000);

        System.out.println("Salary: " +
            emp.calculateSalary());

        System.out.println("Tax: " +
            emp.calculateTax());
    }
}