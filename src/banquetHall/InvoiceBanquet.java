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

		System.out.print("Enter the food Cost (Optional)     : 	$");
		invoice.setFoodCost(sc.nextDouble()); // set food cost before taxes

		System.out.print("Enter the bevarage Cost (Optional) : 	$");
		invoice.setBevarageCost(sc.nextDouble()); // set beverage cost before taxes

		System.out.print("Enter the tip amount (Optional)    : 	$");
		invoice.tip = sc.nextDouble();

		System.out.print("Enter the total no. of Guests      : 	#");
		int noOfGuests = sc.nextInt(); // input no. of guests for calculating Service Cess
		
		//calling boolean method, if false, warning message displayed.
		if (invoice.areEntriesValid(noOfGuests)) {		
			
			// calling first method - calculate the total base cost and store in a variable
			double totalBaseCost = invoice.calculateBaseCost(invoice.getBaseBookingCost(), invoice.getFoodCost(),
					invoice.getBevarageCost()); 
			// calling second method and store the tax calculated in a variable
			double totalTax = invoice.calculateTax(totalBaseCost); 
			// calling 3rd method calculating Service Cess									
			double serviceCess = invoice.calculateCess(noOfGuests, totalBaseCost); 
			// calling 4th method calculating total cost
			double totalCost = invoice.calculateTheTotalCost(totalBaseCost, totalTax, serviceCess); 
			
			invoice.printInvoice(noOfGuests, totalBaseCost); // calling this method prints the detailed Invoice.
			System.out.println("               Invoice Amount :  $" + totalCost);
			
		}
		
		sc.close();
	}

}
