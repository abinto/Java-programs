interface Playable {

    void play();

    void stop();
}

class AudioFile implements Playable {

    @Override
    public void play() {
        System.out.println("Playing audio");
    }

    @Override
    public void stop() {
        System.out.println("Audio stopped");
    }
}

class VideoFile implements Playable {

    @Override
    public void play() {
        System.out.println("Playing video");
    }

    @Override
    public void stop() {
        System.out.println("Video stopped");
    }
}

public class Q10 {

    public static void main(String[] args) {

        Playable[] media = {
            new AudioFile(),
            new VideoFile()
        };

        for (Playable p : media) {
            p.play();
            p.stop();
        }
    }
}