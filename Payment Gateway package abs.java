abstract class PaymentMethod {

    abstract void pay(double amount);
}

class CreditCard extends PaymentMethod {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class UPI extends PaymentMethod {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

public class Q9 {

    public static void main(String[] args) {

        PaymentMethod p1 = new CreditCard();
        PaymentMethod p2 = new UPI();

        p1.pay(5000);
        p2.pay(2500);
    }
}