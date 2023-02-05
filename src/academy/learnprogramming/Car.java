package academy.learnprogramming;

public class Car extends Vehicle {
    private int carSpeed;
    private float carCubicCapacity;
    private boolean isHatchBack;

    public Car() {
    }

    public Car(int carSpeed, float carCubicCapacity) {
        this.carSpeed = carSpeed;
        this.carCubicCapacity = carCubicCapacity;
    }

    @Override
    int getSpeed() {
        return carSpeed;
    }

    @Override
    float getCubicCapacity() {
        return carCubicCapacity;
    }

    public void setIsHatchBack(boolean isHatchBack){
        this.isHatchBack = isHatchBack;
    }

    public boolean isHatchBack(){
        return isHatchBack;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public void setCarCubicCapacity(float carCubicCapacity) {
        this.carCubicCapacity = carCubicCapacity;
    }
}
