package java_day11;

public class Pizza {
    public String size;
    public int numberOfCheeseTopping,numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        this.size=size;
        this.numberOfPepperoniTopping=numberOfPepperoniTopping;
        this.numberOfCheeseTopping=numberOfCheeseTopping;


    }

    public double calcCost(){
        double baseCost=0;
        switch (size.toLowerCase()){
            case "small"-> baseCost=10;
            case "medium"->baseCost=12;
            case "large"->baseCost=14;
            default -> System.err.println("try again");
        }
        return baseCost+(2*(numberOfCheeseTopping+numberOfPepperoniTopping));


    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }
}
/*
Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.
 */