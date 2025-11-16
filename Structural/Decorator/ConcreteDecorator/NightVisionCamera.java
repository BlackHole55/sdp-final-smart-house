package Structural.Decorator.ConcreteDecorator;
import Devices.IDevice;
import HandBook.Messages;
import Structural.Decorator.BaseDecorator.CameraDecorator;

public class NightVisionCamera extends CameraDecorator {
    public NightVisionCamera(IDevice camera) {
        super(camera);
    }

    @Override
    public String showStatus() {
        return decoratedCamera.showStatus() + Messages.CAMERA_NIGHT_VISION;
    }
}
