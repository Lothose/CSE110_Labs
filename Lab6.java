/*-------------------------------------------------------------
// AUTHOR: Brandon Billmeyer
// FILENAME: Lab6.java
// SPECIFICATION: Program that lists and averages student scores by group. Also counts how many students per group. 
// FOR: CSE 110- Lab #6
// TIME SPENT: 4 hrs
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int numStudents = -1;
       int[] studentGroups = null;//arrays are objects
       double[] studentGrades = null;
       int numGroups = -1;  // Part 2

       //ask for number of students
       System.out.println("How many students do you have?");
       numStudents = scanner.nextInt();

       //Initialize the array based on user input
       studentGroups = new int[numStudents];
       studentGrades = new double[numStudents];
       
	   //complete the code here for part 1
       for (int i=0; i < studentGroups.length; i++) {
    	   // Using i + 1 to list entry number
    	   System.out.println("[Group #] and [Grade] for Entry "+ (i+1));
    	   //capturing user input on same line for each array. 
    	   studentGroups[i] = scanner.nextInt();
    	   studentGrades[i] = scanner.nextDouble();
       }
       System.out.println();
       System.out.println("==== List of Student Records =====");
       for (int i=0; i < studentGroups.length; i++) {
    	   System.out.println("Group " + studentGroups[i] + " - " + studentGrades[i] + " Points" );
          // Part 2: Find the number of groups
    	   if (studentGroups[i] > numGroups)  {
              numGroups = studentGroups[i];
    	   }
      }
       
       // Print out the records
       // The code below is only for Part 2

       double[] groupAverages = new double[numGroups + 1];  // Avoid group 0
       int[] groupSizes = new int[numGroups + 1];  // Avoid group 0

       // For each student record,
       //   - find the group # and the grade, and
       //   - update groupAverages and groupSizes
       
       //each if statement used to update a specific element in groupSizes and groupAverages that matches group number avoiding group 0.
       for (int i=0; i < studentGroups.length; i++) {
    	   //checking for group 1 in each element of studentGroups array. 
    	   if (studentGroups[i]==1){
    		   //adding one to groupSizes element 1 each time studentGroups matches 1
    		   groupSizes[1]++;
    		   //Averaging scores with groupAverages 1 every time a studentGroups matches 1
    		   groupAverages[1] = (groupAverages[1] + studentGrades[i]) / groupSizes[1]; 
    	   }
    	   if (studentGroups[i]==2){
    		   groupSizes[2]++;
    		   groupAverages[2] = (groupAverages[2] + studentGrades[i]) / groupSizes[2]; 
    	   }
    	   if (studentGroups[i]==3){
    		   groupSizes[3]++;
    		   groupAverages[3] = (groupAverages[3] + studentGrades[i]) / groupSizes[3]; 
    	   }
       }

      // Display the statistics of groups
      System.out.println();
      System.out.println("==== Group Statistics ===");
      // loop through number of groups
      for (int i=0; i < numGroups; i++) {
    	  //print out i + 1 for group number and i + 1 to maintain index of group size and average.  
    	  System.out.println("Group #" + (i+1) + " has " + groupSizes[i+1] + " students, average is " + groupAverages[i+1]);
      }
      // Close scanner
      scanner.close();
    }
}
