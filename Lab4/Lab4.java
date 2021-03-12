/*-------------------------------------------------------------
// AUTHOR: Brandon Billmeyer
// FILENAME: Lab4.java
// SPECIFICATION: A program to select one of 3 arithmetic operations based on user input. 
// Selections are managed by a switch statement with each case calling a user defined method. 
// FOR: CSE 110- Lab #4
// TIME SPENT: 2 hrs
//-----------------------------------------------------------*/

//package declaration for submission
package Lab4;

// Import Scanner class
import java.util.Scanner;

//public class
public class Lab4 {  
	
	//Main method
	public static void main(String[] args) {        
		// Variables for menu selection and user input via scanner   
		int selection = 1;
		int m = 1;
		
		//display menu while option 4 is not selected. 	
		do {            
			//call private method of menu. 
			displayMenu();            
			//Ask user for menu selecton
			Scanner scan = new Scanner(System.in);
			selection = scan.nextInt();
			// Use switch statement with a case per selection. Use break to end each case and allow program to resume. 		
			switch (selection) {
			//First case for calculating sum of numbers based on user input. 
			case 1 :
				System.out.println("Enter a number: ");
				m = scan.nextInt();
				System.out.println("The sum of 1 to " + m + " is " + calculateSum(m));
				break;
			//Second case for calculating factor of number based on user input. 	
			case 2 : 
				System.out.println("Enter a number: ");
				m = scan.nextInt();
				System.out.println("The factorial of " + m + " is " + calculateFactorial(m));
				break;
			//Third case for printing leftmost number based on user input. 
			case 3 :
				System.out.println("Enter a number: ");
				m = scan.nextInt();
				System.out.println("The leftmost digit of " + m + " is " + leftmostDigit(m));
				break;
			//Fourth case to print Bye when system is quit. 
			case 4 :
				System.out.println("Bye");
			//Default case to handle not covered entry. 
			default:
				//Close scanner
			    scan.close();    
			}    
		//expression to perform do while user input of selection is not 4. 
		} while (selection !=4);    
	} 
	
	//User defined method to display menu and its options. 
	private static void displayMenu() {        
		System.out.println("Please choose one option from the following menu:");        
		System.out.println("1) Calculate the sum of integers from 1 to m");        
		System.out.println("2) Calculate the factorial of a given number");        
		System.out.println("3) Display the leftmost digit of a given number");   
		System.out.println("4) Quit");		
	}
	//User defined method to calculate sum of numbers to user input number. Using a for loop. 
	private static Number calculateSum(int m) {
	   
        int sum = 0; 
 
        for (int i = 0; i <= m; i++) { 
            sum = sum + i; 
        	}
        	return sum;
	}  
	
	//User defined method to calculate factorial of user input number. Using a for loop
    private static Number calculateFactorial(int m) {
    	
    	int factorial = 0;
    	
    	for (int i = 0; i <=m; i++) {
    		factorial = factorial + m * (m - 1);
    		}
    		return factorial;
    }
    
    //User defined method to determine leftmost number of user input number. Converted to a string to use substring. 
    private static String leftmostDigit(int m) {
    	String str = Integer.toString(m);
    	String firstNum = str.substring(0,1);
    	return firstNum;

    }
}
