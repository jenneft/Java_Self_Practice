package java_day11;

public class CydeoStudentClients {
    public static void main(String[] args) {
        CydeoStudent student1=new CydeoStudent("Darika Joshua",31,"CD8590",'A',"B33",1);
        System.out.println(student1);
        student1.study();
        student1.attendClass();
        student1.printSchoolName();
        student1.printProgLanguage();

        CydeoStudent student2=new CydeoStudent("Erkin Dobson",29,"CD9103",'A',"B33",2);
        System.out.println(student2);
        student2.study();
        student2.attendClass();
        student2.printSchoolName();
        student2.printProgLanguage();

    }
}
