package java_day07;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner score=new Scanner(System.in);

        System.out.println("Please enter your score:");
        int grade=score.nextInt();
        
        if(grade<0||grade>100){
            System.err.println("Invalid Score");
        } else if (grade>90) {
            System.out.println("Your grade is A");
            
        }else if (grade>80){
            System.out.println("Your grade is B");
        } else if (grade<70) {
            System.out.println("Your grade is C");
            
        } else if (grade<60) {
            System.out.println("Your grade is D");
            
        }else {
            System.out.println("Your grade is F");
        }

        score.close();

    }
}
/*
7. Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B

 */