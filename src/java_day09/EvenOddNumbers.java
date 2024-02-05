package java_day09;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] result=findOddOrEven(array);
        System.out.println("result = " + result[0]+" count of even numbers "+result[1]+" count of odd numbers ");
    }

    private static int[] findOddOrEven(int[] array) {
        int odd = 0;
        int even = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[] {even,odd};
    }
}
/*
write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.
				    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};

       int[]counts= evenOrOdd(array);
        System.out.println("The array has "+counts[0]+" even numbers and "+counts[1]+" odd numbers.");

    }

    private static int[] evenOrOdd(int[] array) {
        int even=0;
        int odd=0;
        for(int num:array){
            if(num%2==0){
                even++;
            } else{
                odd++;
            }
        }
        return new int[]{even, odd};

    }

}
 */