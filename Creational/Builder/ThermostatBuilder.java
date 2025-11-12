package Creational.Builder;

import ConcreteDevices.Thermostat;
import Creational.Factory.ThermostatFactory;
import Devices.IDevice;

public class ThermostatBuilder {
    protected IDevice device;

    public ThermostatBuilder() {
        ThermostatFactory thermostatFactory = new ThermostatFactory(); 
        this.device = thermostatFactory.createDevice();
    }

    public ThermostatBuilder withPowerState(boolean powerState) {
        if (powerState) {
            this.device.turnOn();
        }else {
            this.device.turnOff();
        }

        return this;
    }

    public ThermostatBuilder withTemperature(double temperature) {
        ((Thermostat) device).setTemperature(temperature);

        return this;
    }

    public IDevice build() {
        return this.device;
    }
}
