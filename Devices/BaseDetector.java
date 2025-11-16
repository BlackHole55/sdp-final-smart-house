package Devices;

import java.util.HashSet;
import java.util.Set;

import Observer.Observer;
import MessagesHandbook.Messages;

public abstract class BaseDetector extends BaseDevice implements IDetector {
    private Set<Observer> observers = new HashSet<Observer>();
    protected boolean detected;
    protected boolean alarmState;

    public void setDetected(boolean detected) {
        this.detected = detected;
    }

    public void setAlarmState(boolean alarmActive){
        this.alarmState = alarmActive;
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for(Observer observer : this.observers) {
            observer.update(message);
        }
    }

    protected void triggerAlarm(boolean alarm) {
        this.alarmState = alarm;
        notifyObservers(alarm ? Messages.ALERT : Messages.NOTHING_DETECTED);
    }
}
