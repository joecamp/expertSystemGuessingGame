package animals;
import java.util.ArrayList;

public class GuessingGame {
	
	public static ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public static void populateAnimals() {
		animals.add(new Alligator());
		animals.add(new Bear());
		animals.add(new Camel());
		animals.add(new Eagle());
		animals.add(new Elephant());
		animals.add(new Flamingo());
		animals.add(new Giraffe());
		animals.add(new Hippopotamus());
		animals.add(new Kangaroo());
		animals.add(new Koala());
		animals.add(new Lion());
		animals.add(new Llama());
		animals.add(new Monkey());
		animals.add(new Ostrich());
		animals.add(new Otter());
		animals.add(new Penguin());
		animals.add(new Rhinocerous());
		animals.add(new Tiger());
		animals.add(new Turtle());
		animals.add(new Wolf());
		animals.add(new Zebra());
	}
	
	public static String query() {
		return "Hello";
	}
	
	public static void main(String args[]) {
		populateAnimals();
	}

}
