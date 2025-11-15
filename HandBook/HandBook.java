package HandBook;

public class HandBook {
    public static final float DEFAULT_DAY_TEMPERATURE_CELSIUS= 22;
    public static final float DEFAULT_NIGHT_TEMPERATURE_CELSIUS = 25;
    private float temperatureCelsius;

    public static final int DEFAULT_LIGHTING_BRIGHTNESS = 80;
    private int brightness;

    public float getTemperature() {
        return temperatureCelsius;
    }
    // public void setDayTemperature() {
    //     temperatureCelsius = DEFAULT_DAY_TEMPERATURE_CELSIUS;
    // }
    // public void setNightTemperature() {
    //     temperatureCelsius = DEFAULT_NIGHT_TEMPERATURE_CELSIUS;
    // }
    public void setTemperature(float temp){
        temperatureCelsius = temp;
    }
   
    public String getTemperatureCelsius(){
        return temperatureCelsius + "°C";
    }
    
    public void setBrightness(int brightness){
        this.brightness = brightness;
    }
    public int getBrightness(){
        return brightness;
    }


}
