import java.util.*;

public class BankAccountProject_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your name \"Last Name, First Name\".");
		String name = input.nextLine();
		System.out.println("What is the current amount in your account?");
		double amountStart = input.nextDouble();
		System.out.println("What would you like to do with your account? Type end if you're done.");
		String choice = input.next();
		System.out.println("How much money would you like to " + choice + "?");
		double amount = input.nextDouble();
		BankAccountProject newAccount = new BankAccountProject(amountStart, name);
		
		switch (choice){
			case "deposit":	newAccount.Deposit(amount);
			break;
			case "Deposit": newAccount.Deposit(amount);
			break;
			case "withdraw": newAccount.Withdraw(amount);
			break;
			case "Withdraw": newAccount.Withdraw(amount);
			break;
		}
		
		}

	}


