package Creational.Factory;

import ConcreteDevices.Lighting;
import Devices.IDevice;

public class LightingFactory extends DeviceFactory {
    @Override
    public IDevice createDevice() {
        return new Lighting();
    }
}
