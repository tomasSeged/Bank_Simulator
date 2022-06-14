import java.util.Scanner;
public class CurrencyExchange{

private double money;

//EXCHANGE RATES
Scanner input = new Scanner(System.in);
//constructor
public CurrencyExchange(double money)
{
	money=0.0;
}


public CurrencyExchange()
{
	this.money=money;
}


public double getMoney()
{
	return money;
}

public double usdToEuro()
{
	System.out.println("How many Dollars would you like to convert to Euros?");
	money=input.nextDouble();
	money=money*0.92;
	double roundOff = Math.round(money*100)/100;
	return roundOff;
}

public double usdToPound()
{
	System.out.println("How many Dollars would you like to convert to Pounds?");
	money=input.nextDouble();
	money=money*(0.81);
	double roundOff = Math.round(money*100)/100;
	return roundOff;
}

public double euroToUsd()
{
	System.out.println("How many Euros would you like to convert to Dollars?");
	money=input.nextDouble();
	money=money*(1.09);
	double roundOff = Math.round(money*100)/100;
	return roundOff;
}

public double euroToPound()
{
	System.out.println("How many Euros would you like to convert to Pounds?");
	money=input.nextDouble();
	money=money*(0.88);
	double roundOff = Math.round(money*100)/100;
	return roundOff;
}

public double poundToUsd()
{
	System.out.println("How many Pounds would you like to convert to Dollars");
	money=input.nextDouble();
	money=money*(1.23);
	double roundOff = Math.round(money*100)/100;
	return roundOff;
}

public double poundToEuro()
{
	System.out.println("How many Pounds would you like to convert to Euros?");
	money=input.nextDouble();
	money=money*(1.13);
	double roundOff = Math.round(money*100)/100;
	return roundOff;
}


}