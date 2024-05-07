package Light;

public class Bulb {
    private boolean isOn;

    // Constructor
    public Bulb() {
        this.isOn = false; // Initially, the bulb is off
    }

    // Method to turn on the bulb
    public void turnOn() {
        this.isOn = true;
    }

    // Method to turn off the bulb
    public void turnOff() {
        this.isOn = false;
    }

    // Method to check if the bulb is on
    public boolean isOn() {
        return isOn;
    }
}
