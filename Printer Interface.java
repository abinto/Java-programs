interface Printer {

    void print();

}
class InkjetPrinter implements Printer {

    public void print() {

        System.out.println("Printing Document...");

    }

}
public class Main {

    public static void main(String[] args) {

        Printer p = new InkjetPrinter();

        p.print();

    }

}