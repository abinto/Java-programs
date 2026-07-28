interface Calculator {

    void add(int a, int b);

}
class SimpleCalculator implements Calculator {

    public void add(int a, int b) {

        System.out.println("Sum = " + (a + b));

    }

}
public class Main {

    public static void main(String[] args) {

        Calculator c = new SimpleCalculator();

        c.add(10, 20);

    }

}