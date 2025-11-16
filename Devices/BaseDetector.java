package Devices;

import java.util.HashSet;
import java.util.Set;

import Behavioral.Observer.IObserver;
import HandBook.Messages;

public abstract class BaseDetector extends BaseDevice implements IDetector {
    private Set<IObserver> observers = new HashSet<IObserver>();
    protected boolean detected;
    protected boolean alarmState;

    @Override
    public void setDetected(boolean detected) {
        this.detected = detected;
    }

    @Override
    public void setAlarmState(boolean alarmActive){
        this.alarmState = alarmActive;
    }
    
    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for(IObserver observer : this.observers) {
            observer.update(message);
        }
    }

    protected void triggerAlarm(boolean alarm) {
        this.alarmState = alarm;
        notifyObservers(alarm ? Messages.ALERT : Messages.NOTHING_DETECTED);
    }
}
