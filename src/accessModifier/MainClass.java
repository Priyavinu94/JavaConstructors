package accessModifier;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BankAccount customer1 = new BankAccount("Priya", 685758995, 1276890959);
		boolean isAuthorizedToAccessSin = false;

		System.out.println("Enter the institution type");
		String instType = sc.next();

		if (instType.equals("Bank") || instType.equals("Employer") || instType.equals("CreditCheck")) {
			isAuthorizedToAccessSin = true;
		}

		System.out.println(" Customer Name     :  " + customer1.getName());
		System.out.println(" Customer SIN No   :  " + customer1.getSIN(isAuthorizedToAccessSin));
		System.out.println(" Customer Phone No :  " + customer1.getPhoneNo());

		System.out.println("Do you want to update phone number?");
		String response = sc.next();

		long phNoBeforeChange = customer1.getPhoneNo();

		if (response.equals("Yes")) {
			System.out.println("Enter your phone number : ");
			customer1.setPhoneNo(sc.nextLong());

			System.out.println(phNoBeforeChange == customer1.getPhoneNo() ? "Invalid phone no entered"
					: "Your phone no is updated to : " + customer1.getPhoneNo());

		} else {
			
			System.out.println(response.equals("No") ? "You selected not to update phone no. Thank you"
					: "Invalid entry. Please Enter 'Yes' or 'No' ");
		}

	}

}
