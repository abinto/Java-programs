interface Playable {

    void play();
}

class Violin implements Playable {

    public void play() {
        System.out.println("Playing violin");
    }
}

class Drum implements Playable {

    public void play() {
        System.out.println("Playing drum");
    }
}

public class Main {

    public static void main(String[] args) {

        Playable p1 = new Violin();
        Playable p2 = new Drum();

        p1.play();
        p2.play();
    }
}