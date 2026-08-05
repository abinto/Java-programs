// Interface for WiFi connection

interface WiFiEnabled {

    void connectWiFi();

}
// Interface for voice commands

interface VoiceControlled {

    void voiceCommand();

}
// Interface for music playing

interface MusicPlayer {

    void playMusic();

}
// Interface for video streaming

interface VideoStreaming {

    void streamVideo();

}
// Interface for temperature monitoring

interface TemperatureMonitor {

    void showTemperature();

}
// Smart Speaker

class SmartSpeaker implements WiFiEnabled,
                               VoiceControlled,
                               MusicPlayer {

    public void connectWiFi() {

        System.out.println("Smart Speaker connected to WiFi.");
    }

    public void voiceCommand() {

        System.out.println("Voice command recognized.");
    }

    public void playMusic() {

        System.out.println("Playing music.");
    }

}
// Smart TV

class SmartTV implements WiFiEnabled,
                          MusicPlayer,
                          VideoStreaming {

    public void connectWiFi() {

        System.out.println("Smart TV connected to WiFi.");
    }

    public void playMusic() {

        System.out.println("Playing music on TV.");
    }

    public void streamVideo() {

        System.out.println("Streaming online video.");
    }

}
// Smart Air Conditioner

class SmartAC implements WiFiEnabled,
                         VoiceControlled,
                         TemperatureMonitor {

    public void connectWiFi() {

        System.out.println("Smart AC connected to WiFi.");
    }

    public void voiceCommand() {

        System.out.println("Voice command accepted.");
    }

    public void showTemperature() {

        System.out.println("Current Temperature : 24°C");
    }

}
// Smart Watch

class SmartWatch implements WiFiEnabled,
                            TemperatureMonitor {

    public void connectWiFi() {

        System.out.println("Smart Watch connected to WiFi.");
    }

    public void showTemperature() {

        System.out.println("Body Temperature : 36.8°C");
    }

}
// Smart Car

class SmartCar implements WiFiEnabled,
                          VoiceControlled,
                          MusicPlayer,
                          VideoStreaming {

    public void connectWiFi() {

        System.out.println("Smart Car connected to WiFi.");
    }

    public void voiceCommand() {

        System.out.println("Navigation started using voice.");
    }

    public void playMusic() {

        System.out.println("Playing music inside the car.");
    }

    public void streamVideo() {

        System.out.println("Streaming entertainment for passengers.");
    }

}
public class Main {

    public static void main(String[] args) {

        SmartSpeaker speaker = new SmartSpeaker();

        SmartTV tv = new SmartTV();

        SmartAC ac = new SmartAC();

        SmartWatch watch = new SmartWatch();

        SmartCar car = new SmartCar();

        System.out.println("===== SMART SPEAKER =====");

        speaker.connectWiFi();
        speaker.voiceCommand();
        speaker.playMusic();

        System.out.println();

        System.out.println("===== SMART TV =====");

        tv.connectWiFi();
        tv.playMusic();
        tv.streamVideo();

        System.out.println();

        System.out.println("===== SMART AC =====");

        ac.connectWiFi();
        ac.voiceCommand();
        ac.showTemperature();

        System.out.println();

        System.out.println("===== SMART WATCH =====");

        watch.connectWiFi();
        watch.showTemperature();

        System.out.println();

        System.out.println("===== SMART CAR =====");

        car.connectWiFi();
        car.voiceCommand();
        car.playMusic();
        car.streamVideo();

    }

}