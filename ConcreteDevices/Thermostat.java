package ConcreteDevices;

import Devices.BaseDevice;

public class Thermostat extends BaseDevice{
    private float temperature;

    public float getTemperature() {
        return this.temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}
