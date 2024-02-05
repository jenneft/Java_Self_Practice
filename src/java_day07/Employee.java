package java_day07;

public class Employee {

        public String name, jobTitle;
        public int age;
        public char gender;
        public double salary;

        public void work() {

            System.out.println(jobTitle + ", " +name + " is working.");
        }

        public String toString() {
            return "Day07Employee{" +
                    "name='" + name + '\'' +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    ", salary=" + salary +
                    '}';
        }
    }

/*
      Attributes:
            name (String): used for storing the name of the employee
            age (int): used for storing the age of the employee
            gender (char): used for storing the gender of the employee
            jobTitle (String): used for storing the job title of the employee
            salary (double): used for storing the job title

      Actions:
            work(): plays the job title and name of the employee concatenated with " is working."

            toString(): returns a string representation of the employee object.

      Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.
 */

