package Observer.ConcreteObservers;
import Observer.ObserverSubject.Observer;
import FacadeImplementation.ConcreteFacades.SecuritySystem;

public class PresenceDetectionObserver implements Observer {
    private SecuritySystem securitySystem;
    public PresenceDetectionObserver(SecuritySystem securitySystem) {
        this.securitySystem = securitySystem;
    }

    @Override
    public void update(String message) {
        if (message.equals("Alert!")) {
            System.out.println("[Camera] Someone's presence detected! Activating alarm!");
            securitySystem.activateAlarm();
        } else {
            System.out.println("[Camera] No suspicious activity.");
        }
    }
}
