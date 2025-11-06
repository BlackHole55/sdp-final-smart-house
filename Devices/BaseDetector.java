package Devices;

public abstract class BaseDetector extends BaseDevice {
    private boolean alarm;
    private final String ALERT_MESSAGE = "Alert!";
    private final String NOTHING_HAPPEND_MESSAGE = "Nothig happening";

    public String alert() {
        if (this.alarm) {
            return ALERT_MESSAGE;
        }else {
            return NOTHING_HAPPEND_MESSAGE;
        }
    }
}
