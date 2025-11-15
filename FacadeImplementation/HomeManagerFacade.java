package FacadeImplementation;

import StrategyImplementation.HomeModeStrategy;
import ConcreteDevices.*;

public class HomeManagerFacade {
    private AutomaticDoors automaticDoors;
    private Lighting lighting;
    private SecurityCamera securityCamera;
    private SmokeDetector smokeDetector;
    private Thermostat thermostat; 

    public HomeManagerFacade(AutomaticDoors doors, Lighting light, SecurityCamera camera, SmokeDetector smokeDetector, Thermostat thermostat){
        this.automaticDoors = doors;
        this.lighting = light;
        this.securityCamera = camera;
        this.smokeDetector = smokeDetector;
        this.thermostat = thermostat;
    }

    public void activateMode(HomeModeStrategy mode){
        mode.activate(automaticDoors, lighting, securityCamera, smokeDetector, thermostat);
    }

    public void showStatus(){
        System.out.println(automaticDoors.showStatus());
        System.out.println(lighting.showStatus());
        System.out.println(thermostat.showStatus());
        System.out.println(securityCamera.showStatus());
        System.out.println(smokeDetector.showStatus());

        
    }
}