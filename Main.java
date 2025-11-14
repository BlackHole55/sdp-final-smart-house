import Creational.Builder.LightingBuilder;
import Creational.Builder.ThermostatBuilder;
import Creational.Factory.SecurityCameraFactory;
import Creational.Factory.SmokeDetectorFactory;
import ConcreteDevices.Lighting;
import ConcreteDevices.Thermostat;
import Devices.IDetector;
import FacadeImplementation.ConcreteFacades.SecuritySystem;
import FacadeImplementation.HomeManagerFacade;
import StrategyImplementation.HomeModes.LeavingHomeMode;
import HandBook.HandBook;
import StrategyImplementation.HomeModes.NightMode;
import StrategyImplementation.HomeModes.DayMode;
import Observer.ConcreteObservers.*;

public class Main {
    public static void main(String[] args) {
        HandBook handBook = new HandBook();

        HomeManagerFacade homeManager = new HomeManagerFacade(handBook);

        System.out.println("=== Device Builder===");
        Lighting light = new LightingBuilder()
                .withPowerState(true)
                .withBrightness(75)
                .build();

        Thermostat thermostat = new ThermostatBuilder()
                .withPowerState(true)
                .withTemperature(23)
                .build();

        System.out.println("Lighting status: " + light.showStatus());
        System.out.println("Lighting brightness: " + light.getBrightness());
        System.out.println("Thermostat status: " + thermostat.showStatus());
        System.out.println("Thermostat temperature: " + thermostat.getTemperature());
        System.out.println();

        System.out.println("=== Home Mode Strategy ===");

        System.out.println("\n-- Switching to Day Mode --");
        homeManager.activateMode(new DayMode());
        homeManager.showStatus();

        System.out.println("\n-- Switching to Night Mode --");
        homeManager.activateMode(new NightMode());
        homeManager.showStatus();

        System.out.println("\n-- Switching to Leaving Home Mode --");
        homeManager.activateMode(new LeavingHomeMode());
        homeManager.showStatus();

        System.out.println();

        System.out.println("=== Observer Pattern ===");
        SecuritySystem security = new SecuritySystem();
        
        SmokeDetectorFactory smokeDetectorFactory = new SmokeDetectorFactory();
        IDetector smoke = smokeDetectorFactory.createDetector();
        smoke.addObserver(new FireObserver(security));
        smoke.turnOn();
        smoke.setDetected(true);
        smoke.detect();

        System.out.println();

        SecurityCameraFactory securityCameraFactory = new SecurityCameraFactory();
        IDetector camera = securityCameraFactory.createDetector();
        camera.addObserver(new PresenceDetectionObserver(security));
        camera.turnOn();
        camera.setDetected(true);
        camera.detect();

        System.out.println();

        System.out.println("=== Final System Status ===");
        homeManager.showStatus();
    }
}


