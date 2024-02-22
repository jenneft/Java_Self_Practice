package java_day17;

import java.util.*;

public class MultiplyOdds {
    public static void main(String[] args) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        map.putAll(Map.of('a', 1, 'b', 2, 'c', 3, 'd', 4, 'e', 5));

        for (Map.Entry<Character, Integer> eachValue : map.entrySet()) {
            if(eachValue.getValue()%2!=0){
                eachValue.setValue(eachValue.getValue()*2);
            }
        }
        System.out.println("map = " + map);


    }


}

/*
1. Create a class named MultiplyOdds and write a program that takes a map with characters as keys
and integers as values. The program will iterate through the map and, for each entry where the value
is an odd number, it will multiply this value by two.

         Example:
               map = {'a'=1, 'b'=2, 'c'=3, 'd'=4, 'e'=5}

         Output:
            {'a'=2, 'b'=2, 'c'=6, 'd'=4, 'e'=10}


 */