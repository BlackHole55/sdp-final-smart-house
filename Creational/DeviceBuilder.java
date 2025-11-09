package Creational;

import ConcreteDevices.Lighting;
import ConcreteDevices.Thermostat;
import Devices.IDevice;

public class DeviceBuilder {
    private IDevice device;

    public DeviceBuilder(DeviceType type) {
        this.device = DeviceFactory.createDevice(type);
    }

    public DeviceBuilder withPowerState(boolean powerState) {
        if (powerState) {
            this.device.turnOn();
        }else {
            this.device.turnOff();
        }

        return this;
    }

    public DeviceBuilder withBrightness(double brightness) {
        if (this.device instanceof Lighting) {
            ((Lighting) device).setBrightness(brightness);
        }else {
            System.out.println("Brightness can only be set for Lighting devices");
        }

        return this;
    }

    public DeviceBuilder withTemperature(double temperature) {
        if (this.device instanceof Thermostat) {
            ((Thermostat) device).setTemperature(temperature);
        }else {
            System.out.println("Temperature can only be set for Thermostat devices");
        }

        return this;
    }

    public IDevice build() {
        return this.device;
    }
}
