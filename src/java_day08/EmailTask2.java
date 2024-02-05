package java_day08;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Print your email:");
        String emailInput=input.nextLine();



        if (emailInput.contains("_")) {

            String firstName = emailInput.substring(0, 1).toUpperCase() + emailInput.substring(1, emailInput.indexOf("_"));

            String lastName = emailInput.substring(emailInput.indexOf("_") + 1, emailInput.lastIndexOf("_") + 2).toUpperCase() + emailInput.substring(emailInput.indexOf("_") + 2, emailInput.lastIndexOf("@"));
            //Good option-->String lastName = emailInput.substring(emailInput.indexOf("_") + 1, emailInput.indexOf("_") + 2).toUpperCase() + emailInput.substring(emailInput.indexOf("_") + 2, emailInput.indexOf("@"));
            // wrong way--> String lastName=emailInput.substring(emailInput.indexOf("_")+1).toUpperCase()+emailInput.substring(emailInput.indexOf("_",emailInput.indexOf("@")));

            String domain = emailInput.substring(emailInput.indexOf("@") + 1, emailInput.lastIndexOf("."));
            // wrong way--> String domain=emailInput.substring(emailInput.indexOf("@")+1)+emailInput.lastIndexOf(".");


            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Domain: " + domain);

        } else {
            System.err.println("Re-enter email including underscore");
        }


    }
}

//SOLUTION 2 for this task is below:
/*
            int underscoreIndex=emailInput.indexOf("_");
            int emailAtIndex=emailInput.indexOf("@");

            String firstName=emailInput.substring(0,emailInput.indexOf("_"));
            String lastName=emailInput.substring(emailInput.indexOf("_")+1,emailInput.indexOf("@"));

            String capFirstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
            String capLastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
            String domain=emailInput.substring(emailInput.indexOf("@")+1,emailInput.lastIndexOf("."));

            System.out.println("First name: "+capFirstName);
            System.out.println("Last name: "+capLastName );
            System.out.println("Domain: "+domain);


        }else{
            System.err.println("Re-enter email including underscore");
        }

*/











/*
Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple

 */