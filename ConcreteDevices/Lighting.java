package ConcreteDevices;

import Devices.BaseDevice;
import MessagesHandbook.Messages;
import HandBook.HandBook;

public class Lighting extends BaseDevice {
    private HandBook handBook;
    private static final int MIN_BRIGHTNESS = 0;
    private static final int MAX_BRIGHTNESS = 100;

    // Private constructor to enforce builder usage
    private Lighting(HandBook handBook, Builder builder){
        this.handBook = handBook;
        this.powerState = builder.powerState;
    }

    public void setHandbook(HandBook handBook){
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
        private HandBook handBook;
        private boolean powerState = true;

        public Builder(HandBook handBook) {
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
