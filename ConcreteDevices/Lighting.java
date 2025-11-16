package ConcreteDevices;

import Devices.BaseDevice;
import HandBook.HandBookValues;
import HandBook.Messages;

public class Lighting extends BaseDevice {
    private HandBookValues handBook;
    private static final int MIN_BRIGHTNESS = 0;
    private static final int MAX_BRIGHTNESS = 100;

    // Private constructor to enforce builder usage
    private Lighting(HandBookValues handBook, Builder builder){
        this.handBook = handBook;
        this.powerState = builder.powerState;
    }

    public void setHandbook(HandBookValues handBook){
        this.handBook = handBook;
    }

    public int getBrightness() {
        return handBook.getBrightness();
    }

    public void setBrightness(int brightness) {
        if (brightness >= MIN_BRIGHTNESS && brightness <= MAX_BRIGHTNESS) {
            handBook.setBrightness(brightness);
        }else {
            System.out.println(Messages.BRIGHTNESS_VALUE_ERROR);
        }
    }

    @Override
    public String showStatus(){
        return (powerState ? (Messages.LIGHTING_IS_ON + ", " + handBook.getBrightness()) : (Messages.LIGHTING_IS_OFF));
    }

    public static class Builder {
        private HandBookValues handBook;
        private boolean powerState = true;

        public Builder(HandBookValues handBook) {
            this.handBook = handBook;
        }

        public Builder withPowerState(boolean powerState) {
            this.powerState = powerState;
            return this;
        }

        public Builder withBrightness(int brightness) {
            if (brightness >= MIN_BRIGHTNESS && brightness <= MAX_BRIGHTNESS) {
                this.handBook.setBrightness(brightness);
            }else {
                System.out.println(Messages.BRIGHTNESS_VALUE_ERROR);
            }

            return this;
        }

        public Lighting build() {
            return new Lighting(this.handBook, this);
        }
    }
}
