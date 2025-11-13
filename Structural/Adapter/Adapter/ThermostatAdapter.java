package Structural.Adapter.Adapter;

import Devices.BaseDevice;
import Devices.IDevice;
import Structural.Adapter.Service.OldThermostat;
import HandBook.HandBook;

public class ThermostatAdapter extends BaseDevice implements IDevice {
    private OldThermostat oldThermostat;

    public ThermostatAdapter(OldThermostat oldThermostat) {
        this.oldThermostat = oldThermostat;
    }

    @Override
    public void turnOn() {
        oldThermostat.setTempCelsius(HandBook.day_temperature);
    }

    @Override
    public void turnOff() {
        oldThermostat.setTempCelsius(HandBook.night_temperature);
    }

    @Override
    public String showStatus() {
        return HandBook.thermostat_status_message + oldThermostat.getTempCelsius() + "C";
    }
}

