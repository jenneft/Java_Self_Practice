package java_day13.student_task;

public class Student {
    private String name, gender;
    private static int age;
    private static int tracker = 1;

    public boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    public boolean isValidNumber(int numeral) {
        return numeral < 0;
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isValidString(name)) {
            this.name = name;
        } else {
            System.err.println("Must not be null, empty, or blank");
            System.exit(1);

        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (isValidString(gender)) {
            this.gender = gender;
        } else {
            System.err.println("Must not be null, empty, or blank");
            System.exit(1);
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (isValidNumber(age)) {
            throw new IllegalArgumentException("Age must be greater than zero");
        }
    }


    public String toString() {
        return getClass().getSimpleName()+tracker++ + "{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
 Create a class named "Student" with the following specifications:
   Attributes:
       - name: String
       - age: int
       - gender: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Actions:
       - toString(): Prints the information of the Student object.
 */