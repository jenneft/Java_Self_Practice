package java_day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"));


        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (isPalindrome(str)) {
                it.remove();
            }
        }
        System.out.println(list);
    }

    private static boolean isPalindrome(String str) {
        String lowerCaseStr = str.toLowerCase();
        String reversedStr = new StringBuilder(lowerCaseStr).reverse().toString();
        return lowerCaseStr.equals(reversedStr);
    }

}


/*
6. Create a class named RemovePalindromes and write a program that removes all palindrome strings from a given list of strings. The removal should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}
 */
