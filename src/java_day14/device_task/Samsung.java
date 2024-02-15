package java_day14.device_task;

public class Samsung extends Phone implements Downloadable,AndroidApps{
    public Samsung(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Device is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Device is turned off");
    }

    @Override
    public String AppStoreName() {
        return "Galaxy App Store";
    }

    @Override
    public String OS() {
        return "Android";
    }


    @Override
    public void downloadApp() {
        System.out.println("Samsung Downloading from Galaxy App Store: ");
    }

    @Override
    public void call() {
        System.out.println("Samsung is Calling ");
    }

    @Override
    public void text() {
        System.out.println("Samsung is Texting");
    }
}
/*
 - 'Samsung':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.

 */