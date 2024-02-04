package java_day6;
/*5. 5.1 Create a method named calculate that takes three arguments (Two integers and a char) and returns the result based on the operator.

		If the operator is +:
			The method should return the addition of the two numbers

		If the operator is -:
			The method should return the subtraction of the two numbers

		If the operator is *:
			The method should return the multiplication of the two numbers

		If the operator is /:
			The method should return the multiplication of the two numbers

	for any other operators, the method should return 0


			Example:
				int result = calculate(10, '+', 20);

			Output:
				30


	5.2 Overload the calculate method to handle double numbers.

			Example:
				double result = calculate(2.5, '*', 3.0);

			Output:
				7.5*/


public class MathUtility {
    public static void main(String[] args) {
        int result = calculateResult(3, '+', 5);
        System.out.println(result);
        double result1 = calculateResult(2.5, '*', 3.0);
        System.out.println(result1);
    }

    public static int calculateResult(int num1, char math, int num2) {
        switch (math) {
            case '+':
                return num1 + num2;

            case '-':
                return num1 - num2;

            case '*':
                return num1 * num2;

            case '/':
                return num1 / num2;
            default:
                return 0;

        }
    }
    public static double calculateResult(double num1, char math, double num2) {
        switch (math) {
            case '+':
                return num1 + num2;

            case '-':
                return num1 - num2;

            case '*':
                return num1 * num2;

            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    }
}


