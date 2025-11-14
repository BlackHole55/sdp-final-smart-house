package ConcreteDevices;

import Devices.BaseDetector;
import MessagesHandbook.Messages;

public class SmokeDetector extends BaseDetector{
    public void detect() {
        if (this.detected) {
            System.out.println(Messages.SMOKE_DETECTED + " " + Messages.SENDING_ALERT);
            this.triggerAlarm(true);
        } else {
            System.out.println(Messages.SMOKE_NOT_DETECTED);
            this.triggerAlarm(false);
        }

    }
}
