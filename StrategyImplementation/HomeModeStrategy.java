package StrategyImplementation;

import Devices.IDetector;
import Devices.IDevice;
import java.util.ArrayList;

public interface HomeModeStrategy {
    void activate(ArrayList<IDevice> devices, ArrayList<IDetector> detectors);
}
