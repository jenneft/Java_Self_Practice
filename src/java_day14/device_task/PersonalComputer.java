package java_day14.device_task;

public class PersonalComputer extends Computer {
    public PersonalComputer(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton, int ramSizeGB, int storageSizeGB) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton, ramSizeGB, storageSizeGB);
    }

    @Override
    public void createFile(String fileName) {
        System.out.println("File has been created");
    }

    @Override
    public void deleteFile(String fileName) {
        System.out.println("File has been deleted");
    }

    @Override
    public void turnOn() {
        System.out.println("Device turned on");
    }
    public void lockScreen(){
        System.out.println("Screen is locked");
    }
    @Override
    public void turnOff() {
        System.out.println("Device turned off");
    }
}
/*

8. Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop
 */