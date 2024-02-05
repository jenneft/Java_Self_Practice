package java_day07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {

        Scanner request = new Scanner(System.in);

        System.out.println("Enter the number of miles");
        int answer = request.nextInt();

        double kilometers = answer * 1.609344;
        DecimalFormat df = new DecimalFormat("#.##");
        String roundedKM = df.format(kilometers);

        System.out.println(answer + " miles is equal to " + roundedKM + " kilometers");

        request.close();


    }


}
/*9. Create a class named MilesToKM and write a program that asks the user to enter the number of miles and
convert it to kilometers.

        Example:
             Enter the miles:
             Input: 10.0

        Output:
             10.0 miles is equal to 16.09 kilometers

 */