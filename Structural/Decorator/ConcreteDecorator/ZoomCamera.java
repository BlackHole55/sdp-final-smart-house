package Structural.Decorator.ConcreteDecorator;

import Devices.IDevice;
import MessagesHandbook.Messages;
import Structural.Decorator.BaseDecorator.CameraDecorator;

public class ZoomCamera extends CameraDecorator {
    public ZoomCamera(IDevice camera) {
        super(camera);
    }

    @Override
    public String showStatus() {
        return decoratedCamera.showStatus() + Messages.camera_zoom;
    }
}
