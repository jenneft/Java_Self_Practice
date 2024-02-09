package java_day13.employee_task;

public class Employee {
    private String name,employeeID, jobTitle, companyName;
    private double salary;
    private static int tracker=1;

    public boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    public Employee(String name, String employeeID, String jobTitle, String companyName, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!isValidString(name)) {
            throw new IllegalArgumentException("Must not be null, empty, or blank");
        }
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        if (!isValidString(employeeID)) {
            throw new IllegalArgumentException("Must not be null, empty, or blank");
        }
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (!isValidString(jobTitle)) {
            throw new IllegalArgumentException("Must not be null, empty, or blank");
        }this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (!isValidString(companyName)) {
            throw new IllegalArgumentException("Must not be null, empty, or blank");
        }
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            throw new IllegalArgumentException("Must be greater then Zero");
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(jobTitle+", "+name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+tracker++ +" "+
                "name= "+name+
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary ;
    }
}
/*
Employee Task Requirements:
1. Create a subclass of Person named "Employee" with the following specifications:
   Attributes:
       - employeeId: String
       - jobTitle: String
       - salary: double
       - companyName: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Methods:
       - work(): Displays the employee's job title and name.
       - toString(): Returns a string representation of the Employee object.
 */