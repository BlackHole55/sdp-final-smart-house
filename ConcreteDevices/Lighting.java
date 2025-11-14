package ConcreteDevices;

import Devices.BaseDevice;

public class Lighting extends BaseDevice{
    private float brightness;
    private final String BRIGHTNESS_VALUE_ERROR = "Brightness value should be between 0 and 100";

    public float getBrightness() {
        return this.brightness;
    }

    public void setBrightness(float brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        }else {
            System.out.println(BRIGHTNESS_VALUE_ERROR);
        }
    }
}
