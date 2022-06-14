/*
This is the main driver. This program will help the user withdraw and deposit money.
It will also exchange currency (USD, Euro, and Pound), and provide information about the bank.

NOTE: Balance of the account initially is going to be $10000.


*/
import java.util.*;
import java.io.*;

public class BankTest{

	public static void main(String[] agrs)
	{

		Scanner input=new Scanner(System.in);

		AccountTransaction a1= new AccountTransaction();

		System.out.println("Hello! Welcome to the Bank of Tom. How can I help you today?");
		System.out.println("\n1. Perform transactions on an existing account. \n2. Create a new Account. \n3. Currency Exchange \n4. Loan Calculator \n5. Contact us");
		int x=input.nextInt();

		if(x==1) //Perform transactions on an existing account.
		{
			a1.defineName();
			a1.defineAccNum();

			int n=0;
			System.out.println();
			System.out.println("Ok " + a1.getName() + ", the list of transacitions available for today are as follows: ");

			do
			{
			System.out.println("1. Withdrawal \n2. Deposit \n0. Exit Program.");
			n=input.nextInt();

			switch(n)
			{
				case 1:
					a1.withdrawMoney();
				break;

				case 2:
					a1.depositMoney();
				break;

				case 0:
					System.out.println("Thank you. Have a great day!");
					System.exit(0);
				break;

				default:
					System.out.println("ERROR. Try again by entering numbers only from 0 to 2.");
				break;
			}//switch


				}//do
			while(n!=0);

		}//if


		if(x==2) //to create a new account
			{
				System.out.println("An electronic way of filling out forms has been arranged. Open the text file 'NewUser' to fill out the form. \nIf you want a receipt, please come back after filling out the form.");
				String fileName="NewUser.txt";
				Scanner inputStream=null;
				System.out.println();


					try
					{
						inputStream = new Scanner(new File(fileName));
					}
					catch(FileNotFoundException e)
					{
						System.out.println("ERROR. The file you wanted is not available!");
						System.exit(0);
					}
					while(inputStream.hasNextLine())
					{
						System.out.println(inputStream.nextLine());
					}
					inputStream.close();
			}
		if(x==3) //currency conversion
			{
				CurrencyExchange c1=new CurrencyExchange();
				System.out.println("Which type of conversion would you like:");
				System.out.println("1. USD to Euro \n2. USD to Pound \n3. Euro to USD \n4. Euro to Pound \n5. Pound to USD \n6. Pound to Euro");
				int q = input.nextInt();

				switch(q)
				{
					case 1:
						System.out.println("The amount of $ you entered is: " + c1.usdToEuro()+ " Euros");
					break;

					case 2:
						System.out.println("The amount of $ you entered is: " + c1.usdToPound() +" Pounds");
					break;

					case 3:
						System.out.println("The amount of Euros you entered is: $" + c1.euroToUsd());
					break;

					case 4:
						System.out.println("The amount of Euros you entered is: " + c1.euroToPound() + " Pounds");
					break;

					case 5:
						System.out.println("The amount of Pounds you entered is: $" + c1.poundToUsd());
					break;

					case 6:
						System.out.println("The amount of Pounds you entered is: " + c1.poundToEuro() + " Euros");
					break;

					default:
						System.out.println("Choose only from 1 to 6.");
						System.exit(0);
					break;

				}
			}

		if(x==4) //loan calculator
		{
			LoanCalculator c= new LoanCalculator();
			System.out.println("What would you like to calculate? ");
			System.out.println("\t1. Loan Amount \n\t2. Monthly Payment");
			int z = input.nextInt();
			switch(z)
			{
				case 1:
					c.calculateLoanAmount();
				break;

				case 2:
					c.calculateMonthlyPayment();
				break;

				default:
					System.out.println("Please choose only from numbers 1 and 2.");
					System.exit(0);
				break;
			}
		}

		if(x==5) //provide bank information
			{
				System.out.println("Hello there, I will help you in providing information about our bank." + "\nThe information will be printed in a text file. What would you like to name the file?");
				String bankInfo = input.next(); //prompt user to enter a name for the file
				PrintWriter outputStream = null; // define the output stream of type PrintWriter and initialize

				try
					{
						outputStream=new PrintWriter(bankInfo);
					}
				catch(FileNotFoundException e)
					{
						System.out.println("There was an error in openinng file "+bankInfo + ". Please try again.");
						System.exit(0);
					}
				outputStream.println("Our Bank information is as follows: \nName of Bank: BANK OF TOM\nMain Office Address: 18 Hanover St.\nRego Park, NY 11374\nContact Information: bankoftom@bot.com\n+41123654700\nwww.bankoftom.org");
				outputStream.close();
			}

		if(x!=1&&x!=2&&x!=3&&x!=4&&x!=5)
		{
			System.out.println("ERROR. Enter numbers only from 1 to 5.");
			System.exit(0);
		}
	}
}

