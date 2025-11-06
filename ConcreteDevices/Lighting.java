package ConcreteDevices;

import Devices.BaseDevice;

public class Lighting extends BaseDevice{
    private double brightness;
    private final String BRIGHTNESS_VALUE_ERROR = "Brightness value should be between 0 and 100";

    public double getBrightness() {
        return this.brightness;
    }

    public void setBrightness(double brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        }else {
            System.out.println(BRIGHTNESS_VALUE_ERROR);
        }
    }
}
