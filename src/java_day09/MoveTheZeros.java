package java_day09;

import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {
            //FIRST SOLUTION:

       int[] array = {10, 0, 5, 0, 1, 0};
       Arrays.sort(array);

        int[] reversedArray=new int[array.length];
        int index=array.length-1;
        for (int element : array) {
            reversedArray[index--]=element;
        }
        System.out.println(Arrays.toString(reversedArray));

        //SECOND SOLUTION:

        int[] array1 = {10, 0, 5, 0, 1, 0};
        swapZeros(array1);
        System.out.println("Reversed Order: "+Arrays.toString(array1));
    }
    private static void swapZeros(int[] arr) {
        int nonZeroContainer=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                //will create three containers for swapping
                int temp=arr[i];
                arr[i]=arr[nonZeroContainer];
                arr[nonZeroContainer]=temp;
                nonZeroContainer++;


            }

        }

            int[] array = {10, 0, 5, 0, 1, 0};
            Arrays.sort(array);
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i]);
            }


        }

    }


/*
write a program that can move all the zeros to the end of the array.

			Example:
				array = {10, 0, 5, 0, 1, 0};

			Output:
				{10, 5, 1, 0, 0, 0};
 */