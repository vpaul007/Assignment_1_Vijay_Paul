package Atmproject;

public class Account1 {

	private int CustomerNumber;
	private int PinNumber;
	private double AccountBalance;
	
	

	public Account1(int customerNumber, int pinNumber, double accountBalance) {
	
		this.CustomerNumber = customerNumber;
		this.PinNumber = pinNumber;
		this.AccountBalance = accountBalance;
	}

	public int getCustomerNumber() {
		return CustomerNumber;
	}

	//public void setCustomerNumber(int customerNumber) {
	//	CustomerNumber = customerNumber;
	//}

	public int getPinNumber() {
		return PinNumber;
	}

	public double getAccountBalance() {
		return AccountBalance;
	}
	
	public void addAccountBalance(double amount) {
		AccountBalance += amount;
		
	}
	
	public boolean deductAccountBalance(double amount) {
		
		if(AccountBalance >= amount) {
			AccountBalance -= amount;
			return true;
		}else {
			return false;
		}	

	}		

}
