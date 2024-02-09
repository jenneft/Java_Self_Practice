package java_day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));
        ArrayList<Integer> uniqueElements=new ArrayList<>(list);

        uniqueElements.removeIf(p -> Collections.frequency(uniqueElements,p)>1);
        System.out.println(uniqueElements);


        //removeIf(Predicate<? super E> filter) -->It is used to remove all the elements from the list that satisfies the given predicate.
        //frequency(list, value)-->Returns the frequency of occurrence of a value in the collection
    }
}
/*
Create a class called UniqueElements and write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]
 */