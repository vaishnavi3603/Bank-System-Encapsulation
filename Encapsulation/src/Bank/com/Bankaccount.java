package Bank.com;

public class Bankaccount {


	    private int accountNumber;
	    private String accountHolderName;
	    private double balance;

	    public Bankaccount(int accountNumber, String accountHolderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;

	        if (balance >= 0) {
	            this.balance = balance;
	        } else {
	            this.balance = 0;
	        }
	    }

	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit!");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance!");
	        }
	    }

	    public void displayAccount() {
	        System.out.println("Acc No: " + accountNumber);
	        System.out.println("Name: " + accountHolderName);
	        System.out.println("Balance: " + balance);
	    }
	}
	
