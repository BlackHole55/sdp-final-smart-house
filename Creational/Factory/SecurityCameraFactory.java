package Creational.Factory;

import ConcreteDevices.SecurityCamera;
import Devices.IDetector;

public class SecurityCameraFactory extends DetectorFactory {
    @Override
    public IDetector createDetector() {
        return new SecurityCamera();
    }
}
