/*------------------------------------------------------------
// AUTHOR: Brandon Billmeyer
// FILENAME: Lab2.java
// SPECIFICATION: Strings
// FOR: CSE 110-Lab #2
// TIME SPENT: 2 hrs
//-----------------------------------------------------------*/

//import scanner allowing input later in program. Must be outside of class
import java.util.Scanner; 

public class Lab2 {
	public static void main(String[] args) {
	//Variable declaration set to 0 or null awaiting user input. 
	String firstName = "";
	String lastName = "";
	String fullName = "";
	int nameLength = 0;
	Scanner input = new Scanner(System.in); //imported above
	
	//Using Scanner to input user first name and saving to variable
	System.out.print("Please enter first name: ");
	//use scan.nextLine due to character entry instead of int.
	firstName = input.nextLine();
	
	//Using Scanner to input user last name and saving to variable
	System.out.print("Please enter last name: ");
	lastName = input.nextLine();
	//Concatenate the full name from system input from scanner
	fullName = firstName + " " + lastName;
	System.out.println("Full name (as entered): "+ fullName);
	//Write fullName back to itself as uppercase
	fullName = fullName.toUpperCase();
	//find lenght of fullName and store it in nameLength variable
	nameLength = fullName.length();
	//Print line of full name with helpful description of output to user.
	System.out.println("Full name (in capitals): "+ fullName);
	//Print line of full name length as int with helpful description of output to user.
	System.out.println("The length of full name: " + nameLength);
	{
		//close scanner input to stop memory leak warning
		input.close(); 
	}
	//Define string variables
	String title1 = new String("cse110");
	String title2 = "cse110";
	
	//write if/else statement to print which statement is true using "=="
	if ( title1 == title2 ) {
		//Print line if "==" comparison works
		System.out.println("String comparison using \"==\" sign works");
	}
	else
	{
		//Print line if "==" comparison does not work
		System.out.println("String comparison using \"==\" sign does NOT work");
	}
	//write if/else statement to print which statement is true using "=="
	if ( title1.equals(title2) ) {
		//Print line if "equals" comparison works
		System.out.println("String comparision using \"equals\" method works");
	}
	else
	{
		//Print line if "equals" comparison does not work
		System.out.println("String comparision using \"equals\" method does NOT work");	
	}
}
}
