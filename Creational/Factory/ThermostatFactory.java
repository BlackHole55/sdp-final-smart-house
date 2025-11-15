package Creational.Factory;

import ConcreteDevices.Thermostat;
import Devices.IDevice;
import HandBook.HandBook;

public class ThermostatFactory extends DeviceFactory {
    @Override
    public IDevice createDevice(HandBook handBook) {
        return new Thermostat
            .Builder(handBook)
            .withPowerState(false)
            .withTemperature(HandBook.DEFAULT_DAY_TEMPERATURE_CELSIUS)
            .build();
    }
}
