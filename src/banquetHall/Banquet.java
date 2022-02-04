/* Program to get complete bill at a Banquet hall by creating a class named Banquet
 * Class Attributes : Base cost for booking, Cost of Food, Taxes on Food, Cost of Beverages, Taxes on Beverages, Tips
 * Assuming : Tax on food and beverages- 13%, tax on the total base cost- 18% : initialized by parameterized constructor
 *            Tip is optional ($0.0 is a valid entry for this field)
 *            Minimum booking cost of the hall for any event is $100.
 *            Hall Capacity is --  Minimum 20 people, Maximum 400 people.
 * Method calculateBaseCost(): Calculating total base cost, assuming food cost includes tax, beverage cost includes 
 *                             tax and tips, all 4 input taken from main class and set value.
 * Method calculateTax(): Calculating tax on total base cost
 * Method calculateCess(): Calculate Service Cess based on the No of guests, input taken from main class & total base cost
 * Method calculateTheTotalCost(): Calculate the total cost of booking the hall
 * Adding one more method printInvoice(): Displays/generates the final invoice including each cost
 */
package banquetHall;

public class Banquet {

	double baseBookingCost;
	double foodCost;
	double beverageCost;
	double tip;

	// attributes initializing by invoking constructor
	double foodTax;
	double beverageTax;
	double taxApplied;

	public Banquet() {
		System.out.println("Welcome !!!");
		System.out.println("Please note the basic requirements for any booking ");
		System.out.println("  1. Minimum booking cost is $100. Based on your requirements charges may vary.");
		System.out.println("  2. HST applicable for Food and beverages(In addition to the total tax on Base Cost) ");
		System.out.println("  3. Hall Capacity:  Minimum 20 people, Maximum 400 people");
		System.out.println("\nEnter the following details based on your requirements");
		System.out.println("(For optional services, you can Enter $0.0, if you don't need the service)\n ");
		
	}

	public Banquet(double foodTax, double beverageTax, double taxApplied) {
		this.foodTax = foodTax;
		this.beverageTax = beverageTax;
		this.taxApplied = taxApplied;
	}

	public void setBaseBookingCost(double baseBookingCost) {
		this.baseBookingCost = baseBookingCost;
	}

	public void setFoodCost(double foodCost) {
		this.foodCost = foodCost;
	}

	public void setBeverageCost(double bevarageCost) {
		this.beverageCost = bevarageCost;
	}

	public double getBaseBookingCost() {
		return baseBookingCost;
	}

	public double getFoodCost() {
		return foodCost;
	}

	public double getBeverageCost() {
		return beverageCost;
	}

	double calculateBaseCost(double baseBookingCost, double foodCost, double beverageCost) {

		this.foodCost += foodCost * foodTax;
		this.beverageCost += (beverageCost * beverageTax) + tip;
		double totalBaseCost = baseBookingCost + this.foodCost + this.beverageCost;
		return totalBaseCost;
	}

	double calculateTax(double totalBaseCost) {

		double totalTax = taxApplied * totalBaseCost;
		return totalTax;
	}

	double calculateCess(int guestCount, double totalBaseCost) {
		if (guestCount <= 40) {
			return (4.0 / 100 * totalBaseCost);
		} else if (guestCount <= 80) {
			return (8.0 / 100 * totalBaseCost);
		} else if (guestCount <= 150) {
			return (10.0 / 100 * totalBaseCost);
		} else {
			return (12.5 / 100 * totalBaseCost);
		}
	}

	double calculateTheTotalCost(double totalBaseCost, double totalTax, double ServiceCess) {
		// totalBaseCost = calculateBaseCost(baseBookingCost, foodCost, bevarageCost);
		// totalTax = calculateTax(totalBaseCost)
		// ServiceCess = calculateCess(guestCount, totalBaseCost)
		double totalCost = totalBaseCost + totalTax + ServiceCess;
		return totalCost;
	}

	void printInvoice(int guestCount, double totalBaseCost) {
		System.out.println("\n\n        **** INVOICE DETAILS ****        \n");
		System.out.println("Base Booking Cost of the Hall :  $" + baseBookingCost);
		System.out.println("   Cost of Food(includes tax) :  $" + foodCost);
		System.out.println(" 	      Beverage Cost ");
		System.out.println("      (includes tax and tips) :  $" + beverageCost);
		System.out.println("-----------------------------   ------------");
		System.out.println("              Total Base Cost :  $" + totalBaseCost);
		System.out.println("             Tax on Base Cost :  $" + calculateTax(totalBaseCost));
		System.out.println(
				"     Service Cess (" + guestCount + " people) :  $" + calculateCess(guestCount, totalBaseCost));
		System.out.println("----------------------------- : ------------");
	}

}
