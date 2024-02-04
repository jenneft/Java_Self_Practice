package java_day4;
/*
4. Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number

 */

public class MedianNumber {
    public static void main(String[] args) {

        double a = 10;
        double b = 15;
        double c = 20;

        boolean aIsMedian=(b>a && a>c)||(c>a && a>b);//if A is the median number



        boolean bIsMedian=(a>b && b>c)||(c>b && b>a);//if B is the median number

//boolean bIsMedian=!aIsMedian && !cIsMedian; alternative way if we had cIsMedian

        if(aIsMedian){
            System.out.println("aIsMedian = " + aIsMedian);
        }else if (bIsMedian){
            System.out.println("bIsMedian = " + bIsMedian);

        }else{//Otherwise if C is the median number
            System.out.println("cIsMedian = "+c);

        }
/*

        if ((a > b && b > c) || (b > c && c > a)) {
            System.out.println("Medidan number is " + a);
        } else if ((a < b && b < c) || (b < c && c < a)) {
            System.out.println("Median number is " + b);
        } else {
            System.out.println("Invalid result");
        }

 */

    }
}
