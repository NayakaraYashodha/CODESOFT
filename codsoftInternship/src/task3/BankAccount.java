package task3;

public class BankAccount {
			private double balance;
			public BankAccount(double iB) {
				this.balance=iB;
			}
			public double getBalance() {
				return balance;
				
			}
			public void deposit (double amount) {
				balance=balance+amount;
			}
			public boolean withdraw (double amount) {
				if(amount <=balance) {
					balance=balance-amount;
					return true;
				}
				return false;
			}
		}
		

