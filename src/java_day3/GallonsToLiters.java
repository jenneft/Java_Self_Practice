package java_day3;
/*2. Create a class named GallonsToLiters and declare the following variables:
					gallon
					liters

	Write a program that converts any given number of gallons to liters.

					Example:
						gallon = 10

					Output:
						10 gallons is equal to 37.9 liters

			Hint: 1 gallon = 3.79 liters
*/
public class GallonsToLiters {
    public static void main(String[] args) {
        int gallons=10;
        float liter=3.79F;
        liter=gallons*liter;
        System.out.println(gallons+" gallons is equal to "+liter+" liters ");



    }
}
