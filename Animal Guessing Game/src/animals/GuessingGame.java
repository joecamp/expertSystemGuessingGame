package animals;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessingGame {
	
	// Current knowledge base (which is reduced on user input)
	public static ArrayList<Animal> animals = new ArrayList<Animal>();
	// All the possible questions that can be asked to the user
	public static ArrayList<String> queries = new ArrayList<String>();
	// Represents how many animals in the current knowledge base have a value of true for each
	// attribute
	public static ArrayList<Integer> attributeScores = new ArrayList<Integer>();
	// Already asked queries (used to determine when we need to start guessing at animals)
	public static ArrayList<Integer> askedQueries = new ArrayList<Integer>();
	
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
	
	public static void populateQueries() {
		queries.add("Does the animal fly?");
		queries.add("Does the animal have fur?");
		queries.add("Does the animal have tough skin?");
		queries.add("Does the animal primarily live underwater?");
		queries.add("Is the animal a carnivore?");
		queries.add("Does the animal have four legs?");
		queries.add("Is the animal bigger than a human adult?");
		queries.add("Does the animal lay eggs?");
		queries.add("Does the animal have hooves?");
		queries.add("Does the animal have horns?");
		queries.add("Does the animal have claws?");
		queries.add("Does the animal have a noticeable tail?");
		queries.add("Does the animal hop?");
		queries.add("Does the animal have a long neck?");
		queries.add("Is the animal warm-blooded?");
		queries.add("Is the animal a mammal?");
		queries.add("Does the animal swing from trees?");
		queries.add("Does the animal live in the jungle?");
		queries.add("Is the animal pink?");
		queries.add("Does the animal have a hard shell?");
		queries.add("Does the animal have spots?");
		queries.add("Does the animal create/live in a nest?");
		queries.add("Does the animal create/live in a den?");
		queries.add("Does the animal have paws?");
		queries.add("Is the animal ridden by people?");
		queries.add("Is the animal a feline?");
	}
	
	// Determine whether the user wants to play the guessing game (forward
	// chaining) or 
	public static int askGameType() throws Exception {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println("Type 0 to play the guessing game (forward chaining) "
				+ " or 1 to use the knowledge base pedagogically (backward chaining)");
		String input = reader.next();
			
		if(input.compareTo("0") == 0) return 0;
			
		else if(input.compareTo("1") == 0) return 1;
			
		else throw new Exception("Cannot read input, use one of the following"
				+ "phrases: 0, 1");
	}
	
	// Ask the user a query, return input
	public static boolean query(int i) throws Exception {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println(queries.get(i));
		String input = reader.next();
		
		if(input.compareTo("yes") == 0 ||
		   input.compareTo("y") == 0 ||
		   input.compareTo("Yes") == 0) return true;
		
		else if(input.compareTo("no") == 0 ||
				input.compareTo("n") == 0 ||
				input.compareTo("No") == 0) return false;
		
		else throw new Exception("Cannot read input, use one of the following"
				+ "phrases: yes, y, Yes, no, n, No");
	}
	
	// Ask the user if the unknown is some animal, return input
	public static boolean guessAnimal(int i) throws Exception {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println("Is the animal a/an " + animals.get(i).getName().toLowerCase() + "?");
		String input = reader.next();
		
		if(input.compareTo("yes") == 0 ||
		   input.compareTo("y") == 0 ||
		   input.compareTo("Yes") == 0) return true;
		
		else if(input.compareTo("no") == 0 ||
				input.compareTo("n") == 0 ||
				input.compareTo("No") == 0) return false;
		
		else throw new Exception("Cannot read input, use one of the following"
				+ "phrases: yes, y, Yes, no, n, No");
	}
	
	// Used for the pedagogical option, determine which animal to use
	public static Animal determineAnimal() throws Exception {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the name of animal to use:");
		String input = reader.next();
		for(int i = 0; i < animals.size(); i++) {
			if(input.compareTo(animals.get(i).getName()) == 0 ||
			   input.compareTo(animals.get(i).getName().toLowerCase()) == 0) {
				return animals.get(i);
			}
		}
			
		throw new Exception("Input animal is not in the knowledge base");
	}
		
	// Used for the pedagogical option, determine if the user's animal
	// matches the animal in the knowledge base
	public static boolean checkAnimalAttributes(Animal inputAnimal) throws Exception {
		boolean input = query(0);
		if(!input == inputAnimal.isFlies()) {
			return false;
		}
		input = query(1);
		if(!input == inputAnimal.isFur()) {
			return false;
		}
		input = query(2);
		if(!input == inputAnimal.isToughSkin()) {
			return false;
		}
		input = query(3);
		if(!input == inputAnimal.isLiveWater()) {
			return false;
		}
		input = query(4);
		if(!input == inputAnimal.isCarnivore()) {
			return false;
		}
		input = query(5);
		if(!input == inputAnimal.isFourLegs()) {
			return false;
		}
		input = query(6);
		if(!input == inputAnimal.isBiggerPerson()) {
			return false;
		}
		input = query(7);
		if(!input == inputAnimal.isLayEggs()) {
			return false;
		}
		input = query(8);
		if(!input == inputAnimal.isHasHooves()) {
			return false;
		}
		input = query(9);
		if(!input == inputAnimal.isHasHorns()) {
			return false;
		}
		input = query(10);
		if(!input == inputAnimal.isHasClaws()) {
			return false;
		}
		input = query(11);
		if(!input == inputAnimal.isHasTail()) {
			return false;
		}
		input = query(12);
		if(!input == inputAnimal.isHasStripes()) {
			return false;
		}
		input = query(13);
		if(!input == inputAnimal.isHops()) {
			return false;
		}
		input = query(14);
		if(!input == inputAnimal.isLongNeck()) {
			return false;
		}
		input = query(15);
		if(!input == inputAnimal.isWarmBlooded()) {
			return false;
		}
		input = query(16);
		if(!input == inputAnimal.isMammal()) {
			return false;
		}
		input = query(17);
		if(!input == inputAnimal.isSwings()) {
			return false;
		}
		input = query(18);
		if(!input == inputAnimal.isLiveJungle()) {
			return false;
		}
		input = query(19);
		if(!input == inputAnimal.isPink()) {
			return false;
		}
		input = query(20);
		if(!input == inputAnimal.isHardShell()) {
			return false;
		}
		input = query(21);
		if(!input == inputAnimal.isHasSpots()) {
			return false;
		}
		input = query(22);
		if(!input == inputAnimal.isNest()) {
			return false;
		}
		input = query(23);
		if(!input == inputAnimal.isDen()) {
			return false;
		}
		input = query(24);
		if(!input == inputAnimal.isPaws()) {
			return false;
		}
		input = query(25);
		if(!input == inputAnimal.isRide()) {
			return false;
		}
		input = query(26);
		if(!input == inputAnimal.isFeline()) {
			return false;
		}
		return true;
	}
	
	// Populate attributeScores
	public static void computeAttributeScores() {
		int temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isFlies()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isFur()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isToughSkin()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isLiveWater()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isCarnivore()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isBiggerPerson()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isLayEggs()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isHasHooves()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isHasHorns()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isHasTail()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isHops()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isLongNeck()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isWarmBlooded()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isMammal()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isSwings()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isLiveJungle()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isPink()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isHardShell()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isHasSpots()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isNest()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isDen()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isPaws()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isRide()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < animals.size(); i++) {
			if(animals.get(i).isFeline()) temp++;
		}
		attributeScores.add(temp);
	}
	
	// Get the best query that will split the knowledge base in half
	public static int getBestQuery() {
		// the number of animals divided by 2 (heuristic)
		int myNumber = (int) Math.ceil(animals.size()/2);
		// initial distance
		int distance = Math.abs(attributeScores.get(0) - myNumber);
		// initial index
		int idx = 0;
		for(int c = 1; c < attributeScores.size(); c++){
		    int cdistance = Math.abs(attributeScores.get(c) - myNumber);
		    if(cdistance < distance){
		        idx = c;
		        distance = cdistance;
		    }
		}
		if(askedQueries.contains(idx) || distance == animals.size()) return -1;  // Signal the end of asking queries
		askedQueries.add(idx);
		return idx;
	}
	
	// Remove impossibilities from the knowledge base depending on the user's input
	public static void processInput(int currQuery, boolean input) {
		ArrayList<Integer> markedForDeletion = new ArrayList<Integer>();
		ArrayList<Animal> tempAnimals = new ArrayList<Animal>();
		switch (currQuery) {
		case 0: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isFlies() != input) 
						markedForDeletion.add(i);
				}
				break;
		case 1: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isFur() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 2: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isToughSkin() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 3: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isLiveWater() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 4: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isCarnivore() != input) {
						markedForDeletion.add(i);
					}
				}
		break;
		case 5: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isFourLegs() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 6: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isBiggerPerson() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 7: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isLayEggs() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 8: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isHasHooves() != input) 
						markedForDeletion.add(i);
				}
		break;
		
		case 9: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isHasHorns() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 10: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isHasClaws() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 11: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isHasTail() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 12: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isHops() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 13: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isLongNeck() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 14: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isWarmBlooded() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 15: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isMammal() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 16: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isSwings() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 17: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isLiveJungle() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 18: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isPink() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 19: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isHardShell() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 20: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isHasSpots() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 21: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isNest() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 22: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isDen() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 23: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isPaws() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 24: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isRide() != input) 
						markedForDeletion.add(i);
				}
		break;
		case 25: for(int i = 0; i < animals.size(); i++) {
					if(animals.get(i).isFeline() != input) 
						markedForDeletion.add(i);
				}
		break;
		}
		
		for(int i = 0; i < animals.size(); i++) {
			if(!markedForDeletion.contains(i)) {
				tempAnimals.add(animals.get(i));
			}
		}
		animals = tempAnimals;
	}
	
	// Loop through queries
	public static int gameLoop() {
		int returnQuery;
		computeAttributeScores();
		returnQuery = getBestQuery();
		return returnQuery;
	}
	
	public static void main(String args[]) throws Exception {
		// Guessing Game (forward chaining) version
		if(askGameType() == 0) {
			populateAnimals();
			populateQueries();
		
			boolean gameOver = false;
			int currQuery;
			boolean input;
			/*Print out all the animals (used for debugging)
			for(int i = 0; i < getAnimalsSize(); i++) {
			System.out.print(animals.get(i).getName() + " ");
			}*/
			while(!gameOver) {
				currQuery = gameLoop();
				//System.out.println("Asking query number " + currQuery);
				if(currQuery == -1) break;
				input = query(currQuery);
				processInput(currQuery, input);
			
				/* Print out the animals that the unknown animal may be (used for debugging)
				for(int i = 0; i < getAnimalsSize(); i++) {
					System.out.print(animals.get(i).getName() + " ");
				}
				System.out.println();*/
			}
		
			// Start making guesses at the animal
			while(!gameOver) {
				// No more animals are in the knowledge base that match this animal
				if(animals.size() == 0) {
					System.out.println("No more animals exist in the knowledge base!");
					break;
				}
				// End of game, animal has been guessed
				if(guessAnimal(0)) {
					System.out.println("The animal has been guessed!  It was a/an " + animals.get(0).getName().toLowerCase() + "!");
					break;
				}
				else {
					animals.remove(0);
				}
			}
		}
		
		// Pedagogical (backward chaining) version
		else {
			populateAnimals();
			populateQueries();
			Animal inputAnimal;
			inputAnimal = determineAnimal();
			boolean isInputAnimal = checkAnimalAttributes(inputAnimal);
			if(isInputAnimal) System.out.println("Everything checks out, the animal you entered has all the attributes of a/an " +
				inputAnimal.getName().toLowerCase() + " in the knowledge base");
			else System.out.println("The data you provided does not match the attributes of a/an " +
				inputAnimal.getName().toLowerCase() + " in the knowledge base");
		}
	}
}
