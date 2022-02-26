package banquetHall;

import java.util.Scanner;

public class InvoiceBanquet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Banquet obj = new Banquet();

		Banquet invoice = new Banquet(0.13, 0.13, 0.18);
		// declaring parameterized constructor to initialize the attributes : food tax,
		// beverage tax, tax percentage

		System.out.print("Enter the booking cost of the hall : 	$");
		invoice.baseBookingCost = sc.nextDouble(); // set base booking cost

		if (invoice.baseBookingCost >= 100.0) {
			System.out.print("Enter the food Cost                : 	$");
			invoice.setFoodCost(sc.nextDouble()); // set food cost before taxes

			if (invoice.getFoodCost() > 0.0) {
				System.out.print("Enter the beverage Cost            : 	$");
				invoice.setBeverageCost(sc.nextDouble()); // set beverage cost before taxes

				if (invoice.getBeverageCost() > 0.0) {
					System.out.print("Enter the tip amount               : 	$");
					invoice.tip = sc.nextDouble();

					if (invoice.tip <= 0.20 * invoice.baseBookingCost) {
						System.out.print("Enter the total no. of Guests      : 	#");
						int noOfGuests = sc.nextInt(); // input no. of guests for calculating Service Cess

						if (noOfGuests >= 20 && noOfGuests <= 400) {

							double totalBaseCost = invoice.calculateBaseCost(invoice.baseBookingCost,
									invoice.getFoodCost(), invoice.getBeverageCost());
							double totalCost = invoice.calculateTheTotalCost(totalBaseCost, noOfGuests);

							invoice.printInvoice(noOfGuests, totalBaseCost); // method to print the detailed Invoice
							System.out.println("               Invoice Amount :  $" + totalCost);
							
						} else {
							System.out.println("Tip amount exceeded maximum, Please see the instructions.");
						}
					} else {
						System.out.println("Invalid entry for No. of guests. Please see the instructions.");
					}
				} else {
					System.out.println("Beverage is mandatory service. Please enter a value greater than $0.0");
				}
			} else {
				System.out.println("Food is mandatory service. Please enter a value greater than $0.0");
			}
		} else {
			System.out.println("Invalid Entry. Minimum booking cost of the hall for any event is $100.");
		}

		sc.close();
	}

}
