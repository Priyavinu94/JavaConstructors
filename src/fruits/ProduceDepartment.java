package fruits;

public class ProduceDepartment {

	public static void main(String[] args) {
		
		Fruits fruitOne = new Fruits();		//constructor with no arguments (reference fruitOne)
		fruitOne.setFruitName("Banana");
		fruitOne.setFruitColor("Yellow");
		fruitOne.displayFeatures(fruitOne.getFruitColor());
		
		Fruits fruitTwo = new Fruits("Kiwi");	//constructor with one argument (reference fruitTwo)
		fruitTwo.setFruitColor("Green");
		fruitTwo.displayFeatures(fruitTwo.getFruitColor());
		
		Fruits fruitThree = new Fruits("Orange","Orange");	//constructor with one argument (reference fruitThree)
		fruitThree.displayFeatures(fruitThree.getFruitColor());
		
	}

}
