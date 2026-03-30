package Bank.com;

import java.util.ArrayList;
public class Bank {

	

	

	    private ArrayList<Bankaccount> accounts = new ArrayList<>();

	    public void addAccount(Bankaccount acc) {
	        accounts.add(acc);
	        System.out.println("Account added successfully!");
	    }

	    public void showAllAccounts() {
	        for (Bankaccount acc : accounts) {
	            acc.displayAccount();
	            System.out.println("-------------------");
	        }
	    }
	}
