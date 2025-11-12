package Creational.Factory;

import ConcreteDevices.SmokeDetector;
import Devices.IDetector;

public class SmokeDetectorFactory extends DetectorFactory {
    @Override
    public IDetector createDetector() {
        return new SmokeDetector();
    }
}
