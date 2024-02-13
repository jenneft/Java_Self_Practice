package java_day14.device_task;

public abstract class Computer extends Device {
    private int ramSizeGB;
    private int storageSizeGB;


    public Computer(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton,int ramSizeGB,int storageSizeGB) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
        this.ramSizeGB = ramSizeGB;
        this.storageSizeGB = storageSizeGB;
    }

    public int getRamSizeGB() {
        return ramSizeGB;
    }

    public void setRamSizeGB(int ramSizeGB) {
        this.ramSizeGB = ramSizeGB;
    }

    public int getStorageSizeGB() {
        return storageSizeGB;
    }

    public void setStorageSizeGB(int storageSizeGB) {
        this.storageSizeGB = storageSizeGB;
    }

    public abstract void createFile(String fileName);
    public abstract void deleteFile(String fileName);

    @Override
    public String toString() {
        return "Computer{" +
                "ramSizeGB=" + ramSizeGB +
                ", storageSizeGB=" + storageSizeGB +
                '}';
    }

}
/*
3. Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.
 */