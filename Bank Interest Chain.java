class Account {

    double balance;
    final double MIN_BALANCE = 1000;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.06;
    }
}

class FixedDepositAccount extends SavingsAccount {

    double bonus;

    FixedDepositAccount(double balance, double bonus) {
        super(balance);
        this.bonus = bonus;
    }

    @Override
    double calculateInterest() {
        return super.calculateInterest() + balance * 0.02 + bonus;
    }
}

public class Q7 {
    public static void main(String[] args) {

        Account a = new Account(10000);
        SavingsAccount s = new SavingsAccount(10000);
        FixedDepositAccount f = new FixedDepositAccount(10000, 500);

        System.out.println("Account Interest: " + a.calculateInterest());
        System.out.println("Savings Interest: " + s.calculateInterest());
        System.out.println("Fixed Deposit Interest: " + f.calculateInterest());
        System.out.println("Minimum Balance: " + f.MIN_BALANCE);
    }
}