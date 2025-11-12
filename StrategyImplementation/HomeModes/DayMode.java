package StrategyImplementation.HomeModes;

import FacadeImplementation.ConcreteFacades.HeatingSystem;
import FacadeImplementation.ConcreteFacades.LightingSystem;
import FacadeImplementation.ConcreteFacades.SecuritySystem;
import StrategyImplementation.HomeModeStrategy;

public class DayMode implements HomeModeStrategy {
    @Override
    public void activate(LightingSystem light, HeatingSystem heating, SecuritySystem security){
        light.turnOn();
        heating.turnOn();
        heating.setDayTemperature();
        security.deactivateAlarm();
        security.unLockDoors();
    }

}