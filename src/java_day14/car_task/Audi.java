package java_day14.car_task;

public class Audi extends Car implements AutoPark {
    public Audi(String make, String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Audi started");
    }

    @Override
    public void drive() {
        System.out.println("Audi is driving");
    }

    @Override
    public boolean hasAutoPark() {
        return true;
    }

    @Override
    public void autoPark() {
        System.out.println("Audi is auto parking");
    }
}
/*
8. Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.
 */