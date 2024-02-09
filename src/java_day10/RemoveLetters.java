package java_day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveLetters {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("$", "A", "B", "1", "2", "c", "d", "@", "!", "3", "4"));
        ArrayList<String >updatedList=new ArrayList<>(list);
        updatedList.removeIf(p-> p.length()==1 && Character.isLetter(p.charAt(0)));
        System.out.println(updatedList);

        //Option2:
        ArrayList<Character> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list1.removeIf(p -> Character.isLetter(p));

        System.out.println(list1);


    }
}
/*
Create a class called RemoveLetters and write a program with the following steps:
    10.1 Given an ArrayList of characters, remove all the letters.

			Example:
				list = {'$', A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'}

			output:
				['$',  '1', '2', '@', '!', '3', '4']

 */