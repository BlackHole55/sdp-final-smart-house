package Creational.Builder;

import ConcreteDevices.Thermostat;
import Creational.Factory.ThermostatFactory;

public class ThermostatBuilder {
    protected Thermostat thermostat;

    public ThermostatBuilder() {
        ThermostatFactory thermostatFactory = new ThermostatFactory();
        this.thermostat = (Thermostat) thermostatFactory.createDevice();
    }

    public ThermostatBuilder withPowerState(boolean powerState) {
        if (powerState) {
            this.thermostat.turnOn();
        }else {
            this.thermostat.turnOff();
        }

        return this;
    }

    public ThermostatBuilder withTemperature(float temperature) {
        thermostat.setTemperature(temperature);

        return this;
    }

    public Thermostat build() {
        return this.thermostat;
    }
}
