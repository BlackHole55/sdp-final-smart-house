package Behavioral.Observer.ConcreteObservers;

import Behavioral.Observer.IObserver;
import HandBook.Messages;

public class PresenceDetectionObserver implements IObserver {

    @Override
    public void update(String message) {
        if (message.equals(Messages.ALERT)) {
            System.out.println(Messages.PRESENCE_OBSERVER_REPORT);
        } 
    }
}
