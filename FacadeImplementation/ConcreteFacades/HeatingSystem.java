package FacadeImplementation.ConcreteFacades;

import HandBook.HandBook;
import MessagesHandbook.Messages;

public class HeatingSystem {
    private HandBook handBook;
    private boolean heatingStatus;

    public HeatingSystem(HandBook handBook){
        this.handBook = handBook;
    }
    public void setDayTemperature(){
        handBook.setDayTemperature();
    }
    public void setNightTemperature(){
        handBook.setNightTemperature();
    }
    public void turnOn(){
        heatingStatus = true;
    }
    public void turnOff(){
        heatingStatus = false;
    }
    public String getStatus(){
        return heatingStatus 
        ? Messages.HEATING_IS_ON + ", " + handBook.getTemperature() 
        : Messages.HEATING_IS_OFF + ", " + handBook.getTemperature();
    }
}