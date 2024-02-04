package java_day9;

public class ClassMatesReversed {
    public static void main(String[] args) {
        String[] classmates = {"Josh Jusa", "Kaip Bekten", "Dar Jason", "Sandra Sagi",
                "Jaimie Dobson", "Caleb Chandler", "Emily Watkins",
                "Bryson Moore", "Kevin Fuller", "Nick Carter"};

        //reverse names first
        for (String originalName : classmates) {
           String newValue =reverseName(originalName);
            System.out.println(newValue);
        }
    }
            //model a function to be able to reverse the string of names in the main method
    private static String reverseName(String classmates) {
        return new StringBuilder(classmates).reverse().toString();
    }

}



//
//        //reverse each student's names
//        for (String originalName : classmates) {
//           String newValue= reversedNames(originalName);
//            System.out.println(newValue);
//
//        }
//
//    }
//
//    private static String reversedNames(String whatever) {
//        return new StringBuilder(whatever).reverse().toString();
//    }
//}


/*
write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.

 */