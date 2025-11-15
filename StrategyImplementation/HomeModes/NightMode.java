package StrategyImplementation.HomeModes;

import ConcreteDevices.*;
import StrategyImplementation.HomeModeStrategy;
import HandBook.HandBook;

public class NightMode implements HomeModeStrategy {
    @Override
    public void activate(AutomaticDoors doors, Lighting light, SecurityCamera camera, SmokeDetector smokeDetector, Thermostat thermostat) {
        doors.turnOn();
        light.turnOff();
        camera.turnOn();
        smokeDetector.turnOn();
        thermostat.turnOn();

        thermostat.setTemperature(HandBook.DEFAULT_NIGHT_TEMPERATURE_CELSIUS);

        doors.lockDoors();
    }
}
