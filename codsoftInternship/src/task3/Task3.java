package task3;
import java.util.Scanner;

public class Task3 {
		public static void main(String[] args) {
			//Scanner scan=new Scanner(System.in);
			//int n=scan.nextInt();
			BankAccount acc=new BankAccount(1000.0);
			ATM atm=new ATM(acc);
			atm.displayMenu();

		}

	}

