package java_day6;
/*4.

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days
*/

public class DayAndMonth {
    public static void main(String[] args) {
        day(7);
        monthName(12);
        daysInMonth(12);
    }
    public static void day(int day) {
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Number");
        }
    }
    public static void monthName(int monthName) {
        switch (monthName) {
            case 1 -> System.out.println("Jan");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("Mar");
            case 4 -> System.out.println("Apr");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("Jun");
            case 7 -> System.out.println("Jul");
            case 8 -> System.out.println("Aug");
            case 9 -> System.out.println("Sep");
            case 10 -> System.out.println("Oct");
            case 11 -> System.out.println("Nov");
            case 12 -> System.out.println("Dec");
            default -> System.out.println("Invalid Number");
        }
    }
    public static void daysInMonth(int daysInMonth) {
        switch (daysInMonth) {
            case 1 -> System.out.println("31 Days");
            case 2 -> System.out.println("28 or 29 Days");
            case 3 -> System.out.println("31 Days");
            case 4 -> System.out.println("30 days");
            case 5 -> System.out.println("31 Days");
            case 6 -> System.out.println("30 Days");
            case 7 -> System.out.println("31 Days");
            case 8 -> System.out.println("31 Days");
            case 9 -> System.out.println("30 Days");
            case 10 -> System.out.println("31 Days");
            case 11 -> System.out.println("30 Days");
            case 12 -> System.out.println("December has 31 Days");
            default -> System.out.println("Invalid Number");
        }
    }
}

