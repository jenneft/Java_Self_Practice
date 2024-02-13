package java_day14.car_task;

public class Tesla extends Car implements AutoPark, AutoPilot {
    public Tesla(String make, String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
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
        System.out.println("Tesla is auto parking");
    }


    @Override
    public void selfDrive() {
        System.out.println("Tesla is self driving");
    }
    @Override
    public void start() {
        System.out.println("Tesla started");
    }

    @Override
    public void drive() {
        System.out.println("Tesla is driving");
    }

}
/*
9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
 */