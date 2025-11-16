package Structural.Facade;

import java.util.ArrayList;

import Behavioral.Strategy.IHomeModeStrategy;
import Devices.IDetector;
import Devices.IDevice;

public class HomeManagerFacade {
    private ArrayList<IDevice> devices;
    private ArrayList<IDetector> detectors;

    public HomeManagerFacade(ArrayList<IDevice> devices, ArrayList<IDetector> detectors) {
        this.devices = devices;
        this.detectors = detectors;
    }

    public void activateMode(IHomeModeStrategy mode){
        mode.activate(devices, detectors);
    }

    public void showStatus(){
        for (IDevice device : devices) {
            System.out.println(device.showStatus());
        }

        for (IDetector detector : detectors) {
            System.out.println(detector.showStatus());
        }
    }
}