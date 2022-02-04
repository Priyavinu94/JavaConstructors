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
		invoice.setBaseBookingCost(sc.nextDouble()); // set base booking cost

		if (invoice.getBaseBookingCost() > 0.0) {

			System.out.print("Enter the food Cost                : 	$");
			invoice.setFoodCost(sc.nextDouble()); // set food cost before taxes

			if (invoice.getFoodCost() > 0.0) {

				System.out.print("Enter the beverage Cost            : 	$");
				invoice.setBeverageCost(sc.nextDouble()); // set beverage cost before taxes

				if (invoice.getBeverageCost() > 0.0) {

					System.out.print("Enter the tip amount               : 	$");
					invoice.tip = sc.nextDouble();

					System.out.print("Enter the total no. of Guests      : 	#");
					int noOfGuests = sc.nextInt(); // input no. of guests for calculating Service Cess

					if (noOfGuests >= 20 && noOfGuests <= 400) {

						// calling first method - calculate the total base cost and store in a variable
						double totalBaseCost = invoice.calculateBaseCost(invoice.getBaseBookingCost(),
								invoice.getFoodCost(), invoice.getBeverageCost());
						// calling second method and store the tax calculated in a variable
						double totalTax = invoice.calculateTax(totalBaseCost);
						// calling 3rd method calculating Service Cess
						double serviceCess = invoice.calculateCess(noOfGuests, totalBaseCost);
						// calling 4th method calculating total cost
						double totalCost = invoice.calculateTheTotalCost(totalBaseCost, totalTax, serviceCess);

						invoice.printInvoice(noOfGuests, totalBaseCost); // calling this method prints the detailed
																			// Invoice.
						System.out.println("               Invoice Amount :  $" + totalCost);

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
