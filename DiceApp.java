package week5;

import java.util.Scanner;

public class DiceApp {

	// This program allows the user to roll two dice until they choose to exit the
	// program.

	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		
		// Tell the user what the program does:
		System.out.println("This program will roll two dice and calculate the sum of their values.\n"
				+ "You can roll the dice as many times as you'd like and then input \"false\" to quit the program.");
		
		// Set again to true to start, so that the while loop will run.
		Boolean again = true;
		
		Thread.sleep(5000);
		
		while (again) {
			// Let the user know the program is rolling the dice:
			System.out.println("\nRolling the dice...");
			Thread.sleep(2000);
			
			// Roll the dice and calculate the total:
			int dice1 = (int)(Math.random()*6 + 1);
			int dice2 = (int)(Math.random()*6 + 1);
			int total = dice1 + dice2;
			
			// Print the individual rolls and their total:
			System.out.format("You rolled a %d and a %d! Their total is %d!\n", dice1, dice2, total);
			
			Thread.sleep(1000);
			
			// Ask the user if they'd like to roll again:
			System.out.print("\nWould you like to roll again? Enter \"true\" to continue and \"false\" to quit. ");
			again = userinput.nextBoolean();
			
			// If the user chooses not to roll again then tell them the program has been ended:
			if (!again) {System.out.println("Program ended.");}
		}
			
			
		}

}


