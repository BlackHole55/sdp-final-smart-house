package Creational.Factory;

import Devices.IDevice;
import HandBook.HandBookValues;

public abstract class DeviceFactory {
    public abstract IDevice createDevice(HandBookValues handBook);
}
