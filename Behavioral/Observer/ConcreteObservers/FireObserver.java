package Behavioral.Observer.ConcreteObservers;

import Behavioral.Observer.IObserver;
import HandBook.Messages;

public class FireObserver implements IObserver {
    
    @Override
    public void update(String message) {
        if (message.equals(Messages.ALERT)) {
            //this message tells user/home system what action should be taken
            System.out.println(Messages.FIRE_OBSERVER_REPORT);
        } 
    }
}
