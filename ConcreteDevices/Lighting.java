package ConcreteDevices;

import Devices.BaseDevice;
import MessagesHandbook.Messages;
import HandBook.HandBook;

public class Lighting extends BaseDevice{
    private HandBook handBook;

    public Lighting(HandBook handBook){
        this.handBook = handBook;
    }
    public Lighting(){

    }

    public void setHandbook(HandBook handBook){
        this.handBook = handBook;
    }

    public int getBrightness() {
        return handBook.getBrightness();
    }


    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            handBook.setBrightness(brightness);
        }else {
            System.out.println(Messages.BRIGHTNESS_VALUE_ERROR);
        }
    }

    @Override
    public String showStatus(){
        return (powerState ? (Messages.LIGHTING_IS_ON + ", " + handBook.getBrightness()) : (Messages.LIGHTING_IS_OFF));
    }
}
