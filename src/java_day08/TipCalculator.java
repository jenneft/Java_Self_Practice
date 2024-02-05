package java_day08;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)");
        String splitInquiry = input.nextLine().toLowerCase();

        System.out.println("Enter the number of people (number)");
        int customerCount = input.nextInt();

        System.out.println("Enter the check amount (number)");
        double billInfo = input.nextDouble();
        input.nextLine();

        System.out.println("Service Quality ");
        String qualityCheck = input.nextLine().toLowerCase();


        input.close();


        double totalTip = 0;
        switch (qualityCheck) {
            case "poor" -> totalTip = 0.05 * billInfo;
            case "fair" -> totalTip = 0.10 * billInfo;
            case "good" -> totalTip = 0.15 * billInfo;
            case "great" -> totalTip = 0.20 * billInfo;
            case "excellent" -> totalTip = 0.25 * billInfo;
        }

//        if (!splitInquiry.startsWith("ye") && !splitInquiry.startsWith("no")) {
//            System.err.println("yes or no");

        if (billInfo <= 0 || customerCount <= 0) {
            System.err.println("Please re-enter");
            System.exit(1);
        }
        {

            if (splitInquiry.startsWith("ye")) {
                System.out.println("Number of people entered: " + customerCount);
                System.out.println("Total to pay: " + (billInfo + totalTip));
                System.out.println("Total tip: " + totalTip);
                System.out.println("Tip per person: " + totalTip / customerCount);
            } else if (splitInquiry.startsWith("no")) {
                System.out.println("Total to pay: " + (billInfo + totalTip));
                System.out.println("Total tip: " + totalTip);
            } else {
                System.err.println("Enter yes or no");
            }
        }

    }
}



/*              TASK:
Write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75

 */