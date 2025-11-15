package StrategyImplementation.HomeModes;

import ConcreteDevices.*;
import StrategyImplementation.HomeModeStrategy;
import HandBook.HandBook;

public class NightMode implements HomeModeStrategy {
    @Override
    public void activate(AutomaticDoors doors, Lighting light, SecurityCamera camera, SmokeDetector smokeDetector, Thermostat thermostat){
        light.turnOff();
        doors.turnOn();
        camera.turnOn();
        smokeDetector.turnOn();
        thermostat.turnOn();

        doors.lockDoors();
        thermostat.setTemperature(HandBook.DEFAULT_NIGHT_TEMPERATURE_CELSIUS);
    
    }

}
