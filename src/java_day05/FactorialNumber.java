package java_day05;

/* Write a program that can return the factorial number of any given number.
Example:
num = 5
Output: 120
(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )*/
public class FactorialNumber {
    public static void main(String[] args) {

        int factorialNumber=1;

        for (int i=1;i<=5;i++){
            factorialNumber*=i;

        }
        System.out.println(factorialNumber);
    }
}
