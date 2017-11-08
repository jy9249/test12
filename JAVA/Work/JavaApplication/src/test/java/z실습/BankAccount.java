package z실습;

public class BankAccount implements Measurable{

	private int accountNumber;
	private int balance;
	private static int lastAssignedNumber = 100;
	
	public BankAccount() {
		lastAssignedNumber++;
		this.accountNumber = lastAssignedNumber;
		balance = 0;
	}
	
	public BankAccount(int balance) {
		lastAssignedNumber++;
		this.accountNumber = lastAssignedNumber;
		this.balance = balance;
	}
	
	public double getMeasure()
	{
		return balance;
	}
	
	public int compareTo(Object otherObject)
	{
		BankAccount other = (BankAccount)otherObject;
		if (this.balance > other.balance) {
			return 1;
		}
		if (this.balance < other.balance) {
			return -1;
		}
		return 0;
	}
	
	public String toString() {
		return "Account number: "+ accountNumber + ", balance : " + balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public boolean deposit(int amount)
	{
		if (amount <0)
			return false;
		balance += amount;
		return true;
	}
	
	public boolean withdraw(int amount)
	{
		if (amount <0)
			return false;
		if (balance <amount)
			return false;
		balance -= amount;
		return true;
	}
	
	public boolean transfer(BankAccount other, int amount)
	{
		if (amount < 0)
			return false;
		if (balance <amount)
			return false;
		balance -= amount;
		other.deposit(amount);
		return true;
	}
	
	

	
}
