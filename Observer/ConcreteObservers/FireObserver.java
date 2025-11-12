package Observer.ConcreteObservers;

import FacadeImplementation.ConcreteFacades.SecuritySystem;
import Observer.ObserverSubject.Observer;

public class FireObserver implements Observer {
    private SecuritySystem securitySystem;
    public FireObserver(SecuritySystem securitySystem) {
        this.securitySystem = securitySystem;
    }
    @Override
    public void update(String message) {
        if (message.equals("Alert!")) {
            System.out.println("[FireDetector] Smoke detected! Calling 101!");
            securitySystem.activateAlarm();
        } else{
            System.out.println("No smoke detected. Clean air.");
        }
    }
}
