package java_day06;
/*Create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0
*/

public class SalaryCalculator {
    public static void main(String[] args) {
        double result=calculateSalary(45.0,40);
        System.out.println(result);

    }
    public static double calculateSalary(double num1, int num2){
        double income=num1*num2*52;
        return num1*num2*52;
    }
}
