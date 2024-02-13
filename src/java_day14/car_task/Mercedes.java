package java_day14.car_task;

public class Mercedes extends Car implements AutoPark {
    public Mercedes(String make, String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public boolean hasAutoPark() {
        return true;
    }

    @Override
    public void autoPark() {
        System.out.println("Mercedes is auto parking");
    }

    @Override
    public void start() {
        System.out.println("Mercedes started");
    }

    @Override
    public void drive() {
        System.out.println("Mercedes is driving");
    }
}
/*
8. Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.
 */