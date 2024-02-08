package java_day13.student_task;

public class Student_Child extends Student {
    private String studentID, fieldOfStudy, schoolName;
    private char grade;

    private  static int tracker = 1;

    public Student_Child(String name, String gender, int age, String studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age);
        this.studentID = studentID;
        this.fieldOfStudy = fieldOfStudy;
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        if (isValidString(studentID)) {
            this.studentID = studentID;
        } else {
            throw new IllegalArgumentException("StudentID cannot be null/empty/blank");
        }
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (isValidString(fieldOfStudy)) {
            this.fieldOfStudy = fieldOfStudy;
        } else {
            throw new IllegalArgumentException("Field of Study cannot be null/empty/blank");
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (isValidString(schoolName)) {
            this.schoolName = schoolName;
        } else {
            throw new IllegalArgumentException("\"School Name cannot be null/empty/blank\"");

        }
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade >= 'A' && grade <= 'F') {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Grade must be between 'A' and 'F'");
        }
    }

    public void study() {
        System.out.println(getName() + " is a student of " + getSchoolName() + " school.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+tracker++ + " {" + getName() + ", " +
                getAge() + ", " + getGender() + ", " +
                "studentID='" + studentID + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}


/*
   Attributes:
       - studentId: String
       - fieldOfStudy: String
       - grade: char
       - schoolName: String

   Encapsulation:
       - Same as previous tasks.

   Actions:
       - study(): Displays a message stating the student's name and school.
       - toString(): Prints the information of the Student object (including all attributes).
 */