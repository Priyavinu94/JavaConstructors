package depositConstructorApproach;

import java.util.Scanner;

public class DepositMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Deposit deposit = new Deposit(); // Invoking no argument constructor

		Deposit obj1 = new Deposit("1533465145616696", 5361); // Invoking constructor with 2 arguments

		System.out.println("Enter 'Y' to Deposit , 'N' to Exit");
		String choice = sc.next();

		if (choice.equals("Y")) {

			System.out.println("Enter the amount needs to be deposited");
			obj1.setDepositAmt(sc.nextDouble());
			double depositAmount = obj1.getDepositAmt();

			System.out.println("1. Insert your card OR Enter the card number");
			System.out.println("2. Enter your 4 digit PIN");

			obj1.setCardNum(sc.next());
			String accessCardNo = obj1.getCardNum();

			obj1.setPin(sc.nextInt());
			int pinNumber = obj1.getPinNum();

			double initialBalance = obj1.getBalance();
			double newBalance = obj1.depositMoney(depositAmount, accessCardNo, pinNumber);

			if (initialBalance < newBalance) {
				System.out.println("You deposited $" + obj1.getDepositAmt());
				System.out.println("New Account balance is :  $" + newBalance);
			} else {
				System.out.println("Request is declined. Invalid Card No or Invalid PIN. Please try again..");
			}

			sc.close();
		}
	}
}
