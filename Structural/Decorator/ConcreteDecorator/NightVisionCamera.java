package Structural.Decorator.ConcreteDecorator;
import Devices.IDevice;
import HandBook.HandBook;
import Structural.Decorator.BaseDecorator.CameraDecorator;

public class NightVisionCamera extends CameraDecorator {
    public NightVisionCamera(IDevice camera) {
        super(camera);
    }

    @Override
    public String showStatus() {
        return decoratedCamera.showStatus() + HandBook.camera_night_vision;
    }
}
