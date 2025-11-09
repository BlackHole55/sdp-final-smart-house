package Creational;

import ConcreteDevices.Lighting;
import ConcreteDevices.SecurityCamera;
import ConcreteDevices.SmokeDetector;
import ConcreteDevices.Thermostat;
import Devices.IDevice;

public class DeviceFactory {
    
    public static IDevice createDevice(DeviceType type) {
        switch (type) {
            case LIGHTING:
                return new Lighting();
            case SECURITY_CAMERA:
                return new SecurityCamera();
            case SMOKE_DETECTOR:
                return new SmokeDetector();
            case THERMOSTAT:
                return new Thermostat();
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}