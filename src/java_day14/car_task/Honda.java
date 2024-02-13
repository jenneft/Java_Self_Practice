package java_day14.car_task;

public class Honda extends Car {
    public Honda(String make, String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Honda started");
    }

    @Override
    public void drive() {
        System.out.println("Honda is driving");
    }
}
