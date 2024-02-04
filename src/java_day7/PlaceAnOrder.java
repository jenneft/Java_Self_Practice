package java_day7;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner menu=new Scanner(System.in);

        System.out.println("Enter the product name:");
        String productName=menu.nextLine();

        System.out.println("Enter the price");
        double price=menu.nextDouble();

        System.out.println("Enter quantity");
        int quantity=menu.nextInt();

        System.out.println("Enter your first name");
        String firstName=menu.next();

        double updatedPrice=quantity*price;


        System.out.println(firstName+",your order for "+quantity+" "+productName+"('s)"+" has been placed. "+"Your total is $"+updatedPrice);

        menu.close();
    }
}
/*
10. Create a class named PlaceAnOrder:

    Ask the user to enter the product name (multiple words).
    Ask the user to enter the price (double).
    Ask the user to enter the quantity (int).
    Ask the user to enter their first name (String, single word).

    Print in the following format:

        Example:
             Inputs: "Apples", 1.5, 5, "Luke"

        Output:
             Luke, your order for 5 Apples has been placed. Your total is 7.5.

 */