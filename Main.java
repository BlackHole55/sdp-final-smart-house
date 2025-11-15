import Creational.Builder.LightingBuilder;
import Creational.Builder.ThermostatBuilder;
import Creational.Factory.SecurityCameraFactory;
import Creational.Factory.SmokeDetectorFactory;
import ConcreteDevices.AutomaticDoors;
import ConcreteDevices.Lighting;
import ConcreteDevices.SecurityCamera;
import ConcreteDevices.SmokeDetector;
import ConcreteDevices.Thermostat;
import Devices.IDetector;
import FacadeImplementation.HomeManagerFacade;
import StrategyImplementation.HomeModes.LeavingHomeMode;
import HandBook.HandBook;
import StrategyImplementation.HomeModes.NightMode;
import StrategyImplementation.HomeModes.DayMode;
import Observer.ConcreteObservers.*;

public class Main {
    public static void main(String[] args) {
        HandBook handBook = new HandBook();

        System.out.println("=== Device Builder===");

        Lighting light1 = new LightingBuilder()
                .withPowerState(true)
                .build();
        light1.setHandbook(handBook);
        light1.setBrightness(23);

        Thermostat thermostat1 = new ThermostatBuilder()
                .withPowerState(true)
                .build();
        thermostat1.setHandbook(handBook);
        thermostat1.setTemperature(50);

        System.out.println(light1.showStatus());
        System.out.println(thermostat1.showStatus());
        System.out.println();

        AutomaticDoors doors1 = new AutomaticDoors();
        SmokeDetectorFactory smokeDetectorFactory = new SmokeDetectorFactory();
        IDetector smokeDetector1 = smokeDetectorFactory.createDetector();
        SmokeDetector smokeDetectorCon1 = (SmokeDetector) smokeDetector1;

        SecurityCameraFactory securityCameraFactory = new SecurityCameraFactory();
        IDetector camera1 = securityCameraFactory.createDetector();
        SecurityCamera cameraCon1 = (SecurityCamera) camera1;

        System.out.println("=== Home Mode Strategy ===");
        HomeManagerFacade homeManager = new HomeManagerFacade(doors1, light1, cameraCon1, smokeDetectorCon1, thermostat1);

        System.out.println("\n-- Switching to Day Mode --");
        DayMode dayMode1 = new DayMode();
        homeManager.activateMode(dayMode1);
        homeManager.showStatus();

        System.out.println("\n-- Switching to Night Mode --");
        NightMode nightMode1 = new NightMode();
        homeManager.activateMode(nightMode1);
        homeManager.showStatus();

        System.out.println();
        System.out.println("=== Testing Detectors (Observer Pattern) ===");
        
        smokeDetector1.addObserver(new FireObserver(smokeDetectorCon1));
        smokeDetector1.turnOn();
        smokeDetector1.setDetected(true);
        smokeDetector1.detect();

        System.out.println();

        camera1.addObserver(new PresenceDetectionObserver(cameraCon1));
        camera1.turnOn();
        camera1.setDetected(true);
        camera1.detect();

        System.out.println();

        System.out.println("\n-- Switching to Leaving Home Mode --");
        LeavingHomeMode leavingHomeMode1 = new LeavingHomeMode();
        homeManager.activateMode(leavingHomeMode1);
        homeManager.showStatus();

        System.out.println();

        

        System.out.println("=== Final System Status ===");
        homeManager.showStatus();
    }
}


