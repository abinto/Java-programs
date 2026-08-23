class Device {

    final void powerOn() {
        System.out.println("Device is powered on");
    }
}

class Phone extends Device {

    void call(String number) {
        System.out.println("Calling " + number);
    }

    void installApp(String name) {
        System.out.println("Installing app: " + name);
    }
}

class Smartphone extends Phone {

    @Override
    void installApp(String name) {
        System.out.println("Installing smartphone app: " + name);
    }
}

public class Q6 {
    public static void main(String[] args) {

        Smartphone s = new Smartphone();

        s.powerOn();
        s.call("9876543210");
        s.installApp("WhatsApp");
    }
}