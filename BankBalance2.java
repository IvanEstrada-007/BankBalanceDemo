// chapter 6 practice exercise

import java.util.Scanner;

public class BankBalance2
{
	public static void main(String[] args)
	{
		// variables and constants
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter initial bank balance > ");

		balance = keyboard.nextDouble();

		
		
		// processing phase
		do
		{
			balance = balance + balance * INT_RATE;

			// output phase
			System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is $" + balance);
			year = year + 1;
			System.out.println("\nDo you want to see the balance " + "at the end of another year?");
			System.out.print("enter 1 for yes");
			System.out.print(" or any other number for no >> ");
			response = keyboard.nextInt();
		} while(response == 1); // end of do/while loop
	}
}