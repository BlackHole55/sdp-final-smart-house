package Devices;

import Observer.ObserverSubject.Observer;

public interface IDetector extends IDevice {
    public String alert();
    public void detect();
    public void setDetected(boolean detected);
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(String message);
}
