package Creational.Factory;

import ConcreteDevices.SecurityCamera;
import Devices.IDevice;

public class SecurityCameraFactory extends DeviceFactory {
    @Override
    public IDevice createDevice() {
        return new SecurityCamera();
    }
}
