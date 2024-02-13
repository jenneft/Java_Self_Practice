package java_day14.device_task;

public abstract class Phone extends Device {

    public Phone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum){
        System.out.println("Calling: ");
    }
    public void text(long phoneNum){
        System.out.println("Texting: ");
    }

    @Override
    public String toString() {
        return super.toString()+" Phone{}";
    }
}
/*
2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()
 */