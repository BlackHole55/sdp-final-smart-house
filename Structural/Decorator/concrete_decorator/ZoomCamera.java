package Structural.Decorator.concrete_decorator;

import Devices.IDevice;
import Structural.Decorator.base_decorator.CameraDecorator;
import HandBook.HandBook;

public class ZoomCamera extends CameraDecorator {
    public ZoomCamera(IDevice camera) {
        super(camera);
    }

    @Override
    public String showStatus() {
        return decoratedCamera.showStatus() + HandBook.camera_zoom;
    }
}
