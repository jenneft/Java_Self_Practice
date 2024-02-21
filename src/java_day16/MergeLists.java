package java_day16;

import java.util.*;

public class MergeLists {
    public static void main(String[] args) {

        List<Integer> list1= new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        List<Integer> list2= new ArrayList<>(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));
        Set<Integer> list3= new LinkedHashSet<>(list1);
        list3.addAll(list2);
        System.out.println(list3);


    }
}
/*
2. Create a class named MergeLists and write a program that merges two given lists of integers into a third list. Ensure that the third list contains no duplicate elements and maintains the original order of elements from the input lists.

         Example:
            list1 = {10, 20, 30, 40, 50, 60, 70}
            list2 = {30, 40, 50, 60, 70, 80, 90, 100}

         Output:
            list3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}


            //note:
            Sets:

HashSet: Provides constant-time performance for basic operations (add, remove, contains) assuming a good hash function. Does not maintain insertion order.

LinkedHashSet: Maintains insertion order of elements. Provides constant-time performance for basic operations.

TreeSet: Maintains elements in sorted order. Provides logarithmic-time performance for basic operations.

*/
