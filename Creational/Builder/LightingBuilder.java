package Creational.Builder;

import ConcreteDevices.Lighting;
import Creational.DeviceFactory;
import Creational.DeviceType;
import Devices.IDevice;

public class LightingBuilder{
    protected IDevice device;

    public LightingBuilder() {
        this.device = DeviceFactory.createDevice(DeviceType.LIGHTING);
    }

    public LightingBuilder withPowerState(boolean powerState) {
        if (powerState) {
            this.device.turnOn();
        }else {
            this.device.turnOff();
        }

        return this;
    }

    public LightingBuilder withBrightness(double brightness) {
        ((Lighting) device).setBrightness(brightness);

        return this;
    }

    public IDevice build() {
        return this.device;
    }
}
