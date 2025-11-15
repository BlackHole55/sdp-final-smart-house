package Creational.Factory;

import ConcreteDevices.Lighting;
import Devices.IDevice;
import HandBook.HandBook;

public class LightingFactory extends DeviceFactory {
    @Override
    public IDevice createDevice(HandBook handBook) {
        return new Lighting
            .Builder(handBook)
            .withPowerState(false)
            .withBrightness(HandBook.DEFAULT_LIGHTING_BRIGHTNESS)
            .build();
    }
}
