package java_day7;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner convert=new Scanner(System.in);

        System.out.println("Enter the amount of cents");
        int output=convert.nextInt();

        int Dollars=output/100;
        int remCents=output%100;

        System.out.println(output+" cents is equal to "+Dollars+" dollars"+" and "+remCents+" cents");

        convert.close();

        }

    }

/*. Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents


 */