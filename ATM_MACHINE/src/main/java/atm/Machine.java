package atm;

import java.util.Scanner;

public class Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		int pin=1234;
		int balance=10000;
		int withamount=0;
		int depamount=0;
		
		
		
		
		System.out.println("Enter your pin number");
		int userpin = s.nextInt();
		
		s.nextLine();
		
		if(userpin == pin)
		{
			System.out.println("Enter your name");
			String name = s.nextLine();
			System.out.println("Welcome "+name);
			
			while(true)
			{
				System.out.println("1 . Check Balance");

				System.out.println("2 . Deposit");

				System.out.println("3 . Withdraw");

				System.out.println("4 . Print Receipt");

				System.out.println("5 . Exit");
				
				int option = s.nextInt();
				
				switch(option)
				{
				case 1:
					System.out.println("Current Balance : "+balance);
					break;
					
					

				case 2:
					System.out.println("Enter Amount to Deposit");
					depamount = s.nextInt();
					balance += depamount;
					System.out.println("Successfully Credited");
					System.out.println("New Balance "+balance);
					System.out.println();
					break;
					
					

				case 3:
					System.out.println("Enter Amount to Withdraw");
					withamount = s.nextInt();
					if(withamount>balance)
					{
						System.out.println("Insufficient Balance");
						System.out.println("Try less than your balance amount or Check Balance");
					}
					else
					{
						balance-=withamount;
						System.out.println("Sucessfully Withdrawed");
						System.out.println("New Balance "+balance);
						System.out.println();
					}
					
					
					break;
					
					

				case 4:
					System.out.println("Welcome to Mohanraj's ATM");
					System.out.println("Available Balance is "+ balance);
					System.out.println("Amount deposited" + depamount);
					System.out.println("Amount WithDraw "+ withamount);
					System.out.println("Thank You");
					break;
					

				case 5:
					System.out.println("Invalid Option");
					break;
				}
				
				if(option==5)
				{
					System.out.println("Thankyou");
					break;
				}
			}
		}
		else
		{
			System.out.println("Invalid Pin Number");
		}
	}

}
