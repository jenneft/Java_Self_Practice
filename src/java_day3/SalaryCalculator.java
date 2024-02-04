package java_day3;
/*4. calculate the following:
				salaryBeforeTax (Yearly salary before tax)
				stateTax (Yearly state tax)
				federalTax (Yearly federal tax)
				totalTax (yearly total tax)
				salaryAfterTax (Yearly salary after tax)

		Assume that there are 52 work weeks in a year.

	Display each of the above in the following format:

					Example:
						hourlyRate = $50
						weeklyHours = 45
						stateTaxRate = 6  (given as a percentage)
						federalTaxRate = 26 (given as a percentage)

					Output:
						Gross pay is: $117000.0
						Federal tax is: $30420.0
						State tax is: $7020.0
						Total tax is: $37440.0
						Net income is: $79560.0 */

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate=50;
        int weeklyHours=45;
        double stateTaxRate=6;
        double federalTaxRate=26;
        double salaryBeforeTax=52*weeklyHours*hourlyRate; //Gross Pay
        double stateTax=salaryBeforeTax*(stateTaxRate/100); //State Tax
        double federalTax=salaryBeforeTax*(federalTaxRate/100);//Federal Tax
        double totalTax=stateTax+federalTax;//Total Tax
        double salaryAfterTax=salaryBeforeTax-totalTax;//Net Income
        System.out.println("Gross Pay is: $"+salaryBeforeTax+"\n"+"Federal Tax is: $"+federalTax+
                "\n"+"State Tax is: $"+stateTax+"\n"+"Total Tax is: $"+totalTax+"\n"+
                "Net Income is: $"+salaryAfterTax);



    }
}
