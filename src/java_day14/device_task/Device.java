package java_day14.device_task;

public abstract class Device {
    private final String brand, model, size;
    private double price;
    private String color;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }
    public Device(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        if(!isValidString(brand))
            throw new RuntimeException("Brand Cannot Be Null or Empty");
        if(!isValidString(model))
            throw new RuntimeException("Model Cannot Be Null or Empty");
        if(!isValidString(size))
            throw new RuntimeException("Brand Cannot Be Null or Empty");
        if(!isValidString(color))
            throw new RuntimeException("Brand Cannot Be Null or Empty");
        if (price<0)
            throw new RuntimeException("Price Must Be Positive");


        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }



}
/*
Device Task Requirements:

1. Create an Abstract Class Named 'Device':
    - Variables:
        - final brand
        - final model
        - price
        - color
        - final size
        - hasBattery
        - hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions:
        - brand, model, color, and size must not be null or empty.
        - price must be positive.
    - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()

2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()

3. Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.

4. Create an Interface Named 'Downloadable':
    - Abstract Method:
        - downloadApp()

5. Create a Child Interface of Downloadable Named 'AndroidApps':
    - Variables:
        - AppStoreName
        - OS

6. Create a Child Interface of Downloadable Named 'AppleApps':
    - Variables:
        - AppStoreName
        - OS

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

8. Create the Following Subclasses of Computer:
    - 'PersonalComputer':
        - Desktop
        - Laptop

9. Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.


 */