package ConcreteDevices;

import Devices.BaseDetector;

public class SecurityCamera extends BaseDetector {
    private boolean someoneDetected;

    public SecurityCamera() {
    }

    public void setSomeoneDetected(boolean detected) {
        this.someoneDetected = detected;
    }

    public void detect() {
        if (!this.isOn()) {
            System.out.println("Camera is Off");
        } else {
            System.out.println("Camera is scanning");
            if (this.someoneDetected) {
                System.out.println("Camera detected someone's presence! Sending alert");
                this.triggerAlarm(true);
            } else {
                System.out.println("No presence detected");
                this.triggerAlarm(false);
            }

        }
    }
}
