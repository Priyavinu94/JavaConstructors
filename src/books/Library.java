package books;

public class Library {

	public static void main(String[] args) {
		
		System.out.println("Invoking Constructor with no arguments");
		BookDetails obj1 = new BookDetails();
		obj1.setBookTitle("Learn Java: A Crash Course Guide to Learn Java in 1 Week");
		obj1.setBookAuthor("Timothy C. Needham");
		obj1.setBookPrice(16.95);
		obj1.printBookDetails(obj1.getBookTitle(), obj1.getBookAuthor(), obj1.getBookPrice());
		
		System.out.println("\n\nInvoking Constructor with One argument");
		BookDetails obj2 = new BookDetails("Five Little Indians: A Novel");
		obj2.setBookAuthor("Michelle Good");
		obj2.setBookPrice(18.21);
		obj2.printBookDetails(obj2.getBookTitle(), obj2.getBookAuthor(), obj2.getBookPrice());
		
		System.out.println("\n\nInvoking Constructor with Two arguments");
		BookDetails obj3 = new BookDetails("365 Bedtime Stories"," Disney Book Group");
		obj3.setBookPrice(16.82);
		obj3.printBookDetails(obj3.getBookTitle(), obj3.getBookAuthor(), obj3.getBookPrice());
		
		System.out.println("\n\nInvoking Constructor with all three arguments");
		BookDetails obj4 = new BookDetails("Aesop’s Fables","Anthony Vanzelli",16.20);
		obj4.printBookDetails(obj4.getBookTitle(), obj4.getBookAuthor(), obj4.getBookPrice());
	}

}
