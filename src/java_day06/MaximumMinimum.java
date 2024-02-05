package java_day06;
/*
3. 

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.


			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100*/


public class MaximumMinimum {
    public static void main(String[] args) {
        double result=getMaxNumber(10.5,30.5);
        System.out.println("Max # is: " + result);

    }

    public static double getMaxNumber(double num1, double num2) {
        if (num1 > num2) {
           return num1;
        }
        return num2;
    }
}
