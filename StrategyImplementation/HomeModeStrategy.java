package StrategyImplementation;

import ConcreteDevices.*;


public interface HomeModeStrategy {
    void activate(AutomaticDoors doors, Lighting light, SecurityCamera camera, SmokeDetector smokeDetector, Thermostat thermostat);
}
