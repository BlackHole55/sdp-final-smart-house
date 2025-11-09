import Creational.DeviceBuilder;
import Creational.DeviceType;
import Devices.IDevice;

public class Main {
    public static void main(String[] args) {
        DeviceBuilder thermostatBuilder1 = new DeviceBuilder(DeviceType.THERMOSTAT);
        IDevice thermostat1 = thermostatBuilder1.withPowerState(true).withTemperature(25).build();
        System.out.println(thermostat1.showStatus());
    }
}
