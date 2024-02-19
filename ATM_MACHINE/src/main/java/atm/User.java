package atm;

public class User {
    private int pin;
    private String name;
    private double balance;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public User(int pin, String name, double balance) {
		super();
		this.pin = pin;
		this.name = name;
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance-=amount;
	}
	public void receipt()
 
	{
		System.out.println("Welcome to Mohanraj's ATM");
		System.out.println("Available Balance is "+ balance);
	
		System.out.println("Thank You");
	}
    // Constructors, getters, and setters
}
