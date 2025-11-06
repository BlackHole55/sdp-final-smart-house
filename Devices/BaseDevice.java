package Devices;

public abstract class BaseDevice implements IDevice {
    private boolean powerState;
    private final String POWER_ON = "On";
    private final String POWER_OFF = "Off"; 

    public void turnOn() {
        powerState = true;
    }

    public void turnOff() {
        powerState = false;
    }

    public String showStatus() {
        if (powerState) {
            return POWER_ON;
        }else {
            return POWER_OFF;
        }
    }
}
