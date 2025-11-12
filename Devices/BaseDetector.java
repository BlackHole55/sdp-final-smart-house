package Devices;

import java.util.HashSet;
import Observer.ObserverSubject.Observer;
import Observer.ObserverSubject.Subject;

import java.util.Set;

public abstract class BaseDetector extends BaseDevice implements IDetector, Subject {
    private boolean alarm;
    private static final String ALERT_MESSAGE = "Alert!";
    private static final String NOTHING_HAPPENED_MESSAGE = "Nothing happening";

    private final Set<Observer> observers = new HashSet<>();


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    protected void triggerAlarm(boolean alarmState) {
        this.alarm = alarmState;
        if (alarm) {
            notifyObservers(ALERT_MESSAGE);
        } else {
            notifyObservers(NOTHING_HAPPENED_MESSAGE);
        }
    }

    @Override
    public String alert() {
        return alarm ? ALERT_MESSAGE : NOTHING_HAPPENED_MESSAGE;
    }
}



