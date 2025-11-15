package StrategyImplementation.HomeModes;

import java.util.ArrayList;

import ConcreteDevices.*;
import Devices.IDetector;
import Devices.IDevice;
import StrategyImplementation.HomeModeStrategy;
import HandBook.HandBook;

public class NightMode implements HomeModeStrategy {
    @Override
    public void activate(ArrayList<IDevice> devices, ArrayList<IDetector> detectors) {
        for (IDevice device : devices) {
            device.turnOff();

            if (device instanceof Thermostat) {
                device.turnOn();
                ((Thermostat)device).setTemperature(HandBook.DEFAULT_NIGHT_TEMPERATURE_CELSIUS);
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
