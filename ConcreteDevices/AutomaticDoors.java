package ConcreteDevices;

import Devices.BaseDevice;
import MessagesHandbook.Messages;

public class AutomaticDoors extends BaseDevice{
    private boolean doorsLocked;

    public void lockDoors(){
        doorsLocked = true;
    }
    public void unLockDoors(){
        doorsLocked = false;
    }

    @Override 
    public String showStatus(){
        return doorsLocked ? Messages.DOORS_LOCKED : Messages.DOORS_UNLOCKED;
    }
}
