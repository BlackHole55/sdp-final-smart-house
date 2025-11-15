package StrategyImplementation.HomeModes;

import StrategyImplementation.HomeModeStrategy;
import ConcreteDevices.*;

public class LeavingHomeMode implements HomeModeStrategy {
    @Override
    public void activate(AutomaticDoors doors, Lighting light, SecurityCamera camera, SmokeDetector smokeDetector, Thermostat thermostat) {
        doors.turnOn();
        light.turnOff();
        camera.turnOn();
        smokeDetector.turnOn();
        thermostat.turnOff();

        doors.lockDoors();
    }

}
