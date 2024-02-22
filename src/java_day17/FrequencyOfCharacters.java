package java_day17;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String string = "bbcccaaaaa";
        Map<Character,Integer> map= getFrequencyOfCharacters(string);
        System.out.println("map = " + map);
    }

    private static Map<Character, Integer> getFrequencyOfCharacters(String string) {
        Map<Character,Integer> frequencyMap=new LinkedHashMap<>();
        for (char c: string.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }
}
/*
4. Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}

 */