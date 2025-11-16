package ConcreteDevices;

import Devices.BaseDetector;
import HandBook.Messages;

public class SmokeDetector extends BaseDetector{
    @Override
    public void detect() {
        if (this.detected) {
            //this message reports what sensor detects
            System.out.println(Messages.SMOKE_DETECTED + " " + Messages.SENDING_ALERT);
            this.triggerAlarm(true);
        } else {
            System.out.println(Messages.SMOKE_NOT_DETECTED);
            this.triggerAlarm(false);
        }
    }

    @Override
    public String showStatus(){
        return (powerState ? Messages.SMOKE_DETECTOR_IS_ON : Messages.SMOKE_DETECTOR_IS_OFF) + ", " +
                (alarmState ? Messages.ALERT : Messages.NOTHING_DETECTED);
    }
}
