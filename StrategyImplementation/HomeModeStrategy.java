package StrategyImplementation;

import FacadeImplementation.ConcreteFacades.HeatingSystem;
import FacadeImplementation.ConcreteFacades.LightingSystem;
import FacadeImplementation.ConcreteFacades.SecuritySystem;

public interface HomeModeStrategy {
    void activate(LightingSystem light, HeatingSystem heating, SecuritySystem security);
}
