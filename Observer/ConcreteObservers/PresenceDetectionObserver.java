package Observer.ConcreteObservers;
import Devices.IDetector;
import Observer.Observer;
import MessagesHandbook.Messages;

public class PresenceDetectionObserver implements Observer {
    private IDetector securityCamera;

    public PresenceDetectionObserver(IDetector camera) {
        this.securityCamera = camera;
    }

    @Override
    public void update(String message) {
        if (message.equals(Messages.ALERT)) {
            securityCamera.setAlarmState(true);
        } else {
            System.out.println(Messages.SECURITY_CAMERA_NOT_DETECTED);
        }
    }
}
