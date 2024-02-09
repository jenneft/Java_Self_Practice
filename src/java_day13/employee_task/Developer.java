package java_day13.employee_task;

public class Developer extends Employee {
    private String programmingLanguage;
    public Developer(Employee employee, String programmingLanguage) {
        super(employee.getName(),employee.getEmployeeID(),employee.getJobTitle(),employee.getCompanyName(), employee.getSalary());
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+", "+getName()+" is coding in "+programmingLanguage);
    }

    @Override
    public String toString() {
        return super.toString()+", programming language='"+programmingLanguage+"' ";
    }
}
/*
  2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".
 */