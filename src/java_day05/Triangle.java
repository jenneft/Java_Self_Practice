package java_day05;
/*Use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *

 */

public class Triangle {
    public static void main(String[] args) {
        for (int a=1; a<=10; a++){
            for (int b=1; b<=a;b++){
                System.out.print(" * ");
            }
			System.out.println();
        }

    }
}
