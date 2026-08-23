class Employee {
    double salary;
    final String companyName;

    Employee(double salary, String companyName) {
        this.salary = salary;
        this.companyName = companyName;
    }

    double calculateBonus() {
        return salary * 0.05;
    }
}

class Manager extends Employee {

    Manager(double salary, String companyName) {
        super(salary, companyName);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}

class SeniorManager extends Manager {
    double retentionBonus;

    SeniorManager(double salary, String companyName, double retentionBonus) {
        super(salary, companyName);
        this.retentionBonus = retentionBonus;
    }

    @Override
    double calculateBonus() {
        return salary * 0.15 + retentionBonus;
    }
}

public class Q5 {
    public static void main(String[] args) {

        Employee e = new Employee(50000, "ABC");
        Manager m = new Manager(50000, "ABC");
        SeniorManager sm = new SeniorManager(50000, "ABC", 5000);

        System.out.println("Employee Bonus: " + e.calculateBonus());
        System.out.println("Manager Bonus: " + m.calculateBonus());
        System.out.println("Senior Manager Bonus: " + sm.calculateBonus());
        System.out.println("Company: " + sm.companyName);
    }
}