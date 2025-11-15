package StrategyImplementation.HomeModes;

import ConcreteDevices.*;
import HandBook.HandBook;
import StrategyImplementation.HomeModeStrategy;

public class DayMode implements HomeModeStrategy {
    @Override
    public void activate(AutomaticDoors doors, Lighting light, SecurityCamera camera, SmokeDetector smokeDetector, Thermostat thermostat){
        light.turnOn();
        doors.turnOn();
        camera.turnOn();
        smokeDetector.turnOn();
        thermostat.turnOn();
        thermostat.setTemperature(HandBook.DEFAULT_DAY_TEMPERATURE_CELSIUS);

        doors.unLockDoors();
        
    
    }

}