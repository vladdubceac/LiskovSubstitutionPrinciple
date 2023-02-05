package academy.learnprogramming;

public class Bus extends Vehicle {
    private int busSpeed;
    private float busCubicCapacity;
    private boolean hasEmergencyExitLock;

    public Bus() {
    }

    public Bus(int busSpeed, float busCubicCapacity) {
        this.busSpeed = busSpeed;
        this.busCubicCapacity = busCubicCapacity;
    }

    @Override
    int getSpeed() {
        return busSpeed;
    }

    @Override
    float getCubicCapacity() {
        return busCubicCapacity;
    }

    public void setBusSpeed(int busSpeed) {
        this.busSpeed = busSpeed;
    }

    public void setBusCubicCapacity(float busCubicCapacity) {
        this.busCubicCapacity = busCubicCapacity;
    }

    public boolean hasEmergencyExitLock() {
        return hasEmergencyExitLock;
    }

    public void setHasEmergencyExitLock(boolean hasEmergencyExitLock) {
        this.hasEmergencyExitLock = hasEmergencyExitLock;
    }
}
