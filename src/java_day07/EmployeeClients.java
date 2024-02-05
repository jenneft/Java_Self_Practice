package java_day07;


public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.name="Benjamin Moore";
        employee1.age=28;
        employee1.gender='M';
        employee1.jobTitle="Project Manager";
        employee1.salary=150_000;

        employee1.work();
        System.out.println(employee1);

        Employee employee2=new Employee();
        employee2.name="Addison Harper";
        employee2.age=32;
        employee2.gender='F';
        employee2.jobTitle="Software Engineer";
        employee2.salary=240_000;

        employee2.work();
        System.out.println(employee2);



    }
}
