/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Description: (Give a brief description for each Class)
 * Due: 9/13/2021
 * Platform/compiler: Windows 10/ Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Yei Thek Wang
*/

import java.util.*;

// java class
public class WiFiDiagnosis {

	// main method
	public static void main(String[] args) {
		// Creates a new object of type Scanner from the standard input of the program.
		Scanner s = new Scanner(System.in);
		// declare and initiate variables
		String input = "";
		boolean trigger = false;

		// prompt the user.
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		System.out.println("First step: reboot your computer.");
		System.out.println("Are you able to connect with the internet? (yes or no)");

		// do-while loop for input validation.
		do {
			// get the user input and store it in the String variable "input"
			input = s.nextLine();
			// if-else statement to analyze user's input.
			if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
				// prompt the user with another solution and ask if the solution works.
				System.out.println("Second step: reboot your router");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				// change "trigger" to true, so it can exit this do-while loop
				trigger = false;
			} else if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
				// if the user say the previous solution works, exit the program.
				System.out.println("Rebooting your computer seemed to work.");
				// terminate the program.
				System.exit(0);
			} else {
				// if the user enter something else other than "yes" or "no",
				// ask the user to enter again.
				System.out.println("Invalid input. Please enter \"yes\" or \"no\".");
				// change the trigger to true, so the do-while loop will be executed again.
				trigger = true;
			}
		} while (trigger); // Here the trigger is a boolean variable which decide if the loop continues or
							// not.

		// another do-while loop for input validation.
		do {
			// get the user input and store it in the String variable "input"
			input = s.nextLine();
			// if-else statement to analyze user's input.
			if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
				// prompt the user with another solution and ask if the solution works.
				System.out.println(
						"Third step: make sure the cables to your router are plugged in firmly and your router is getting power.");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				// change "trigger" to true, so it can exit this do-while loop
				trigger = false;
			} else if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
				// if the user say the previous solution works, exit the program.
				System.out.println("Rebooting your router seemed to work.");
				// terminate the program.
				System.exit(0);
			} else {
				// if the user enter something else other than "yes" or "no",
				// ask the user to enter again.
				System.out.println("Invalid input. Please enter \"yes\" or \"no\".");
				// change the trigger to true, so the do-while loop will be executed again.
				trigger = true;
			}
		} while (trigger); // Here the trigger is a boolean variable which decide if the loop continues or
							// not.

		// another do-while loop for input validation.
		do {
			// get the user input and store it in the String variable "input"
			input = s.nextLine();
			// if-else statement to analyze user's input.
			if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
				// prompt the user with another solution and ask if the solution works.
				System.out.println("Fourth step: move your computer closer to your router");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				// change "trigger" to true, so it can exit this do-while loop.
				trigger = false;
			} else if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
				// if the user say the previous solution works, exit the program.
				System.out.println("Fixing up the wiring seemed to work.");
				// terminate the program.
				System.exit(0);
			} else {
				// if the user enter something else other than "yes" or "no",
				// ask the user to enter again.
				System.out.println("Invalid input. Please enter \"yes\" or \"no\".");
				// change the trigger to true, so the do-while loop will be executed again.
				trigger = true;
			}
		} while (trigger); // Here the trigger is a boolean variable which decide if the loop continues or
							// not.

		// another do-while loop for input validation.
		do {
			// get the user input and store it in the String variable "input"
			input = s.nextLine();
			// if-else statement to analyze user's input.
			if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
				// prompt the user with another solution and ask if the solution works.
				System.out.println("Fifth step: contact your ISP.");
				System.out.println("Make sure your ISP is hooked up to your router.");
				// change "trigger" to true, so it can exit this do-while loop.
				trigger = false;
			} else if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
				// if the user say the previous solution works, exit the program.
				System.out.println("Moving your computer closer to the router seemed to work.");
				// terminate the program.
				System.exit(0);
			} else {
				// if the user enter something else other than "yes" or "no",
				// ask the user to enter again.
				System.out.println("Invalid input. Please enter \"yes\" or \"no\".");
				// change the trigger to true, so the do-while loop will be executed again.
				trigger = true;
			}
		} while (trigger); // Here the trigger is a boolean variable which decide if the loop continues or
							// not.
		// close the scanner.
		s.close();
		// exit the program.
		System.exit(0);

	}

}
