package java_day07;

import java.util.Scanner;

public class FamilyMembers {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter the number of people in your household?");
            int answer = user.nextInt();
        if(answer<0) {
            System.err.println("Please Enter Valid Input");
        }
        if(answer<=2){
            System.out.println("Live with less than three people.");
        } else if (answer<=6) {
            System.out.println("Live with 3 - 6 people.");

        }else {
            System.out.println("Live with more than six people.");
        }
        user.close();
    }
}

/* Create a class named FamilyMembers and write a program that asks the user how many people they live with.

    If the user lives with fewer than three people, print "Live with less than three people."
    If the user lives with 3 - 6 people, print "Live with 3 - 6 people."
    If the user lives with more than six people, print "Live with more than six people."

        Example:
             How many people do you live with?
             Input: 3

        Output:
             Live with less than three people

 */