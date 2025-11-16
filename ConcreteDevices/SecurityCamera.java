package ConcreteDevices;

import Devices.BaseDetector;
import MessagesHandbook.Messages;

public class SecurityCamera extends BaseDetector {
    @Override
    public void detect() {
        if (this.detected) {
            //this message reports what sensor detects
            System.out.println(Messages.SECURITY_CAMERA_DETECTED + " " + Messages.SENDING_ALERT);
            this.triggerAlarm(true);
        } else {
            System.out.println(Messages.SECURITY_CAMERA_NOT_DETECTED);
            this.triggerAlarm(false);
        }
    }

    @Override
    public String showStatus(){
        return (powerState ? Messages.SECURITY_CAMERA_IS_ON : Messages.SECURITY_CAMERA_IS_OFF) + ", " +
                (alarmState ? Messages.ALERT : Messages.NOTHING_DETECTED);
    }
}