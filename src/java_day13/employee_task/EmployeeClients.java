package java_day13.employee_task;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee=new Employee("Andrew Ronalds","293940","Tester","Xfinity",100_000);
        Employee employee1=new Employee("Jen Nest","777777","Developer","Amazon",250_000);
        Employee employee2=new Employee("Emma Lewis","888888","Teacher","Cydeo",95_000);
        Employee employee3=new Employee("Paul Chooshnyi","0000001","Driver","United Road",120_000);

        Tester t1=new Tester(employee);
        System.out.println(employee);
        t1.work();

        System.out.println("------------------------------------------------------------------------------------------------------------------");

        Developer d1=new Developer(employee1,"Java");
        System.out.println(d1);
        d1.work();

        System.out.println("------------------------------------------------------------------------------------------------------------------");

        Teacher teacher1=new Teacher(employee2);
        System.out.println(teacher1);
        teacher1.work();

        System.out.println("------------------------------------------------------------------------------------------------------------------");

        Driver driver1=new Driver(employee3);
        System.out.println(driver1);
        driver1.work();
    }

}
