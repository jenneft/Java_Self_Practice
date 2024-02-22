package java_day17;

import java.util.LinkedHashMap;
import java.util.Map;

public class MergeMaps {
    public static void main(String[] args) {
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        map1.put('A', 10);
        map1.put('B', 20);

        Map<Character, Integer> map2 = new LinkedHashMap<>();
        map2.put('B', 30);
        map2.put('C', 40);

        Map<Character, Integer> mergedMap = mergedMaps(map1, map2);
        System.out.println("mergedMap = " + mergedMap);


    }

    private static Map<Character, Integer> mergedMaps(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        Map<Character, Integer> mergedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> each : map1.entrySet()) {
            mergedMap.put(each.getKey(), each.getValue());
        }
        for (Map.Entry<Character, Integer> each : map2.entrySet()) {
            char key = each.getKey();
            int value = each.getValue();
            if (mergedMap.containsKey(key)) {
                value += mergedMap.get(key);
            }
            mergedMap.put(key, value);
        }
        return mergedMap;
    }
}
/*

3. Create a class named MergeMaps and write a program that merge two given maps.
If a key is present in both maps, add their corresponding values together.

         Example:
               map1 = {'A'=10, 'B'=20}
               map2 = {'B'=30, 'C'=40}

         Output:
               {'A'=10, 'B'=50, 'C'=40}

 */