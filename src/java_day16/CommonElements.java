package java_day16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CommonElements {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>(Arrays.asList(10, 8, 11, 20, 5, 0));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));
        Set<Integer> commonElements = new TreeSet<>(set1);
        commonElements.retainAll(set2);

        System.out.println("commonElements = " + commonElements);
    }
}
/*
3. Create a class named CommonElements and write a program that identifies the common elements in two given sets of integers and returns a third set containing these common elements.

         Example:
            set1 = {10, 8, 11, 20, 5, 0}
            set2 = {30, 0, 20, 40, 50, 10, 60}

         Output:
            set3 = {0, 10, 20}
 */