package Creational.Factory;

import ConcreteDevices.Lighting;
import Devices.IDevice;
import HandBook.HandBookValues;

public class LightingFactory extends DeviceFactory {
    @Override
    public IDevice createDevice(HandBookValues handBook) {
        return new Lighting
            .Builder(handBook)
            .withPowerState(false)
            .withBrightness(HandBookValues.DEFAULT_LIGHTING_BRIGHTNESS)
            .build();
    }
}
