package java_day5;
/*Write a program to calculate the sum of all numbers between 1 and any given number.
Example 1:
number = 100  Output:5050
Example 2:number = 50 Output: 1275  */
public class SumOfNumbers {
    public static void main(String[] args) {
        int sumOfNumbers=0;

        for(int i=1;i<=100;i++){
            sumOfNumbers+=i;
        }
        System.out.println(sumOfNumbers);

    }
}
