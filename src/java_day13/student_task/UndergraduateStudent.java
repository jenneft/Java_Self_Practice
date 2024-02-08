package java_day13.student_task;

public class UndergraduateStudent extends Student_Child {

    private boolean conceptTests;
    private boolean upToDateAssignments;

    private static int tracker = 1;


    // Constructor


    public UndergraduateStudent(String name, String gender, int age, String studentID, String fieldOfStudy, String schoolName, char grade, boolean conceptTests, boolean upToDateAssignments) {
        super(name, gender, age, studentID, fieldOfStudy, schoolName, grade);
        this.conceptTests = conceptTests;
        this.upToDateAssignments = upToDateAssignments;
    }


    // Getter methods for conceptTests and upToDateAssignments
    public boolean isConceptTests() {
        return conceptTests;
    }

    public boolean isUpToDateAssignments() {
        return upToDateAssignments;
    }


    // create a new method to be able to use it in an overriden method
    public String evaluate() {
        return (conceptTests ? " is implementing concept tests" : " is not implementing concept tests") +
                " and " +
                (upToDateAssignments ? " is up to date on assignments" : " is not up to date on assignments");
    }

    @Override
    public void study() {

        System.out.println(getName() + evaluate());

    }

    @Override
    public String toString() {
        return "UndergraduteStudent" + tracker++ + " {" + getName() + ", " +
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