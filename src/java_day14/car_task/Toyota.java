package java_day14.car_task;

public class Toyota extends Car{
    public Toyota(String make, String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Toyota Started");
    }

    @Override
    public void drive() {
        System.out.println("Toyota is driving ");
    }
}
