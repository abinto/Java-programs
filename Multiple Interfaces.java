interface Camera {

    void takePhoto();

}
interface Music {

    void playMusic();

}
class Smartphone implements Camera, Music {

    public void takePhoto() {

        System.out.println("Photo Captured");

    }

    public void playMusic() {

        System.out.println("Music Playing");

    }

}
public class Main {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.takePhoto();

        phone.playMusic();

    }

}