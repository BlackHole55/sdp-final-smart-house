package FacadeImplementation;

import FacadeImplementation.ConcreteFacades.HeatingSystem;
import FacadeImplementation.ConcreteFacades.LightingSystem;
import FacadeImplementation.ConcreteFacades.SecuritySystem;
import HandBook.HandBook;
import StrategyImplementation.HomeModeStrategy;

public class HomeManagerFacade {
    private LightingSystem lights;
    private HeatingSystem heating;
    private SecuritySystem security;

    public HomeManagerFacade(HandBook handBook){
        this.lights = new LightingSystem();
        this.heating = new HeatingSystem(handBook);
        this.security = new SecuritySystem();
    }

    public void activateMode(HomeModeStrategy mode){
        mode.activate(lights, heating, security);
    }

    public void showStatus(){
        System.out.println(lights.getStatus());
        System.out.println(heating.getStatus());
        System.out.println(security.getStatus());
    }
}