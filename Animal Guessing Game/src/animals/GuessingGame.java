package animals;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessingGame {
	
	public static ArrayList<Animal> animals = new ArrayList<Animal>();
	public static ArrayList<String> queries = new ArrayList<String>();
	public static ArrayList<Integer> attributeScores = new ArrayList<Integer>();
	
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
	
	public static int getAnimalsSize() {
		return animals.size();
	}
	
	public static int getQueriesSize() {
		return queries.size();
	}
	
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
	
	public static void computeAttributeScores() {
		int temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isFlies()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isFur()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isToughSkin()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isLiveWater()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isCarnivore()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isBiggerPerson()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isLayEggs()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isHasHooves()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isHasHorns()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isHasTail()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isHops()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isLongNeck()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isWarmBlooded()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isMammal()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isSwings()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isLiveJungle()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isPink()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isHardShell()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isHasSpots()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isNest()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isDen()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isPaws()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isRide()) temp++;
		}
		attributeScores.add(temp);
		temp = 0;
		
		for(int i = 0; i < getAnimalsSize(); i++) {
			if(animals.get(i).isFeline()) temp++;
		}
		attributeScores.add(temp);
	}
	
	public static int getBestQuery() {
		int myNumber = (int) Math.ceil(getAnimalsSize()/2);
		int distance = Math.abs(attributeScores.get(0) - myNumber);
		int idx = 0;
		for(int c = 1; c < attributeScores.size(); c++){
		    int cdistance = Math.abs(attributeScores.get(c) - myNumber);
		    if(cdistance < distance){
		        idx = c;
		        distance = cdistance;
		    }
		}
		return idx;
	}
	
	public static void processInput(int currQuery, boolean input) {
		switch (currQuery) {
		case 0: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isFlies() != input) 
						animals.remove(i);
				}
				break;
		case 1: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isFur() != input) 
						animals.remove(i);
				}
		break;
		case 2: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isToughSkin() != input) 
						animals.remove(i);
				}
		break;
		case 3: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isLiveWater() != input) 
						animals.remove(i);
				}
		break;
		case 4: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isCarnivore() != input)
						animals.remove(i);
				}
		break;
		case 5: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isFourLegs() != input) 
						animals.remove(i);
				}
		break;
		case 6: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isBiggerPerson() != input) 
						animals.remove(i);
				}
		break;
		case 7: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isLayEggs() != input) 
						animals.remove(i);
				}
		break;
		case 8: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isHasHooves() != input) 
						animals.remove(i);
				}
		break;
		
		case 9: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isHasHorns() != input) 
						animals.remove(i);
				}
		break;
		case 10: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isHasClaws() != input) 
						animals.remove(i);
				}
		break;
		case 11: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isHasTail() != input) 
						animals.remove(i);
				}
		break;
		case 12: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isHops() != input) 
						animals.remove(i);
				}
		break;
		case 13: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isLongNeck() != input) 
						animals.remove(i);
				}
		break;
		case 14: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isWarmBlooded() != input) 
						animals.remove(i);
				}
		break;
		case 15: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isMammal() != input) 
						animals.remove(i);
				}
		break;
		case 16: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isSwings() != input) 
						animals.remove(i);
				}
		break;
		case 17: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isLiveJungle() != input) 
						animals.remove(i);
				}
		break;
		case 18: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isPink() != input) 
						animals.remove(i);
				}
		break;
		case 19: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isHardShell() != input) 
						animals.remove(i);
				}
		break;
		case 20: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isHasSpots() != input) 
						animals.remove(i);
				}
		break;
		case 21: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isNest() != input) 
						animals.remove(i);
				}
		break;
		case 22: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isDen() != input) 
						animals.remove(i);
				}
		break;
		case 23: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isPaws() != input) 
						animals.remove(i);
				}
		break;
		case 24: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isRide() != input) 
						animals.remove(i);
				}
		break;
		case 25: for(int i = 0; i < getAnimalsSize(); i++) {
					if(animals.get(i).isFeline() != input) 
						animals.remove(i);
				}
		break;
		}
	}
	
	public static int gameLoop() {
		int returnQuery;
		computeAttributeScores();
		returnQuery = getBestQuery();
		return returnQuery;
	}
	
	public static void main(String args[]) throws Exception {
		populateAnimals();
		populateQueries();
		
		boolean gameOver = true;
		int currQuery;
		boolean input;
		while(gameOver) {
			currQuery = gameLoop();
			System.out.println("Asking query number " + currQuery);
			input = query(currQuery);
			processInput(currQuery, input);
			//queries.remove(currQuery);
			
			for(int i = 0; i < getAnimalsSize(); i++) {
				System.out.print(animals.get(i).getName() + " ");
			}
			System.out.println();
		}
	}
}
