package Atmproject;

import java.util.Scanner;
import java.util.function.Predicate;

public class ATMMain {

	public static void main(String[] args) {
		CustomerAccount user_1 = new CustomerAccount(11111,0000,0.0);
		ATMService atm = new ATMService(user_1);
		Scanner input = new Scanner(System.in);
		boolean AuthenticateUser = false;
		
		Predicate<Integer> ValidAccount = acc -> acc.equals(user_1.getCustomerNumber());
		Predicate<Integer> ValidPin = pin -> pin.equals(user_1.getPinNumber());
		
		System.out.println("---Welcome to ATM Machine---");
		//User Authentication.....
		while(!AuthenticateUser) {
			System.out.println("Enter your Customer Account Number: ");
			int inputCustomerAccountNo = input.nextInt();
			System.out.println("Enter your Customer Account PIN : ");
			int inputPinNumber = input.nextInt();
			
			if(ValidAccount.test(inputCustomerAccountNo) && ValidPin.test(inputPinNumber)){
				AuthenticateUser = true;
				System.out.println("Your Login is Successful...");
				
			}else {
				System.out.println("Invalid Account details provided.. Please try again....");
			}
		}
		
		//Main Account Menu
		
		boolean ActiveSession = true;
		
		while(ActiveSession) {
			System.out.println("\n ****** ATM Home Page *******\n 1. Deposit \n 2. Withdraw \n 3. Check Balance \n 4. Exit \n Please Choose any Option to continue...");
			
				try {
				//int option = Integer.parseInt(input.nextLine());
					int option = Integer.parseInt(input.next());
					
				
					switch(option) {
						case 1:
							System.out.print("Enter amount to be deposited:  $");
							double depositAmount = Double.parseDouble(input.next());
							atm.deposit(depositAmount);
							break;
					
						case 2:
							System.out.print("Enter amount you want to withdraw:  $ ");
							double WithdrawAmount = Double.parseDouble(input.next());
							atm.withdraw(WithdrawAmount);
							break;
						case 3:
							atm.checkBalance();
							break;
						case 4:
							atm.exit();
							ActiveSession =false;
							break;
						default:
							System.out.print("Invalid Option. Please Try Again......");
					}
				}catch(Exception e) {
					
				System.out.println(e);
				
				}
//				finally {
//					input.close();
//				}
//				
			}
		input.close();
		}	

	}
