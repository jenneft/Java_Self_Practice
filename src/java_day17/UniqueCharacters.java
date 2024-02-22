package java_day17;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {
        String string = "aabcccdeeeef";
        Map<Character,Integer> map = uniqueCharacters(string);
        System.out.println("map = " + map);
    }

    private static Map<Character, Integer> uniqueCharacters(String string) {
        Map<Character,Integer> uniqueChars=new LinkedHashMap<>();
        for (char c:string.toCharArray()){
            uniqueChars.put(c,uniqueChars.getOrDefault(c,0)+1);
        }
        uniqueChars.entrySet().removeIf(p->p.getValue() !=1);
        return uniqueChars;
    }


}
/*
5. Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}
 */
