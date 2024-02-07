package java_day12;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    private static int tracker = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {

            if (name.isBlank() || name.isEmpty()) {
                System.err.println("Name Cannot Be Blank Nor Empty");
                System.exit(1);
            } else {
                for (char each : name.toCharArray()) {
                    if (!Character.isLetterOrDigit(each) && each != ' ') {
                        System.err.println("Name cannot contain any special characters other than space.");
                        System.exit(1);
                    }
                }
                if(!Character.isLetter(name.charAt(0))){
                    System.err.println("Name must start with letters");
                    System.exit(1);
                }

            }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("Unit Price Cannot Be Negative");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("Unit Quantity Cannot Be Negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public Item() {
        this.quantity = 1;
    }

    public double calcCost() {
        return Math.round(unitPrice * quantity);
    }

    @Override
    public String toString() {
        return "Item" + tracker++ + "{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }
}
/*

3. Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.

 */