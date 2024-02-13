package java_day14.device_task;

public class Laptop extends PersonalComputer{

    public Laptop(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton, int ramSizeGB, int storageSizeGB) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton, ramSizeGB, storageSizeGB);
    }
    public  void takeScreenshot(){
        System.out.println("Taking a screenshot");
    }

}
/*

8. Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop
 */