package fruits;

public class Fruits {

	String fruitName;
	String fruitColor;
	int noOfSeeds;

	Fruits(){
		
	}
	
	Fruits(String fruitName) {
		this.fruitName = fruitName;
	}

	Fruits(String fruitName, String fruitColor) {
		this.fruitName = fruitName;
		this.fruitColor = fruitColor;
	}

	String getFruitName() {
		return fruitName;
	}

	void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	String getFruitColor() {
		return fruitColor;
	}

	void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}

	void displayFeatures(String Color) {
		System.out.println(fruitName + " is " + Color + " in color");
	}
}
