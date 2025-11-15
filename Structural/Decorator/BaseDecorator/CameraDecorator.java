package Structural.Decorator.BaseDecorator;

import Devices.BaseDevice;
import Devices.IDevice;

public abstract class CameraDecorator extends BaseDevice {
    protected IDevice decoratedCamera;

    public CameraDecorator(IDevice camera) {
        this.decoratedCamera = camera;
    }

    @Override
    public void turnOn() {
        decoratedCamera.turnOn();
    }

    @Override
    public void turnOff() {
        decoratedCamera.turnOff();
    }

    @Override
    public String showStatus() {
        return decoratedCamera.showStatus();
    }
}
