package java_day11;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1=new Employee("Eric Jacobson",31,'M',"Project Manager",350000);
        Employee employee2=new Employee();
        System.out.println(employee1.toString());
        employee1.work();
    }
}
