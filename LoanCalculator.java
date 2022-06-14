/*


							L=[MP/i][1-1(1+i)n]

* L is the loan amount
* MP is the monthly payment
* i is the interest rate per month in decimal form (interest rate percentage divided by 12)
* n is the number of months (term of the loan in months)

*/


import java.util.Scanner;
public class LoanCalculator{

private double loanAmount; //amount of money to borrow
private double rate;	//annual interest rate
private int months;		//number of months to pay back the loan
private double monthPay;	//amount of money you want to pay every month

Scanner input=new Scanner(System.in);


	public LoanCalculator()
	{
		this.loanAmount=loanAmount;
		this.rate=rate;
		this.months=months;
		this.monthPay=monthPay;
	}

	public LoanCalculator(double loanAmount, double rate, int months, double monthPay)
	{
		loanAmount=0.0;
		rate=0.0;
		months=0;
		monthPay=0.0;
	}

	public double getLoanAmount()
	{
		return loanAmount;
	}

	public double getRate()
		{
			return rate;
	}

	public double getMonths()
		{
			return months;
	}

	public double getmonthPay()
		{
			return monthPay;
	}

	public void calculateLoanAmount()
	{
		System.out.println("Interest Rate: ");
		rate=input.nextDouble();
		System.out.println("Number of months: ");
		months=input.nextInt();
		System.out.println("Monthly Payment: ");
		monthPay=input.nextDouble();

		double i=rate/1200; //interest rate per month
		double y=(double)months/12; //number of years

		loanAmount=((monthPay/i)*(1-(1/(Math.pow((1+i),months)))));
		double loanRounded = Math.round(loanAmount*100)/100;

		System.out.println("Based on the data you entered, the amount of loan you can borrow is: $" + loanRounded + "." );
	}

	public void calculateMonthlyPayment()
	{
		System.out.println("Loan Amount: ");
		loanAmount=input.nextDouble();
		System.out.println("Interest Rate: ");
		rate=input.nextDouble();
		System.out.println("Number of months: ");
		months=input.nextInt();


		double i=rate/1200; //interest rate per month
		double y=(double)months/12; //number of years

		monthPay=((loanAmount*i)*(Math.pow((1+i),months)))/((Math.pow((1+i),months))-1);

		double monthPayRounded = Math.round(monthPay*100)/100;

		System.out.println("Based on the data you entered, your monthly Payment is: $" + monthPayRounded + "." );
	}



}

