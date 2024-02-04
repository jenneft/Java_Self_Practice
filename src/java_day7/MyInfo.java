package java_day7;


import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = info.nextInt();

        System.out.println("Enter your gender: ");
        String gender = info.next();

        info.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = info.nextLine();


        System.out.println("Enter your phone number: ");
        long phoneNumber = info.nextLong();

        System.out.println("Enter your zip code: ");
        int zipCode = info.nextInt();

        info.nextLine();

        System.out.println("Enter your School name: ");
        String schoolName = info.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = info.nextLine();

        System.out.println("Enter your State name: ");
        String state = info.next();

        System.out.println("Enter your building number: ");
        int buildingNumber = info.nextInt();

        info.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = info.nextLine();

        System.out.println(fullName + '\n' + age + '\n' + gender + '\n' + phoneNumber + '\n' + "Address:" + '\n' + '\t' + buildingNumber + " " + streetName + '\n' + '\t' + cityName + " " + state + " " + zipCode);

        info.close();
    }
}


/*11. Create a class called MyInfo and ask the user to:

      Enter your age (int)
      Enter your gender (String - One word ONLY)
      Enter your full name (String - Multiple words)
      Enter your phone number (long)
      Enter your zip code (int)
      Enter your School name (String - Can be Multiple words)
      Enter your city name (String - Can be Multiple words)
      Enter your state name (String - One word ONLY)
      Enter your building number (int)
      Enter your Street name

    Display all the inputs that the user entered in the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode


 */