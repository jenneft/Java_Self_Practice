package java_day10;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        moveZeros(list);
        System.out.println(list);

    }

    public static void moveZeros(ArrayList<Integer> list) {
        int countZeros = 0;
        ArrayList<Integer> copyList = new ArrayList<>(list);
        for (int num : copyList) {
            if (num == 0) {
                list.remove(Integer.valueOf(0));
                countZeros++;
            }

        }
        for (int i = 0; i < countZeros ; i++) {
            list.add(0);

        }
    }
}
/*
5. Create a class called MoveTheZeros and write a program with the following specifications:
   5.1 Given an ArrayList, move all zeros to the last indexes of the ArrayList.

	            Example:
	                list: {1,0,2,0,3,0,4,0}

	            output:
	                [1, 2, 3, 4, 0, 0, 0, 0]
 */