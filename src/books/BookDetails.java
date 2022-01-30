package books;

public class BookDetails {

	String bookTitle;
	String bookAuthor;
	double bookPrice;

	BookDetails() {

	}

	BookDetails(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	BookDetails(String bookTitle, String bookAuthor) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}

	BookDetails(String bookTitle, String bookAuthor, double bookPrice) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

	String getBookTitle() {
		return bookTitle;
	}

	void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	String getBookAuthor() {
		return bookAuthor;
	}

	void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	double getBookPrice() {
		return bookPrice;
	}

	void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	void printBookDetails(String bookTitle, String bookAuthor, double bookPrice) {
		System.out.println(bookTitle + " written by "+bookAuthor + " costs $"+bookPrice);
	}
}
