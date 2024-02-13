package java_day14.car_task;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable {
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("CydeoCar started");
    }

    @Override
    public void drive() {
        System.out.println("CydeoCar is driving");
    }


    @Override
    public boolean hasAutoPark() {
        return true;
    }

    @Override
    public void autoPark() {
        System.out.println("CydeoCar is auto parking");
    }

    @Override
    public boolean hasAutoPilot() {
        return true;
    }

    @Override
    public void selfDrive() {
        System.out.println("CydeoCar is self driving");
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public void fly() {
        System.out.println("CydeoCar is flying");
    }
}
/*
10. Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot, and Flyable Interfaces.
 */