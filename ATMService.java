package Atmproject;

public class ATMService implements ATMFunctionality{
	
	private CustomerAccount account;
	

	public ATMService(CustomerAccount account) {
	
		this.account = account;
	}

	@Override
	public void deposit(double amount) {
		if(amount >0) {
			account.addAccountBalance(amount);
			System.out.println("Amount Deposited Successfully.. Balance is: $" + account.getAccountBalance());
		}else {
			System.out.println("Invalid Amount......");
		}
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount > 0 && account.deductAccountBalance(amount)) {
			
			System.out.println("Amount Withdrawn Successfully.. Balance is: $" + account.getAccountBalance());
		}else {
			System.out.println("Insufficient Amount Requested......");
		}
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Your Current Balance is: $" + account.getAccountBalance());
	
		
	}

	@Override
	public void exit() {
		System.out.println("Thank you for using ATM Service!!....Good..Bye...");
		
	}

}
