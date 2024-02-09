package java_day13.employee_task;

public class Teacher extends Employee{
    public Teacher(Employee employee) {
        super(employee.getName(),employee.getEmployeeID(),employee.getJobTitle(),employee.getCompanyName(),employee.getSalary());
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching.");
    }
}
/*
 2.3 Teacher:
       - work(): Displays "[name] is teaching".
 */