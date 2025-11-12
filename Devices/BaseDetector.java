package Devices;

import Observer.ObserverSubject.Observer;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseDetector extends BaseDevice implements IDetector{
    private boolean alarm;
    private static final String ALERT_MESSAGE = "Alert!";
    private static final String NOTHING_HAPPENED_MESSAGE = "Nothing happening";
    private final Set<Observer> observers = new HashSet();

    public BaseDetector() {
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

    protected void triggerAlarm(boolean alarmState) {
        this.alarm = alarmState;
        if (this.alarm) {
            this.notifyObservers("Alert!");
        } else {
            this.notifyObservers("Nothing happening");
        }

    }

    public String alert() {
        return this.alarm ? "Alert!" : "Nothing happening";
    }
}
