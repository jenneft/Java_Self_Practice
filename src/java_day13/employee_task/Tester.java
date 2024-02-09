package java_day13.employee_task;

public class Tester extends Employee {

    public Tester(Employee employee) {
        super(employee.getName(),employee.getEmployeeID(),employee.getJobTitle(),employee.getCompanyName(),employee.getSalary());
    }
    public void work(){
        System.out.println(getJobTitle()+", "+ getName()+" is testing.");
    }
}
/*
2.1 Tester:
       - work(): Displays "[jobTitle] [name] is testing".

   2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".

   2.3 Teacher:
       - work(): Displays "[name] is teaching".

   2.4 Driver:
       - work(): Displays "[name] is driving".

   - Add any additional fields or methods as necessary.
 */