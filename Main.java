import Creational.DetectorType;
import Creational.DeviceBuilder;
import Creational.DeviceFactory;
import Creational.DeviceType;
import Devices.IDetector;
import Devices.IDevice;
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
        IDevice light = new DeviceBuilder(DeviceType.LIGHTING)
                .withPowerState(true)
                .withBrightness(75)
                .build();

        IDevice thermostat = new DeviceBuilder(DeviceType.THERMOSTAT)
                .withPowerState(true)
                .withTemperature(23)
                .build();

        System.out.println("Lighting status: " + light.showStatus());
        System.out.println("Thermostat status: " + thermostat.showStatus());
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

        IDetector smoke = DeviceFactory.createDetector(DetectorType.SECURITY_CAMERA);
        smoke.addObserver(new FireObserver(security));
        smoke.turnOn();
        smoke.setDetected(true);
        smoke.detect();

        System.out.println();

        IDetector camera = DeviceFactory.createDetector(DetectorType.SMOKE_DETECTOR);
        camera.addObserver(new PresenceDetectionObserver(security));
        camera.turnOn();
        camera.setDetected(true);
        camera.detect();

        System.out.println();

        System.out.println("=== Final System Status ===");
        homeManager.showStatus();
    }
}


