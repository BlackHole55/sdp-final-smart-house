package Structural.Decorator.ConcreteDecorator;

import Devices.IDevice;
import HandBook.Messages;
import Structural.Decorator.BaseDecorator.CameraDecorator;

public class MotionTrackingCamera extends CameraDecorator {
    public MotionTrackingCamera(IDevice camera) {
        super(camera);
    }

    @Override
    public String showStatus() {
        return decoratedCamera.showStatus() + Messages.CAMERA_MOTION_TRACKING;
    }
}
