package HandBook;

public class HandBook {
    private static final int DEFAULT_DAY_TEMPERATURE = 22;
    private static final int DEFAULT_NIGHT_TEMPERATURE = 25;
    private int temperature;

    // TODO: getTemperatureCelsium
    public int getTemperature() {
        return temperature;
    }
    public void setDayTemperature() {
        temperature = DEFAULT_DAY_TEMPERATURE;
    }
    public void setNightTemperature() {
        temperature = DEFAULT_NIGHT_TEMPERATURE;
    }



}
