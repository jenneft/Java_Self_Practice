package java_day07;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the radius:");
        double radiusOfCircle=input.nextDouble();

        double perimeter=2*3.14*radiusOfCircle;
        double area=Math.PI*Math.pow(radiusOfCircle,2);

        DecimalFormat df=new DecimalFormat("#.##");
        String roundedPerimeter =df.format(perimeter);
        String roundedArea=df.format(area);

        System.out.println("The area of the circle is: "+roundedArea);
        System.out.println("The perimeter of the circle is: "+roundedPerimeter);

        input.close();
    }
}
/*Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4

 */