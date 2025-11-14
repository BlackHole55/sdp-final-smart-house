package FacadeImplementation.ConcreteFacades;

import ConcreteDevices.SecurityCamera;
import ConcreteDevices.SmokeDetector;
import MessagesHandbook.Messages;
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
        return (alarmActive ? Messages.ALARM_IS_ACTIVE : Messages.ALARAM_IS_DEACTIVE) + ", " + 
        (doorsLocked ? Messages.DOORS_LOCKED : Messages.DOORS_UNLOCKED);
    }

}
