package java_day06;
/*5.3 Create a method named square that takes an int and returns the square, hierarchically calling the
	calculate method to calculate the square.

			Example:
				int num = square(8);

			Output:
				64

	5.4 Overload the square method for double numbers.

			Example:
				double num = square(1.5);

			Output:
				2.25

	5.5 Create a method named cube that takes an int and returns the cube, hierarchically calling the
	square method to calculate the cube.

			Example:
				int num = cube(3);

			Output:
				9

	5.6 Overload the cube method for double numbers.

			Example:
				double num = cube(2.5);

			Output:
				15.625 */


public class Square {
    public static void main(String[] args) {
        int result=square(5);

        System.out.println(result);

        int result1=cube(3);
        System.out.println(result1);

        double cubeOverload=cube(2.5);
        System.out.println(cubeOverload);

    }

    public static int square(int a) {
        return a*a;

    }
    public static int cube (int a){
        return a*a*a;
    }
    public static double cube (double a){
        return a*a*a;
    }
}
