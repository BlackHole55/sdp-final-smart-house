package ConcreteDevices;

import Devices.BaseDevice;

public class Thermostat extends BaseDevice{
    private double temperature;

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
