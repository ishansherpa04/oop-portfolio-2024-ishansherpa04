package Light;

public class Lights {
    public static void main(String[] args) {
        // Instantiating Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();

        // Turning on bulb1
        bulb1.turnOn();

        // Checking the status of bulbs
        System.out.println("Bulb 1 is on: " + bulb1.isOn());
        System.out.println("Bulb 2 is on: " + bulb2.isOn());

        // Turning off bulb2
        bulb2.turnOff();

        // Checking the status of bulbs again
        System.out.println("Bulb 1 is on: " + bulb1.isOn());
        System.out.println("Bulb 2 is on: " + bulb2.isOn());
    }
}
