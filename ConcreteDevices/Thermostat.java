package ConcreteDevices;

import Devices.BaseDevice;
import HandBook.HandBookValues;
import HandBook.Messages;

public class Thermostat extends BaseDevice{
    private HandBookValues handBook;

    // Private constructor to enforce builder usage
    private Thermostat(HandBookValues handBook, Builder builder){
        this.handBook = handBook;
        this.powerState = builder.powerState;
    }

    public void setHandbook(HandBookValues handBook){
        this.handBook = handBook;
    }

    public float getTemperature() {
        return handBook.getTemperature();
    }

    public void setTemperature(float temperature) {
        handBook.setTemperature(temperature);
    }

    @Override
    public String showStatus(){
        return powerState ? (Messages.HEATING_IS_ON + ", " + handBook.getTemperatureCelsius())  
        : (Messages.HEATING_IS_OFF + ", " + handBook.getTemperatureCelsius());
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

        public Builder withTemperature(float temperature) {
            this.handBook.setTemperature(temperature);
            return this;
        }

        public Thermostat build() {
            return new Thermostat(handBook, this);
        }
    }
}
