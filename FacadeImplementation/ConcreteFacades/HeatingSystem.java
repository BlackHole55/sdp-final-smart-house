package FacadeImplementation.ConcreteFacades;

import HandBook.HandBook;

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
        return "Heating system is " + (heatingStatus ? "on":"off") +
                ", Temperature is " + handBook.getTemperature() + "C";
    }
}