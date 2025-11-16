package Creational.Factory;

import ConcreteDevices.AutomaticDoors;
import Devices.IDevice;
import HandBook.HandBookValues;

public class AutomaticDoorsFactory extends DeviceFactory {
    @Override
    public IDevice createDevice(HandBookValues handBook) {
        return new AutomaticDoors();
    }
}
