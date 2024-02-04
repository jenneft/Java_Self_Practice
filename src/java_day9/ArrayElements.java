package java_day9;

public class ArrayElements {
    public static void main(String[] args) {

        // creating an array of integers with a length of 100
        int[] array = new int[100];
        System.out.println("Values from 1 to 100 as follows");


        // assigning values from 1 to 100 to the indexes of the array
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(i + 1);
        }


        //displaying the array elements in a single line separated by spaces
        System.out.println("\nArray elements are as follows: ");
        displayArray(array);


        //displaying the array elements in a single line in reversed order, separated by spaces
        System.out.println("\n\nArrays in reversed order as follows:");
        displayArrayReversedOrder(array);


        //displaying all evenly divisible elements by 5 in a single line separated by spaces
        System.out.println("\n\nAll elements that are evenly divisible by 5 as follows: ");
        displayEvenlyDivisibleBy5(array);
    }
    private static void displayEvenlyDivisibleBy5(int[] array) {
        for (int element : array) {
            if (element % 5 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
    private static void displayArrayReversedOrder(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(i + " ");
        }
    }
    private static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");

        }
    }
}
/*
write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
 */