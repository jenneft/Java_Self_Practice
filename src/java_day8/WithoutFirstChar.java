package java_day8;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Print the first word:");
        String firstWord=input.nextLine();

        System.out.println("Print the second word:");
        String secondWord=input.nextLine();
        String modifiedWords=firstWord.substring(1)+secondWord.substring(1);
        System.out.println(modifiedWords);

    }
}
/*
Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
 */