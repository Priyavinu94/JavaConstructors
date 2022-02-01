package banquetHall;

import java.util.Scanner;

public class InvoiceBanquet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Banquet obj = new Banquet();

		Banquet invoice = new Banquet(0.13, 0.13, 0.18);
		//declaring parameterized constructor to initialize the attributes : food tax, beverage tax, tax percentage 

		System.out.print("Enter the booking cost of the hall : 	$");
		invoice.setBaseBookingCost(sc.nextDouble());	//set base booking cost

		System.out.print("Enter the food Cost                : 	$");
		invoice.setFoodCost(sc.nextDouble());	//set food cost before taxes

		System.out.print("Enter the bevarage Cost            : 	$");
		invoice.setBevarageCost(sc.nextDouble());	//set beverage cost before taxes

		System.out.print("Enter the tip amount               : 	$");
		invoice.tip = sc.nextDouble();
		
		System.out.print("Enter the total no. of Guests      : 	 ");
		int noOfGuests = sc.nextInt();	//input no. of guests for calculating Service Cess

		double totalBaseCost = invoice.calculateBaseCost(invoice.getBaseBookingCost(), invoice.getFoodCost(),
				invoice.getBevarageCost());	//calling first method - calculate the total base cost and store in a variable
		double totalTax = invoice.calculateTax(totalBaseCost);	//calling second method and store the tax calculated in a variable 
		double serviceCess = invoice.calculateCess(noOfGuests, totalBaseCost);	//calling 3rd method calculating Service Cess
		double totalCost = invoice.calculateTheTotalCost(totalBaseCost, totalTax, serviceCess);	//calling 4th method calculating total cost

		invoice.printInvoice(noOfGuests, totalBaseCost);	//calling this method prints the detailed Invoice.
		System.out.println("               Invoice Amount :  $" + totalCost);
		
		sc.close();
	}

}
