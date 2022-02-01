/* Program to get complete bill at a Banquet hall by creating a class named Banquet
 * Class Attributes : Base cost for booking, Cost of Food, Taxes on Food, Cost of Beverages, Taxes on Beverages, Tips
 * Assuming : tax on food and beverages- 13%, tax on the total base cost- 18% : initialized by parameterized constructor
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
	double bevarageCost;
	double tip;
		
	//attributes initializing by invoking constructor
	double foodTax;
	double bevarageTax;
	double taxApplied;

	public Banquet() {
		System.out.println("Enter the following details based on your requirements\n");
	}

	public Banquet(double foodTax, double bevarageTax, double taxApplied) {
		this.foodTax = foodTax;
		this.bevarageTax = bevarageTax;
		this.taxApplied = taxApplied;
	}

	public void setBaseBookingCost(double baseBookingCost) {
		this.baseBookingCost = baseBookingCost;
	}

	public void setFoodCost(double foodCost) {
		this.foodCost = foodCost;
	}

	public void setBevarageCost(double bevarageCost) {
		this.bevarageCost = bevarageCost;
	}

	public double getBaseBookingCost() {
		return baseBookingCost;
	}

	public double getFoodCost() {
		return foodCost;
	}

	public double getBevarageCost() {
		return bevarageCost;
	}

	double calculateBaseCost(double baseBookingCost, double foodCost, double bevarageCost) {

		this.foodCost += foodCost * foodTax;
		this.bevarageCost += (bevarageCost * bevarageTax) + tip;
		double totalBaseCost = baseBookingCost + this.foodCost + this.bevarageCost;
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
		System.out.println(" 	   Beverage Cost ");
		System.out.println("      (includes tax and tips) :  $" + bevarageCost);
		System.out.println("-----------------------------   ------------");
		System.out.println("              Total Base Cost :  $" + totalBaseCost);
		System.out.println("             Tax on Base Cost :  $" + calculateTax(totalBaseCost));
		System.out.println(
				"    Service Cess (" + guestCount + " people)  :  $" + calculateCess(guestCount, totalBaseCost));
		System.out.println("----------------------------- : ------------");
	}

}
