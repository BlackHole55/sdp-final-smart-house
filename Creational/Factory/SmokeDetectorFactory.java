package Creational.Factory;

import ConcreteDevices.SmokeDetector;
import Devices.IDevice;

public class SmokeDetectorFactory extends DeviceFactory {
    public IDevice createDevice() {
        return new SmokeDetector();
    }
}
