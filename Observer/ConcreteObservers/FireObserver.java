package Observer.ConcreteObservers;

import Observer.Observer;
import ConcreteDevices.SmokeDetector;
import MessagesHandbook.Messages;

public class FireObserver implements Observer {
    private SmokeDetector smokeDetector;

    public FireObserver(SmokeDetector smokeDetector) {
        this.smokeDetector = smokeDetector;
    }
    
    @Override
    public void update(String message) {
        if (message.equals(Messages.ALERT)) {
            smokeDetector.setAlarmState(true);;
        } else{
            System.out.println(Messages.SMOKE_NOT_DETECTED);
        }
    }
}
