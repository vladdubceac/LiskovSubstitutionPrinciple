package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle =new Bus(100, 4.7f);
        System.out.println(vehicle.getSpeed());
        vehicle = new Car(180, 2.0f);
        System.out.println(vehicle.getCubicCapacity());
    }
}
