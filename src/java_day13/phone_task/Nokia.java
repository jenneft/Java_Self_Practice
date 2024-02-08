package java_day13.phone_task;

public class Nokia {
    private String brand, model, size, color;
    private double price;
    private static int tracker = 1;

    private boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    public Nokia(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (!isValidString(brand)) {
            throw new IllegalArgumentException("Brand must not be null, empty, or blank");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!isValidString(model)) {
            throw new IllegalArgumentException("Brand must not be null, empty, or blank");
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!isValidString(color)) {
            throw new IllegalArgumentException("Brand must not be null, empty, or blank");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price must be greater then Zero ");
        }
    }
    public void call(String phoneNumber) {
        System.out.println("...calling the number " + phoneNumber);
    }

    public void text(String phoneNumber) {
        System.out.println("...texting to the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return "Nokia"+tracker++ +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*

3. Create a class named 'Nokia' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Nokia object.
 */