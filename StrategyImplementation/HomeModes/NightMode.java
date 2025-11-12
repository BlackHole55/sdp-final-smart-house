package StrategyImplementation.HomeModes;

import FacadeImplementation.ConcreteFacades.HeatingSystem;
import FacadeImplementation.ConcreteFacades.LightingSystem;
import FacadeImplementation.ConcreteFacades.SecuritySystem;
import StrategyImplementation.HomeModeStrategy;

public class NightMode implements HomeModeStrategy {
    @Override
    public void activate(LightingSystem light, HeatingSystem heating, SecuritySystem security){
        light.turnOff();
        heating.turnOn();
        heating.setNightTemperature();
        security.activateAlarm();
        security.lockDoors();
    }


}
