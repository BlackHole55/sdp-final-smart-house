package Creational.Factory;

import ConcreteDevices.Thermostat;
import Devices.IDevice;

public class ThermostatFactory extends DeviceFactory {
    @Override
    public IDevice createDevice() {
        return new Thermostat();
    }
}
