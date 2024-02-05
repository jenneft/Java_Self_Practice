package java_day05;

/*Write a program that prints the numbers from 1 to 100. For numbers that
are multiples of both 3 and 5, print "FINRA" instead of the number.
For numbers that are multiples of 3, print
"FIN" instead of the number, and for numbers that are multiples of 5,
print "RA" instead of the number.
Example:
1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN...

 */
public class FINRA {
    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print("FINRA"+" ");
            } else if (num % 3 == 0) {
                System.out.print("FIN"+ " ");

            } else if (num % 5 == 0) {
                System.out.print("RA"+" ");

            } else {
                System.out.print(num+" ");
            }
        }

    }
}


