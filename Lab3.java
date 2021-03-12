/*-------------------------------------------------------------
// AUTHOR: Brandon Billmeyer
// FILENAME: Lab3.java
// SPECIFICATION: This is a small program that loops for multiple grade entries and 
// calculates the weighted grade allowing a pass or fail confirmation. 
// FOR: CSE 110- Lab #3
// TIME SPENT: 2 hrs
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        // This scanner is prepared for you to get inputs
        Scanner scanner = new Scanner(System.in);
        
        // Declare three variables for HW, midterm, and final exam grades
        // -->
        double homework = 0;
        double midtermExam = 0;
        double finalExam = 0;
        
        // Declare a loop control variable i
        // -->
        int i = 0;
      
        while (i <= 2) {
            // Design if-else control flow:
            //
            // if i is 0, asks for the homework grade
            // if i is 1, asks for the midterm exam grade
            // if i is 2, asks for the final exam grade
            //
            // You have to let the user re-try if any of the inputs is invalid.
            // - homework grade is in [0, 100]
            // - midterm grade is in [0, 100]
            // - final exam grade is in [0, 200]
            //
            // The first if-else statement is attached for your reference. You have to
            // finish the last two statments by yourself.
            // -->
        	
            if (i == 0) {
                // Ask the user for homework grade
                // -->
            	System.out.print("Enter your HOMEWORK grade: ");
                // Do input validation
                // -->
            	homework = scanner.nextInt();
                if (homework < 0 || homework > 100) {
                    // Show the error message
                    // -->
                	System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100].");
                	
                } else {
                    // Update the loop variable
                    // -->
                	i++;
                }
            }

            // The other two if-else statments go here
            // -->
            if (i == 1) {
            	System.out.print("Enter your MIDTERM EXAM grade: ");
            	midtermExam = scanner.nextInt();
            	if (midtermExam < 0 || midtermExam > 200) {
            		System.out.println("[ERR] Invalid input. A midterm grade should be in [0, 200].");
            	} else {
            		i++;
            	}
            }
            if (i == 2)  {
            	System.out.print("Enter your FINAL grade: ");
            	finalExam = scanner.nextInt();
            	if(finalExam < 0 || finalExam > 200) {
            		System.out.println("[ERR] Invalid input. A final grade should be in [0, 200].");
            	} else {
            		i++;
            	}
            }
        }

        // Calculate the weighted total by the formula showed in the PDF
        // -->
        double weighted_total = ((finalExam * 50) / 200) + (midtermExam * 0.25) + (homework * 0.25);
        System.out.println("[INFO] Student's Weighted Total is " + weighted_total);
        // Show the weighted total and tell the user s/he passed or not
        // -->
        if (weighted_total >= 50) {
            // Print "the student PASSED the class."
        	System.out.println("[INFO] Student PASSED the class");
        } else {
            // Print "the student FAILED the class."
        	System.out.println("[INFO] Student FAILED the class");
        }

        scanner.close();

    }  // End of main
} // End of class
