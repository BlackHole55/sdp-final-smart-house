package ConcreteDevices;

import Devices.BaseDetector;

public class SmokeDetector extends BaseDetector{
    private boolean detected;

    public void setDetected(boolean detected) {
        this.detected = detected;
    }

    public void detect() {
        if (this.detected) {
            System.out.println("Smoke detected! Sending alert");
            this.triggerAlarm(true);
        } else {
            System.out.println("No smoke detected");
            this.triggerAlarm(false);
        }

    }
}
