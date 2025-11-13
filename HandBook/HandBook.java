package HandBook;

public class HandBook {
    private static final int DEFAULT_DAY_TEMPERATURE = 22;
    private static final int DEFAULT_NIGHT_TEMPERATURE = 25;
    private int temperature;

    public int getTemperature() {
        return temperature;
    }
    public void setDayTemperature() {
        temperature = DEFAULT_DAY_TEMPERATURE;
    }
    public void setNightTemperature() {
        temperature = DEFAULT_NIGHT_TEMPERATURE;
    }



    public static String thermostat_status_message = "Old Thermostat temperature: ";
    public static int day_temperature = 22;
    public static int night_temperature = 18;
    public static String camera_base_status = "Security Camera";
    public static String camera_zoom = " + Equipped with Optical Zoom (closer view of details)";
    public static String camera_night_vision = " + Enhanced with Night Vision (works in darkness)";
    public static String camera_motion_tracking = " + Enabled Motion Tracking (follows movement)";



}
