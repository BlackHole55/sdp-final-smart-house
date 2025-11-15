package StrategyImplementation.HomeModes;

import StrategyImplementation.HomeModeStrategy;

import java.util.ArrayList;

import ConcreteDevices.*;
import Devices.IDetector;
import Devices.IDevice;

public class LeavingHomeMode implements HomeModeStrategy {
    @Override
    public void activate(ArrayList<IDevice> devices, ArrayList<IDetector> detectors) {
        for (IDevice device : devices) {
            device.turnOff();

            if (device instanceof AutomaticDoors) {
                device.turnOn();
                ((AutomaticDoors)device).lockDoors();
            }
        }

        for (IDetector detector : detectors) {
            detector.turnOn();
        }
    }

}
