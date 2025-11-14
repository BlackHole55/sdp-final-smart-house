package Creational.Builder;

import ConcreteDevices.Thermostat;
import Creational.Factory.ThermostatFactory;

public class ThermostatBuilder {
    protected Thermostat device;

    public ThermostatBuilder() {
        ThermostatFactory thermostatFactory = new ThermostatFactory();
        this.device = (Thermostat) thermostatFactory.createDevice();
    }

    public ThermostatBuilder withPowerState(boolean powerState) {
        if (powerState) {
            this.device.turnOn();
        }else {
            this.device.turnOff();
        }

        return this;
    }

    public ThermostatBuilder withTemperature(float temperature) {
        device.setTemperature(temperature);

        return this;
    }

    public Thermostat build() {
        return this.device;
    }
}
