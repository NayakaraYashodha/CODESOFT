package task3;

import java.util.Scanner;

import task3.BankAccount;
public class ATM {
		private BankAccount userAccount;
		private Scanner scan;
		public ATM(BankAccount account) {
			this.userAccount=account;
			this.scan=new Scanner(System.in);
		}
		public void displayMenu() {
			int choice;

			do {
				System.out.println("\nATMmenu");
				System.out.println("1.check balance");
				System.out.println("2.withdraw");
				System.out.println("3.Deposit");
				System.out.println("4.Exit");
				System.out.print("choose an option:");
				choice=scan.nextInt();
			
				switch(choice){
					case 1:
						checkBalance();
						break;
					case 2:
						withdraw();
						break;
					case 3:
						deposit();
					break;
					case 4:
						System.out.println("Thank you for using the ATM.goodbye!");
						break;
						default:
							System.out.println("Invalid choice please choose again.");
				}
			}
			while(choice!=4);
		}
		
		private void checkBalance() {
			double balance=userAccount.getBalance();
			System.out.println("your balance is: $"+balance);
		}
		private void withdraw() {
			System.out.println("enter amount to withdraw :$");
			double amount=scan.nextDouble();
			boolean success=userAccount.withdraw(amount);
			if(success) {
				System.out.println("withdrawal successful");
			}
			else {
				System.out.println("withdrawl failed Insufficient balance");
			}
		}
		private void deposit() {
			System.out.println("Enter amount to deposit:$");
			double amount=scan.nextDouble();
			userAccount.deposit(amount);
			System.out.println("deposit successful");
		}
	}


