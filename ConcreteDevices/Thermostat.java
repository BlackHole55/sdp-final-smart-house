package ConcreteDevices;

import Devices.BaseDevice;
import MessagesHandbook.Messages;
import HandBook.HandBook;

public class Thermostat extends BaseDevice{
    private HandBook handBook;

    public Thermostat(HandBook handBook){
        this.handBook = handBook;
    }
    public Thermostat(){}
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
}
