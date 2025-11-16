package Observer.ConcreteObservers;

import Observer.Observer;
import MessagesHandbook.Messages;

public class PresenceDetectionObserver implements Observer {

    @Override
    public void update(String message) {
        if (message.equals(Messages.ALERT)) {
            System.out.println(Messages.PRESENCE_OBSERVER_REPORT);
        } 
    }
}
