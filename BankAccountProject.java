import java.io.*;
import java.util.*;
//BankAccountClass
public class BankAccountProject {
		public double balance;
		public String name;
		Scanner input = new Scanner(System.in);
		public BankAccountProject(double b, String n) {
			balance = b;
			name = n;
			}
		public void Deposit(double amount) {
			balance = balance + amount;
			System.out.println("You have $" + balance + " in your account.");
		}
		public void Withdraw(double amount) {
			balance = balance - amount;
			System.out.println("You have $" + balance + " in your account.");
		}
	}

