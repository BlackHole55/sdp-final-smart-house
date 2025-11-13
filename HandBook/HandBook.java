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




}
