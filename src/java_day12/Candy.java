package java_day12;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    private static int tracker=1;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<=0){
            System.err.println("Enter valid quantity");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        if(price==0){
            System.out.println("You got a Free Candy");
        }
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.err.println("Enter valid Price");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasPeanuts(boolean nuts) {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candy() {
        this.quantity = 1;
    }

    @Override
    public String toString() {
        return "Candy"+tracker++ +"{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
/*

4. Create a custom class named Candy with the following specifications:

	Attributes:
		brand
		quantity
		price
		hasPeanuts

	Ensure encapsulation for all fields.
		Conditions:
			The price of candy cannot be set to a negative value.
			The quantity of candy cannot be set to zero or a negative value.

	Add a constructor that allows the user to set all fields during object creation.

	Actions:
		toString(): Displays the brand, unit price, and quantity when the object is printed. If the price is zero, display "free" instead of 0.

	Create another class named CandyClients, create multiple candy objects, and test each function of the candy object.



 */