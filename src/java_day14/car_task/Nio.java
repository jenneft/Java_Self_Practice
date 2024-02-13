package java_day14.car_task;

public class Nio extends Car implements AutoPark, AutoPilot {
    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public boolean hasAutoPark() {
        return true;
    }
    @Override
    public boolean hasAutoPilot() {
        return true;
    }

    @Override
    public void autoPark() {
        System.out.println("Nio is auto parking");
    }

    @Override
    public void selfDrive() {
        System.out.println("Nio is self driving");
    }


    @Override
    public void start() {
        System.out.println("Nio started");
    }

    @Override
    public void drive() {
        System.out.println("Nio is driving");
    }


}
/*
9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
 */