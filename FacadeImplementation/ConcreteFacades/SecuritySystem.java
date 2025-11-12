package FacadeImplementation.ConcreteFacades;

import ConcreteDevices.SecurityCamera;
import ConcreteDevices.SmokeDetector;
import Observer.ConcreteObservers.*;


public class SecuritySystem {
    private SmokeDetector smokeDetector;
    private SecurityCamera camera;
    private boolean doorsLocked;
    private boolean alarmActive;


    public SecuritySystem(){
        smokeDetector = new SmokeDetector();
        camera = new SecurityCamera();

        smokeDetector.addObserver(new FireObserver(this));
        camera.addObserver(new PresenceDetectionObserver(this));

        smokeDetector.turnOn();
        camera.turnOn();

    }

    public void lockDoors(){
        doorsLocked = true;
    }
    public void unLockDoors(){
        doorsLocked = false;
    }

    public void activateAlarm(){
        alarmActive = true;
    }
    public void deactivateAlarm(){
        alarmActive = false;
    }
    public String getStatus(){
        return "Guard system is " + (alarmActive ? "on" : "off") +
                ", Doors are " + (doorsLocked ? "locked" : "unlocked");
    }

}
