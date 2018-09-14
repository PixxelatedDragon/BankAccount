import java.util.*;

public class CreditAccount {
	public double balance;
	public String client;
	Scanner input = new Scanner(System.in);
	public CreditAccount(double amount, String name) {
		balance = amount;
		client = name;
	}
	public void Withdraw(double amount) {
		balance -= amount;
		System.out.println("You have $" + balance + " in your account.");
	}
	public void Deposit(double amount) {
		balance += amount;
		System.out.println("You have $" + balance + " in your account.");
	}
	public void recurring(double amount) {
		balance -= amount;
		System.out.println("After 6 months you will have paid $" + (amount * 6) + ".");
		System.out.println("After a year you will have paid $" + (amount * 12) + ".");
	}
}
