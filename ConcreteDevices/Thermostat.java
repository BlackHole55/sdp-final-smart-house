package ConcreteDevices;

import Devices.BaseDevice;
import MessagesHandbook.Messages;
import HandBook.HandBook;

public class Thermostat extends BaseDevice{
    private HandBook handBook;

    // Private constructor to enforce builder usage
    private Thermostat(HandBook handBook, Builder builder){
        this.handBook = handBook;
        this.powerState = builder.powerState;
    }

    public void setHandbook(HandBook handBook){
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
        private HandBook handBook;
        private boolean powerState = true;

        public Builder(HandBook handBook) {
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
