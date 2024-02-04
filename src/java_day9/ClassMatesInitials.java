package java_day9;

public class ClassMatesInitials {
    public static void main(String[] args) {
        String[]classmates=new String[10];
        classmates[0]="Josh Jusa";
        classmates[1]="Kaip Bekten";
        classmates[2]="Sandra Sagi";
        classmates[3]="Dar Jason";
        classmates[4]="Jaimie Dobson";
        classmates[5]="Caleb Chandler";
        classmates[6]="Emily Watkins";
        classmates[7]="Bryson Moore";
        classmates[8]="Kevin Fuller";
        classmates[9]="Nick Carter";


        getInitials(classmates);

    }

    private static void getInitials(String[]names) {
        String classmates="";
        for (String fullName: names) {
            String[] nameParts=fullName.split(" ");
            String initials=nameParts[0].charAt(0)+"."+nameParts[1].charAt(0);
            System.out.println(initials);

        }

    }
}
/*
write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */