package java_day4;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel = 8;

        if (gradeLevel <= 5 && gradeLevel >= 1) {
            System.out.println("Elementary School");
        } else if (gradeLevel <= 8 && gradeLevel >= 6) {
            System.out.println("Middle School");
        }else if (gradeLevel<=12 && gradeLevel>=9){
            System.out.println("High School");
        } else if (gradeLevel<=16 && gradeLevel>=13) {
            System.out.println("College");
        } else if (gradeLevel<=18 && gradeLevel>=17) {
            System.out.println("Grad School");
        }else {
            System.out.println("Invalid grade level.");}

    }
}
