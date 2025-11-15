package Creational.Factory;

import Devices.IDevice;
import HandBook.HandBook;

public abstract class DeviceFactory {
    public abstract IDevice createDevice(HandBook handBook);
}
