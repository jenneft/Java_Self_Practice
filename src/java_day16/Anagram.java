package java_day16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "ccddabaa";
        boolean result = isAnagram(str1, str2);
        System.out.println("Is Anagram: " + result);

        String str3 = "xyze";
        String str4 = "xyzd";
        boolean result2=isAnagram(str3,str4);
        System.out.println("Is Anagram: " + result2);

    }

    private static boolean isAnagram(String str1, String str2) {
    Set<Character> set1 = new HashSet<>();// hashSet helps remove duplicates goal
    Set<Character> set2 = new HashSet<>();

    for(char each:str1.toCharArray()){
        set1.add(each);
    }

    for (char each:str2.toCharArray()){
        set2.add(each);
    }
    return set1.equals(set2);
    }

}
/*
5. Create a class named Anagram and write a program that checks if two strings are anagrams of each other, considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false

 */