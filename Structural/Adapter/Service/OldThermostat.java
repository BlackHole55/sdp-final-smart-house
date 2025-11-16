package Structural.Adapter.Service;

public class OldThermostat {
    private float tempCelsius;

    public void setTempCelsius(float temp) {
        this.tempCelsius = temp; 
    }

    public float getTempCelsius() {
        return tempCelsius; 
    }
}