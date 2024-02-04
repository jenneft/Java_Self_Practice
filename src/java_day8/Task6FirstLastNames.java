package java_day8;

import java.util.Scanner;

public class Task6FirstLastNames {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName=input.nextLine().toLowerCase();
        System.out.println("Enter your last name: ");
        String lastName=input.nextLine().toLowerCase();

                //SOLUTION 1:

        System.out.println(firstName.substring(0,1).toUpperCase()+firstName.substring(1)+" "+lastName.substring(0,1).toUpperCase()+lastName.substring(1));

                //SOLUTION 2:

      /*  System.out.print(firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase()+'\t');
        ;
        System.out.print(lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase());
       */


    }
}
