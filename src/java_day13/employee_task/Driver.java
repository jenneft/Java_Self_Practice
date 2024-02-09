package java_day13.employee_task;

public class Driver extends Employee {
    public Driver(Employee employee) {
        super(employee.getName(),employee.getEmployeeID(),employee.getJobTitle(),employee.getCompanyName(),employee.getSalary());
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving.");
    }
}
/*
  2.4 Driver:
       - work(): Displays "[name] is driving".

   - Add any additional fields or methods as necessary.
 */