package java_day9;

public class CommonElements {
    public static void main(String[] args) {
       int[] arr1= {1,2,3,4,5};
       int[]  arr2= {4,5,6,7,8};
        System.out.println("Common Elements from arr1 and arr2 are as follows:");
        for (int i : arr1) {
            for (int j :arr2){
                if(i==j){
                    System.out.println("From arr1 "+i+" and arr2 "+j);
                    //or System.out.println(i);
                }
            }
            
        }

    }
}
/*
write a program that prints out the common elements from two integer arrays.

			Example:
				arr1: {1,2,3,4,5}
				arr2: {4,5,6,7,8}

			Output:
				4
				5
 */