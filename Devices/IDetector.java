package Devices;

import Behavioral.Observer.IObserver;

public interface IDetector extends IDevice {
    public void detect();
    public void setDetected(boolean detected);
    public void setAlarmState(boolean alarmActive);
    public void addObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers(String message);
}
