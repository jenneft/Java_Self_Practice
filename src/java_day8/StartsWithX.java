package java_day8;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter any word starting with X: ");
        String answer = word.nextLine();
        System.out.println(answer);

        if (answer.toLowerCase().startsWith("x")) {
            //answer="a"+answer.substring(1);//another way of solving this problem
            String modifiedAnswer = "A" + answer.substring(1);
            System.out.println("Modified Answer: " + modifiedAnswer);
        }

        word.close();
    }


}

/*
write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex

 */