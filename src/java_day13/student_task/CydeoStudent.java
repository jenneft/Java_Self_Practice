package java_day13.student_task;

public class CydeoStudent extends Student_Child {
    public CydeoStudent(String name, String gender, int age, String studentID, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age, studentID, fieldOfStudy, schoolName, grade);
    }

    private int batchNumber, groupNumber;
    private String programmingLanguage;
    private static int tracker = 1;

    public CydeoStudent(String name, String gender, int age, String studentID, String fieldOfStudy, String schoolName, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, gender, age, studentID, fieldOfStudy, schoolName, grade);
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.programmingLanguage = programmingLanguage;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        String batchNumberString = Integer.toString(batchNumber);

        // Check if the first character is a letter and if the string contains at least one digit
        if (Character.isLetter(batchNumberString.charAt(0)) && batchNumberString.contains("\\d")) {
            this.batchNumber = batchNumber;
        } else {
            throw new IllegalArgumentException("Invalid batch number format. Batch number must start with a letter and contain at least one digit.");
        }
    }


    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (!isValidNumber(groupNumber)) {
            throw new IllegalArgumentException("Invalid group number");
        }
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (!isValidString(programmingLanguage)) {
            throw new IllegalArgumentException("Programming Language must not be null, empty, or blank ");
        }

    }
    @Override
    public void study(){

        System.out.println(getName()+" with batch number "+batchNumber+" from group number "+groupNumber+" is up to date on Tasks and Modules.");
    }

    @Override
    public String toString() {


            return "CydeoStudent"+tracker++ +"  {" +getName()+", age "+getAge()+" y.o "+
                    getSchoolName()+" "+
                    "batchNumber=" + batchNumber +
                    ", groupNumber=" + groupNumber +
                    ", programmingLanguage='" + programmingLanguage + '\'' +
                    '}';
        }
    }

/*

   3.3 CydeoStudent:
       - Additional Attributes:
           - batchNumber: int
           - groupNumber: int
           - programmingLanguage: String
       - Encapsulation:
           - Same as previous tasks.
       - Constructor:
           - Same as previous tasks.
       - Actions:
           - Override the study method.
           - Override the toString method.
 */