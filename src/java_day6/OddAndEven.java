package java_day6;

/*1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

			Example:
				boolean result = isOdd(100);

			Output:
				false

	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true
	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.

			Example:
				boolean result = isEven(100);

			Output:
				true*/
public class OddAndEven {
    public static void main(String[] args) {
        boolean result = isOdd(100);
        System.out.println(result);
        boolean result1 = isEven(100);
        System.out.println(result1);


    }

    public static boolean isOdd(int num) {
        if (num % 2 == 1) {
            return true;

        } else {
            return false;
        }

    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

}

