package Creational.Builder;

import ConcreteDevices.Lighting;
import Creational.Factory.LightingFactory;

public class LightingBuilder{
    protected Lighting device;

    public LightingBuilder() {
        LightingFactory lightingFactory = new LightingFactory();
        this.device = (Lighting) lightingFactory.createDevice();
    }

    public LightingBuilder withPowerState(boolean powerState) {
        if (powerState) {
            this.device.turnOn();
        }else {
            this.device.turnOff();
        }

        return this;
    }

    public LightingBuilder withBrightness(int brightness) {
        device.setBrightness(brightness);

        return this;
    }

    public Lighting build() {
        return this.device;
    }
}
