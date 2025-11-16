package Devices;

public abstract class BaseDevice implements IDevice {
    protected boolean powerState;

    @Override
    public void turnOn() {
        powerState = true;
    }

    @Override
    public void turnOff() {
        powerState = false;
    }
    
    @Override
    public boolean isOn(){
        return powerState;
    }
}
