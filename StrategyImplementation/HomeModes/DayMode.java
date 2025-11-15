package StrategyImplementation.HomeModes;

import java.util.ArrayList;

import ConcreteDevices.*;
import Devices.IDetector;
import Devices.IDevice;
import HandBook.HandBook;
import StrategyImplementation.HomeModeStrategy;

public class DayMode implements HomeModeStrategy {
    @Override
    public void activate(ArrayList<IDevice> devices, ArrayList<IDetector> detectors) {
        for (IDevice device : devices) {
            device.turnOn();

            if (device instanceof Thermostat) {
                ((Thermostat)device).setTemperature(HandBook.DEFAULT_DAY_TEMPERATURE_CELSIUS);
            }else if (device instanceof AutomaticDoors) {
                ((AutomaticDoors)device).unLockDoors();
            }
        }

        for (IDetector detector : detectors) {
            detector.turnOn();
        }
    }

}