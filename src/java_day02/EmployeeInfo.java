package java_day02;

public class EmployeeInfo {
    public static void main(String[] args) {
        String employeeName;            employeeName="Shay";
        int age;                        age=24;
        char gender;                    gender= 'F';
        String companyName;             companyName="Apple Inc";
        String jobTitle;                jobTitle="SDET";
        double yearsOfExperience;       yearsOfExperience=2.5;
        int salary;                     salary=120_000;
        boolean isFullTime;             isFullTime=true;
        boolean isMarried;              isMarried=false;
        String employeeId;              employeeId="B101";

        System.out.println("Employee name: "+employeeName+"\n"+"Gender: "+gender+"\n"+
                "Age: "+age+"\n"+"Employee ID: "+employeeId+"\n"+"Job Title: "+jobTitle+"\n"+
                "Company Name: "+companyName+"\n"+"Full Time: "+isFullTime+"\n"+
                "Years of work experience: "+yearsOfExperience+" years"+"\n"+"Salary: "+'$'+
                salary+"\n"+"Married: "+isMarried);


        }
    }

