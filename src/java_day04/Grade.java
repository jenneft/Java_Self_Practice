package java_day04;
/*5. Create a class called Grade. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				  Great job

 */

public class Grade {
    public static void main(String[] args) {
       char grade='A';

       if (grade=='A') {
           System.out.println("Exellent");
       } else if (grade=='B'){
           System.out.println("Great Job");
               }
       else if (grade =='C'){
           System.out.println("Good");
       } else if (grade=='D') {
           System.out.println("Passed");
       }else {
           System.out.println("Failed");


       }

    }
}
