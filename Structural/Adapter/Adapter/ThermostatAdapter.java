package Structural.Adapter.Adapter;

import Devices.IDevice;
import Structural.Adapter.Service.OldThermostat;
import HandBook.HandBook;
import MessagesHandbook.Messages;

public class ThermostatAdapter implements IDevice {
    private OldThermostat oldThermostat;

    public ThermostatAdapter(OldThermostat oldThermostat) {
        this.oldThermostat = oldThermostat;
    }

    @Override
    public void turnOn() {
        oldThermostat.setTempCelsius(HandBook.DEFAULT_DAY_TEMPERATURE_CELSIUS);
    }

    @Override
    public void turnOff() {
        oldThermostat.setTempCelsius(HandBook.DEFAULT_NIGHT_TEMPERATURE_CELSIUS );
    }

    @Override
    public String showStatus() {
        return Messages.thermostat_status_message
                + oldThermostat.getTempCelsius()
                + HandBook.CELSIUS_STRING;
    }
    @Override
    public boolean isOn() {
        return oldThermostat.getTempCelsius() > 0;
    }
}

