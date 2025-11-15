package Devices;

public abstract class BaseDevice implements IDevice {
    protected boolean powerState;

    public void turnOn() {
        powerState = true;
    }

    public void turnOff() {
        powerState = false;
    }

  
    
    public boolean isOn(){
        return powerState;
    }
}
