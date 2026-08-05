// Abstract class for all rescue robots

abstract class RescueRobot {

    protected int robotId;
    protected String robotName;

    // Constructor
    public RescueRobot(int robotId, String robotName) {
        this.robotId = robotId;
        this.robotName = robotName;
    }

    // Concrete method
    public void displayDetails() {
        System.out.println("-----------------------------");
        System.out.println("Robot ID   : " + robotId);
        System.out.println("Robot Name : " + robotName);
    }

    // Concrete method
    public void startRobot() {
        System.out.println(robotName + " is now active.");
    }

    // Abstract method
    abstract void performMission();
}
// Interface for flying robots

interface Flyable {

    void fly();

}
// Interface for swimming robots

interface Swimmable {

    void swim();

}
// Interface for climbing robots

interface Climbable {

    void climb();

}
// Drone Rescue Robot

class DroneRobot extends RescueRobot implements Flyable {

    public DroneRobot(int id, String name) {
        super(id, name);
    }

    @Override
    public void fly() {
        System.out.println("Flying over the disaster area.");
    }

    @Override
    void performMission() {
        System.out.println("Searching for trapped people from the air.");
    }

}
// Water Rescue Robot

class WaterRobot extends RescueRobot implements Swimmable {

    public WaterRobot(int id, String name) {
        super(id, name);
    }

    @Override
    public void swim() {
        System.out.println("Swimming through flooded areas.");
    }

    @Override
    void performMission() {
        System.out.println("Rescuing victims from water.");
    }

}
// Mountain Rescue Robot

class MountainRobot extends RescueRobot implements Climbable {

    public MountainRobot(int id, String name) {
        super(id, name);
    }

    @Override
    public void climb() {
        System.out.println("Climbing rocky mountains.");
    }

    @Override
    void performMission() {
        System.out.println("Searching for stranded hikers.");
    }

}
// Hybrid Rescue Robot

class HybridRobot extends RescueRobot
        implements Flyable, Swimmable, Climbable {

    public HybridRobot(int id, String name) {
        super(id, name);
    }

    @Override
    public void fly() {
        System.out.println("Flying to the emergency location.");
    }

    @Override
    public void swim() {
        System.out.println("Crossing rivers and flood water.");
    }

    @Override
    public void climb() {
        System.out.println("Climbing steep hills.");
    }

    @Override
    void performMission() {
        System.out.println("Performing multi-purpose rescue operation.");
    }

}
public class Main {

    public static void main(String[] args) {

        // Abstract class references
        RescueRobot robots[] = {

                new DroneRobot(101, "SkyEye"),

                new WaterRobot(102, "AquaRescue"),

                new MountainRobot(103, "HillMaster"),

                new HybridRobot(104, "Titan")

        };

        System.out.println("===== RESCUE ROBOTS =====");

        for (RescueRobot robot : robots) {

            robot.displayDetails();

            robot.startRobot();

            robot.performMission();

            System.out.println();

        }

        System.out.println("===== INTERFACE REFERENCES =====");

        Flyable flyRobot = new HybridRobot(201, "Falcon");
        flyRobot.fly();

        Swimmable swimRobot = new HybridRobot(202, "Dolphin");
        swimRobot.swim();

        Climbable climbRobot = new HybridRobot(203, "Spider");
        climbRobot.climb();

    }

}