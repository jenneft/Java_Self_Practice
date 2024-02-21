package java_day16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DifferenceBetweenTwoSets {
    public static void main(String[] args) {

        Set<Integer> set1= new HashSet<>(Arrays.asList(1,2,3,5));
        Set<Integer> set2= new HashSet<>(Arrays.asList(2,3,4));
        Set<Integer> difference= new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("difference = " + difference);



        //alternative solution


        Set<Integer> set3 = new TreeSet<>(Arrays.asList(10, 8, 4, 1, 2, 3, 5));
        Set<Integer> set4 = new TreeSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> difference1 = new TreeSet<>(set1);
        difference.removeAll(set2);

        System.out.println("difference1 = " + difference1);
    }
}
/*
4. Create a class named DifferenceBetweenTwoSets and write a program that calculates the difference between two sets of integers (elements in the first set but not in the second) and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}
 */