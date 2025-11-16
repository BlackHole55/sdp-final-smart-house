package HandBook;

public class HandBook {
    public static final float DEFAULT_DAY_TEMPERATURE_CELSIUS= 22;
    public static final float DEFAULT_NIGHT_TEMPERATURE_CELSIUS = 25;
    private final String CELSIUS_STRING = "°C";
    private float temperatureCelsius;

    public static final int DEFAULT_LIGHTING_BRIGHTNESS = 80;
    private int brightness;

    public float getTemperature() {
        return temperatureCelsius;
    }

    public void setTemperature(float temp){
        temperatureCelsius = temp;
    }
   
    public String getTemperatureCelsius(){
        return temperatureCelsius + CELSIUS_STRING;
    }
    
    public void setBrightness(int brightness){
        this.brightness = brightness;
    }
    public int getBrightness(){
        return brightness;
    }

    public static String thermostat_status_message = "Old Thermostat temperature: ";
    public static int day_temperature = 22;
    public static int night_temperature = 18;
    public static String camera_base_status = "Security Camera" ;
    public static String camera_zoom = " + Equipped with Optical Zoom (closer view of details)";
    public static String camera_night_vision = " + Enhanced with Night Vision (works in darkness)";
    public static String camera_motion_tracking = " + Enabled Motion Tracking (follows movement)";
}
