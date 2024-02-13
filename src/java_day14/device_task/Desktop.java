package java_day14.device_task;

public class Desktop extends PersonalComputer {


    public Desktop(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton, int ramSizeGB, int storageSizeGB) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton, ramSizeGB, storageSizeGB);
    }
    public void restart(){
        System.out.println("Desktop is restarting");
    }


}
/*

8. Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop
 */