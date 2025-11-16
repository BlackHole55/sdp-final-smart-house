package Creational.Factory;

import ConcreteDevices.Thermostat;
import Devices.IDevice;
import HandBook.HandBookValues;

public class ThermostatFactory extends DeviceFactory {
    @Override
    public IDevice createDevice(HandBookValues handBook) {
        return new Thermostat
            .Builder(handBook)
            .withPowerState(false)
            .withTemperature(HandBookValues.DEFAULT_DAY_TEMPERATURE_CELSIUS)
            .build();
    }
}
