package Behavioral.Strategy;

import Devices.IDetector;
import Devices.IDevice;
import java.util.ArrayList;

public interface IHomeModeStrategy {
    void activate(ArrayList<IDevice> devices, ArrayList<IDetector> detectors);
}
