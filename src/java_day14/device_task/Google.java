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
    public void downloadApp() {
        System.out.println(getBrand()+getModel()+" is Downloading from:"+AppStoreName);
    }

    @Override
    public void call(long phoneNum) {
        System.out.println("Google is Calling "+phoneNum);
    }

    @Override
    public void text(long phoneNum) {
        System.out.println("Google is texting "+phoneNum);
    }
}
/*

    - 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
 */