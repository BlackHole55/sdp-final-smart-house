package FacadeImplementation.ConcreteFacades;

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

    public String getStatus(){
        return "Lights are " + (lightStatus ? "on" : "off");
    }
}