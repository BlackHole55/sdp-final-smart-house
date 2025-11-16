import Creational.Factory.AutomaticDoorsFactory;
import Creational.Factory.LightingFactory;
import Creational.Factory.SecurityCameraFactory;
import Creational.Factory.SmokeDetectorFactory;
import ConcreteDevices.SecurityCamera;
import ConcreteDevices.Thermostat;
import Devices.IDetector;
import Devices.IDevice;
import FacadeImplementation.HomeManagerFacade;
import StrategyImplementation.HomeModes.LeavingHomeMode;
import HandBook.HandBook;
import StrategyImplementation.HomeModes.NightMode;
import StrategyImplementation.HomeModes.DayMode;
import Observer.ConcreteObservers.*;
import Structural.Adapter.Adapter.ThermostatAdapter;
import Structural.Adapter.Service.OldThermostat;
import Structural.Decorator.ConcreteDecorator.MotionTrackingCamera;
import Structural.Decorator.ConcreteDecorator.NightVisionCamera;
import Structural.Decorator.ConcreteDecorator.ZoomCamera;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HandBook handBook = new HandBook();


        System.out.println("=== Device Creation ===");

        LightingFactory lightingFactory1 = new LightingFactory();
        IDevice light1 = lightingFactory1.createDevice(handBook);

        IDevice thermostat1 = new Thermostat
            .Builder(handBook)
            .withPowerState(true)
            .withTemperature(25)
            .build();

        AutomaticDoorsFactory automaticDoorsFactory1 = new AutomaticDoorsFactory();
        IDevice automaticDoors1 = automaticDoorsFactory1.createDevice(handBook);

        SmokeDetectorFactory smokeDetectorFactory1 = new SmokeDetectorFactory();
        IDetector smokeDetector1 = smokeDetectorFactory1.createDetector();
        
        SecurityCameraFactory securityCameraFactory1 = new SecurityCameraFactory();
        IDetector camera1 = securityCameraFactory1.createDetector();

        System.out.println(light1.showStatus());
        System.out.println(thermostat1.showStatus());
        System.out.println(automaticDoors1.showStatus());
        System.out.println(smokeDetector1.showStatus());
        System.out.println(camera1.showStatus());
        System.out.println();


        System.out.println("=== Home Mode Strategy ===");
        ArrayList<IDevice> devices = new ArrayList<>();
        ArrayList<IDetector> detectors = new ArrayList<>();

        devices.add(thermostat1);
        devices.add(light1);
        devices.add(automaticDoors1);
        
        detectors.add(smokeDetector1);
        detectors.add(camera1);

        HomeManagerFacade homeManager = new HomeManagerFacade(devices, detectors);

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
        System.out.println();
        FireObserver fireObserver1 = new FireObserver();
        smokeDetector1.addObserver(fireObserver1);
        smokeDetector1.turnOn();
        smokeDetector1.setDetected(true);
        smokeDetector1.detect();

        PresenceDetectionObserver presenceDetectionObserver1 = new PresenceDetectionObserver();
        camera1.addObserver(presenceDetectionObserver1);
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
        System.out.println();


        System.out.println("===  Old Thermostat  ===");
        OldThermostat oldThermo = new OldThermostat();
        IDevice adaptedThermo = new ThermostatAdapter(oldThermo);
        adaptedThermo.turnOn();
        System.out.println(adaptedThermo.showStatus());

        System.out.println();

        System.out.println("\n=== Security Camera Enhancements ===");

        camera1.setAlarmState(false);



        IDevice zoomCamera = new ZoomCamera(camera1);
        System.out.println(HandBook.camera_base_status +" " + zoomCamera.showStatus());

        IDevice nightCamera = new NightVisionCamera(zoomCamera);
        System.out.println(HandBook.camera_base_status +" " + nightCamera.showStatus());

        IDevice fullCamera = new MotionTrackingCamera(nightCamera);
        System.out.println(HandBook.camera_base_status +" " + fullCamera.showStatus());
    }
}