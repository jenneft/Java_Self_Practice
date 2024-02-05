package java_day08;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord=input.nextLine();

        System.out.println("Enter second word:");
        String secondWord=input.nextLine();

        if(firstWord.charAt(firstWord.length()-1)==secondWord.charAt(0)){
            System.out.println("Modified word as follows: "+firstWord+secondWord.substring(1));
        }else {
            System.out.println(firstWord +" "+secondWord);
        }


        input.close();

    }
}
/*
Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
 */