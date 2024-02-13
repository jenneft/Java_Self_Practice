package java_day14.car_task;

public class BMW extends Car{
    public BMW(String make, String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("BMW Started");
    }

    @Override
    public void drive() {
        System.out.println("BMW is driving");
    }
}
