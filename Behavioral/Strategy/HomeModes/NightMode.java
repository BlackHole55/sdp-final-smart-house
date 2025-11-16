package Behavioral.Strategy.HomeModes;

import java.util.ArrayList;

import Behavioral.Strategy.IHomeModeStrategy;
import ConcreteDevices.*;
import Devices.IDetector;
import Devices.IDevice;
import HandBook.HandBookValues;

public class NightMode implements IHomeModeStrategy {
    @Override
    public void activate(ArrayList<IDevice> devices, ArrayList<IDetector> detectors) {
        for (IDevice device : devices) {
            device.turnOff();

            if (device instanceof Thermostat) {
                device.turnOn();
                ((Thermostat)device).setTemperature(HandBookValues.DEFAULT_NIGHT_TEMPERATURE_CELSIUS);
            }else if (device instanceof AutomaticDoors) {
                device.turnOn();
                ((AutomaticDoors)device).lockDoors();
            }
        }

        for (IDetector detector : detectors) {
            detector.turnOn();
        }
    }
}
