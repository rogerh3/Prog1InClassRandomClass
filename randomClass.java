import java.util.Random; 
//import java.util.Scanner;

public class randomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner keyboard = new Scanner(System.in); 
		Random randomNumber = new Random(); 
		
	//	int userInput = keyboard.nextInt(); 
		
		//generate a random number between 1 and 6
		int diceRoll = randomNumber.nextInt(6) + 1; 
		
		System.out.println("Your number is: " + diceRoll); 
	}

}
