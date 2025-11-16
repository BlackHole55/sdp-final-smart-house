package Structural.Adapter.Adapter;

import Devices.IDevice;
import Structural.Adapter.Service.OldThermostat;
import HandBook.HandBookValues;
import HandBook.Messages;

public class ThermostatAdapter implements IDevice {
    private OldThermostat oldThermostat;

    public ThermostatAdapter(OldThermostat oldThermostat) {
        this.oldThermostat = oldThermostat;
    }

    @Override
    public void turnOn() {
        oldThermostat.setTempCelsius(HandBookValues.DEFAULT_DAY_TEMPERATURE_CELSIUS);
    }

    @Override
    public void turnOff() {
        oldThermostat.setTempCelsius(HandBookValues.DEFAULT_NIGHT_TEMPERATURE_CELSIUS );
    }

    @Override
    public String showStatus() {
        return Messages.THERMOSTAT_STATUS_MESSAGE
                + oldThermostat.getTempCelsius()
                + HandBookValues.CELSIUS_STRING;
    }
    @Override
    public boolean isOn() {
        return oldThermostat.getTempCelsius() > 0;
    }
}

