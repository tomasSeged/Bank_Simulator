import java.io.*;
import java.util.*;
public class AccountTransaction{

//Withdraw, deposit money
//currency Exchange

//attributes
private String name;
private long accNum;
private double balance;
private double withdraw;
private double deposit;

Scanner input = new Scanner(System.in);
//constructors
	public AccountTransaction()
	{
		name="unknown";
		accNum=0;
		balance=10000.0;
	}

	public AccountTransaction(String n, long accN, double balance)
	{
		name=n;
		accNum=accN;
		balance=10000.0;
	}

//get Methods

	public String getName()
	{
		return name;
	}

	public long getAccNum()
	{
		return accNum;
	}

	public double getBalance()
	{
		return balance;
	}


	public void defineName()
	{
		System.out.println("Please enter your Name:");
		name=input.nextLine();
		name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
	}

	public void defineAccNum()
	{
		try
				{
					System.out.println("Please enter your account number");
					accNum=input.nextLong();
				}
				catch(InputMismatchException e)
				{
					System.out.println("ERROR. Please try again by entering an appropriate account number.");
					System.exit(0);
		}
	}


	public void withdrawMoney()
	{
		System.out.println("How much money would you like to withdraw?");
		double withdraw=input.nextDouble();
			if(withdraw<balance){
				System.out.println("**************************************");
				System.out.println("Name: " + name + "\nAccount Number: " + accNum + "\nAmount Withdrawn: $" + withdraw + "\nRemaining Balance: $" + (balance-withdraw));
				System.out.println("**************************************");
				}
			else
				System.out.println("The amount you are trying to withdraw is morethan your the amount of your balance. \nCurrently you have: $" + balance);

	}

	public void depositMoney()
	{
		System.out.println("How much money would you like to deposit?");
		double deposit=input.nextDouble();

		System.out.println("**************************************");
		System.out.println("Name: " + name + "\nAccount Number: " + accNum + "\nAmount Deposited: $" + deposit + "\nRemaining Balance: $" + (balance+deposit));
		System.out.println("**************************************");

	}
}
