package Creational.Builder;

import ConcreteDevices.Thermostat;
import Creational.DeviceFactory;
import Creational.DeviceType;
import Devices.IDevice;

public class ThermostatBuilder {
    protected IDevice device;

    public ThermostatBuilder() {
        this.device = DeviceFactory.createDevice(DeviceType.THERMOSTAT);
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
