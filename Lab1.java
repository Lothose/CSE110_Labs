/*------------------------------------------------------------
// AUTHOR: Brandon Billmeyer
// FILENAME: Lab1.java
// SPECIFICATION: Scanner Expressions lab 1
// FOR: CSE 110-Lab #1
// TIME SPENT: 2 hrs
//-----------------------------------------------------------*/

import java.util.Scanner; //import scanner allowing input later in program.
public class Lab1 {
	public static void main(String[] args) {
		double test1, test2, test3; //multiple variable definition of tests via double awaiting response
		final int NUM_TESTS = 3; //constant number of tests variable set as integer
		double average; //variable to hold average that could contain decimal places. 
		Scanner input = new Scanner(System.in); //open scanner input
		System.out.print("Enter the score on the first test: "); //First test prompt
		test1 = input.nextInt(); //read the next entered integer
		System.out.print("Enter the score on the second test: "); //Second test prompt
		test2 = input.nextInt(); //read the next entered integer
		System.out.print("Enter the score on the third test: "); //Third test prompt
		test3 = input.nextInt();  //read the next entered integer
		average = (test1 + test2 + test3) / (double) NUM_TESTS; //Perform math by adding tests first then dividing by casted number of test variable to allow decimal. 
		System.out.println("Your average test score is: " + average); // Display full text and answer to math done to obtain average. 
		{
			input.close(); //close scanner input to stop memory leak warning
		}
		
	}
}

