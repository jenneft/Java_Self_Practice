package java_day13.student_task;

public class GraduateStudent extends Student_Child {
    private boolean hasDissertation;
    private static int tracker = 1;
    public GraduateStudent(String name, String gender, int age, String studentID, String fieldOfStudy, String schoolName, char grade,boolean hasDissertation) {
        super(name, gender, age, studentID, fieldOfStudy, schoolName, grade);
        this.hasDissertation=hasDissertation;
    }

    public boolean hasDissertation() {
        return hasDissertation;
    }

    public String evaluateDissertation() {
        return hasDissertation ? " has defended a dissertation." : " has not yet defended a dissertation.";
    }

    @Override
    public void study() {
        System.out.println(getName()+evaluateDissertation());
    }
    @Override
    public String toString() {
        return "GraduteStudent" + tracker++ + " {" + getName() + ", " +
                getAge() + ", " + getGender() + ", " + getStudentID() + ", " + getFieldOfStudy() + ", " + getSchoolName() + '}';
    }
}






/*
3.1 GraduateStudent:
       - Override the study method.
       - Add any additional fields and methods as necessary.

   3.2 UndergraduateStudent:
       - Same as GraduateStudent.
 */