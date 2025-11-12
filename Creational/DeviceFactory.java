package Creational;

import ConcreteDevices.Lighting;
import ConcreteDevices.SecurityCamera;
import ConcreteDevices.SmokeDetector;
import ConcreteDevices.Thermostat;
import Devices.IDetector;
import Devices.IDevice;

public class DeviceFactory {
    
    public static IDevice createDevice(DeviceType type) {
        switch (type) {
            case LIGHTING:
                return new Lighting();
            case THERMOSTAT:
                return new Thermostat();
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }

    public static IDetector createDetector(DetectorType type) {
        switch (type) {
            case SECURITY_CAMERA:
                return new SecurityCamera();
            case SMOKE_DETECTOR:
                return new SmokeDetector();
            default:
                throw new IllegalArgumentException("Unkown detector type: " + type);
        }
    }
}