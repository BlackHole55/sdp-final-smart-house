package Behavioral.Strategy.HomeModes;

import java.util.ArrayList;

import Behavioral.Strategy.IHomeModeStrategy;
import ConcreteDevices.*;
import Devices.IDetector;
import Devices.IDevice;

public class LeavingHomeMode implements IHomeModeStrategy {
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
