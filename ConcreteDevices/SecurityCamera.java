package ConcreteDevices;

import Devices.BaseDetector;
import MessagesHandbook.Messages;

public class SecurityCamera extends BaseDetector {
    public void detect() {
        if (!this.isOn()) {
            System.out.println(Messages.SECURITY_CAMERA_IS_OFF);
        } else {
            System.out.println(Messages.SECURITY_CAMERA_SCANING);
            if (this.detected) {
                System.out.println(Messages.SECURITY_CAMERA_DETECTED + " " + Messages.SENDING_ALERT);
                this.triggerAlarm(true);
            } else {
                System.out.println(Messages.SECURITY_CAMERA_NOT_DETECTED);
                this.triggerAlarm(false);
            }

        }
    }
}
