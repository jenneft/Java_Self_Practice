package java_day14.device_task;

public class Google extends Phone implements Downloadable,AndroidApps {
    public Google(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
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
        return "Google Play Store";
    }

    @Override
    public String OS() {
        return "Android";
    }



    @Override
    public void downloadApp() {
        System.out.println("Google is Downloading from the Play Store");
    }

    @Override
    public void call() {
        System.out.println("Google is Calling ");
    }

    @Override
    public void text() {
        System.out.println("Google is texting ");
    }
}
/*

    - 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
 */