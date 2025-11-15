package Structural.Decorator.concrete_decorator;
import Devices.IDevice;
import Structural.Decorator.base_decorator.CameraDecorator;
import HandBook.HandBook;

public class NightVisionCamera extends CameraDecorator {
    public NightVisionCamera(IDevice camera) {
        super(camera);
    }

    @Override
    public String showStatus() {
        return decoratedCamera.showStatus() + HandBook.camera_night_vision;
    }
}
