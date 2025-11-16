package Observer.ConcreteObservers;

import Observer.Observer;
import MessagesHandbook.Messages;

public class FireObserver implements Observer {
    
    @Override
    public void update(String message) {
        if (message.equals(Messages.ALERT)) {
            //this message tells user/home system what action should be taken
            System.out.println(Messages.FIRE_OBSERVER_REPORT);
        } 
    }
}
