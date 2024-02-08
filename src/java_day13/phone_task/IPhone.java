package java_day13.phone_task;

public class IPhone {
    private String brand, model, size, color;
    private double price;
    private static int tracker = 1;


    public IPhone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    private boolean isValidString(String str) {
        // Check if the string is not null and not empty after trimming whitespace
        return str != null && !str.trim().isEmpty();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (isValidString(brand)) {
            this.brand = brand;
        } else {
            System.err.println("Must not be null, empty, or blank");
            System.exit(1);
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (isValidString(model)) {
            this.model = model;
        } else {
            System.err.println("Must not be null, empty, or blank");
            System.exit(1);
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
        if (isValidString(color)) {
            this.color = color;
        } else {
            System.err.println("Must not be null, empty, or blank");
            System.exit(1);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Price must be greater then Zero");
            System.exit(1);
        }
        this.price = price;
    }


    public void call(String phoneNumber) {
        System.out.println("...calling the number " + phoneNumber);
    }

    public void text(String phoneNumber) {
        System.out.println("...texting to the number  " + phoneNumber);

    }

    public void faceTime(String phoneNumber) {
        System.out.println("...facetiming with the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return "IPhone" + tracker++ + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
  1. Create a custom class named 'IPhone' with these specifications:
   Attributes:
       - brand: String
       - model: String
       - size: String
       - price: double
       - color: String

   Encapsulation:
       - All fields must be private with getters and setters.
       Conditions for Encapsulation:
           - The 'brand', 'model', and 'color' must not be null, empty, or blank.
           - The 'price' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - faceTime(phoneNumber): Display "facetiming with the number [phoneNumber]".
       - toString(): Prints the information of the IPhone object.
 */