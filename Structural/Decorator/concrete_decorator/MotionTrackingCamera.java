package Structural.Decorator.concrete_decorator;

import Devices.IDevice;
import Structural.Decorator.base_decorator.CameraDecorator;
import HandBook.HandBook;

public class MotionTrackingCamera extends CameraDecorator {
    public MotionTrackingCamera(IDevice camera) {
        super(camera);
    }

    @Override
    public String showStatus() {
        return decoratedCamera.showStatus() + HandBook.camera_motion_tracking;
    }
}
