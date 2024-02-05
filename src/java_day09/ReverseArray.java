package java_day09;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        //additional solution using String builder:
        System.out.println("\n");
        for (int j = array.length - 1; j >= 0; j--) {
            StringBuilder reverse=new StringBuilder();
            reverse.append(array[j]).append(" ");
            System.out.print(reverse.toString());
        }




        }

    }

            //additional solution using String builder:




/*
write a program to reverse an array of integers and return it as a new one.

			Example:
				array = {1,2,3,4,5};

			Output:
				reversedArray = {5,4,3,2,1};
 */