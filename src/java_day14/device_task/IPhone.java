package java_day14.device_task;

public class IPhone extends Phone implements Downloadable,AppleApps {
    public IPhone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
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
        System.out.println(getBrand()+getModel()+" is downloading from:"+AppStoreName);
    }

    @Override
    public void call(long phoneNum) {
        System.out.println("IPhone is Calling "+phoneNum);
    }

    @Override
    public void text(long phoneNum) {
        System.out.println("Iphone is Texting  "+phoneNum);
    }
}
/*
7. Create the Following Subclasses of Phone:
    - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.
    - 'Samsung':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
    - 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
 */