package FacadeImplementation.ConcreteFacades;

import MessagesHandbook.Messages;

public class LightingSystem {
    private boolean lightStatus;

    public LightingSystem(){

    }
    public void turnOn(){
        lightStatus = true;
    }
    public void turnOff(){
        lightStatus = false;
    }

    // TODO: add brightness
    public String getStatus(){
        return lightStatus ? Messages.LIGHTING_IS_ON : Messages.LIGHTING_IS_OFF;
    }
}