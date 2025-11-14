package ConcreteDevices;

import Devices.BaseDevice;
import MessagesHandbook.Messages;

public class Lighting extends BaseDevice{
    private float brightness;

    public float getBrightness() {
        return this.brightness;
    }

    public void setBrightness(float brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        }else {
            System.out.println(Messages.BRIGHTNESS_VALUE_ERROR);
        }
    }
}
