package java_day13.student_task;

public class StudentClients {
    public static void main(String[] args) {



        Student st1 = new Student("Dana", "Female", 28);
        Student st2 = new Student("Eric", "Male", 39);
        System.out.println(st1);
        System.out.println(st2 + "\n\n");


        //CHILD SUBCLASS 1:

        Student_Child student1 = new Student_Child("Rebecca", "Female", 31, "1234", "Java", "Cydeo", 'A');
        Student_Child student2=new Student_Child("Adrian","Male",35,"908401","Software Engineering","University of Washington",'A');
        System.out.println(student1);
        student1.study();
        System.out.println(student2);
        student2.study();



        System.out.println("\n");


        GraduateStudent grad1 = new GraduateStudent("Elliott", "Male", 35, "2345", "Java Development", "DePaul", 'A',true);
        GraduateStudent grad2=new GraduateStudent("Benjamin","Male",36,"2346","Computer Science","University of Massachusetts",'A',false);
        System.out.println(grad1);
        System.out.println(grad2);
        grad1.study();
        grad2.study();



        System.out.println("\n");



        //CHILD SUBCLASS 2:

        UndergraduateStudent underGrad1 = new UndergraduateStudent("Diego", "Male", 38, "321", "Java", "DeVry", 'A', true, true);
        UndergraduateStudent underGrad2 = new UndergraduateStudent("Manny", "Male", 21, "15125", "Python", "EWU", 'B', true, false);

        System.out.println(underGrad1);
        System.out.println(underGrad2);
        underGrad1.study();
        underGrad2.study();


        System.out.println("\n");

        //CHILD SUBCLASS 3:

        CydeoStudent cydeoStudent = new CydeoStudent("Emily", "Female", 29, "5567", "Java", "Florida Institute of Technology", 'B', 33, 152, "Java");
        CydeoStudent cydeoStudent1 = new CydeoStudent("Paul", "Male", 27, "55152", "Data Science", "Wellesley College", 'B', 1327,71 , "Java");

        System.out.println(cydeoStudent);
        System.out.println(cydeoStudent1);
        cydeoStudent.study();
        cydeoStudent1.study();

    }

}
/*
4. Create a class named "StudentClients":
   - Create multiple objects representing different students.
   - Test the methods and attributes of each object.
 */