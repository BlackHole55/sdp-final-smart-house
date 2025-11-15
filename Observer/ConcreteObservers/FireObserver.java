package Observer.ConcreteObservers;

import Observer.Observer;
import Devices.IDetector;
import MessagesHandbook.Messages;

public class FireObserver implements Observer {
    private IDetector smokeDetector;

    public FireObserver(IDetector smokeDetector) {
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
