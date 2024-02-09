package java_day13.phone_task;

public class Nokia extends IPhone {
    private static int tracker = 1;

    public Nokia(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }

    @Override
    public String toString() {
        return "Nokia" + tracker++ + "{" +
                "brand= '" + getBrand() + "\'" +
                ", model='" + getModel() + "\'" +
                ", size='" + getSize() + "\'" +
                ", color='" + getModel() + "\'" +
                ", price=" + getPrice() + '}';
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