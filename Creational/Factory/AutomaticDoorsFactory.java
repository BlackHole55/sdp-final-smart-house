package Creational.Factory;

import ConcreteDevices.AutomaticDoors;
import Devices.IDevice;
import HandBook.HandBook;

public class AutomaticDoorsFactory extends DeviceFactory {
    public IDevice createDevice(HandBook handBook) {
        return new AutomaticDoors();
    }
}
