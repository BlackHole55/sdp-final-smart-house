package Behavioral.Strategy.HomeModes;

import java.util.ArrayList;

import Behavioral.Strategy.IHomeModeStrategy;
import ConcreteDevices.*;
import Devices.IDetector;
import Devices.IDevice;
import HandBook.HandBookValues;

public class DayMode implements IHomeModeStrategy {
    @Override
    public void activate(ArrayList<IDevice> devices, ArrayList<IDetector> detectors) {
        for (IDevice device : devices) {
            device.turnOn();

            if (device instanceof Thermostat) {
                ((Thermostat)device).setTemperature(HandBookValues.DEFAULT_DAY_TEMPERATURE_CELSIUS);
            }else if (device instanceof AutomaticDoors) {
                ((AutomaticDoors)device).unLockDoors();
            }
        }

        for (IDetector detector : detectors) {
            detector.turnOn();
        }
    }

}