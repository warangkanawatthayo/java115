
import java.text.NumberFormat;

//Assignment8
//Chapter8 exercise11&12

//Each BankAccount object represents one user's account
//Information including name and balance of money

public class BankAccount1 {

	// To Define the fields and add the transactionFee
	String name;
	double balance;
	double transactionFee = 0.00;

	// To set the constructor

	public BankAccount1(String name, double balance, double transactionFee) {
		this.name = name;
		this.balance = balance;
		this.transactionFee = transactionFee;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	// To create the condition to prevent negative balance

	public void withdraw(double amount) {
		if((balance - amount - transactionFee) < 0) {
			System.out.println("Non-sufficient funds.");
		} else {
			balance = balance - (amount + transactionFee);
		}
	}
	
	//To set a format for the account balance
	
	public String getBalanceFormatted() {
		String formattedBalance = NumberFormat.getCurrencyInstance().format(this.balance);
		return formattedBalance;
	}
	
	//To add a toString method to the BankAccount

	public String toString() {
		return (name + ", " + getBalanceFormatted());
	}

}