/*-------------------------------------------------------------
// AUTHOR: Brandon Billmeyer
// FILENAME: Student.java
// SPECIFICATION: public student class to hold student data. To be used with Lab8.java
// FOR: CSE 110- Lab #8
// TIME SPENT: 2 hrs
//-----------------------------------------------------------*/
package Lab8;

public class Student {
	private String sFullName, sAsuID;
	private double sGrade;
	private int updates;
	private int accessed;
	
	//standard construtor for all values to be passed in
    public Student(String fullName, String asuID, double grade) {
        this.sFullName = fullName;
        this.sAsuID = asuID;
        this.sGrade = grade; 
    }
    //Constructor for default entry with sentinel
    public Student() {
    	this.sFullName = null;
    	this.sAsuID = null;
    	this.sGrade = -1;
	}
    
    //Public method setters that incriment updates by 1 each time they are called.
	public void setName(String fullname) {
        this.sFullName = fullname;
        updates++;
    }
    public void setId(String asuID) {
        this.sAsuID = asuID;
        updates++;
    }
    public void setGrade(double grade) {
        this.sGrade = grade;
        updates++;
    }
    
   
    //Public method getters that increment accessed by 1 each time they are called. 
    public String getFullname() {
        accessed++;
        return sFullName;
    }
    public String getAsuID() {
        accessed++;
        return sAsuID;
    }
    public double getGrade() {
        accessed++;
        return sGrade;
    }
    public int getNumOfUpdates() {
        accessed++;
    	return updates;
    }
    public int getNumOfAccessed() {
        accessed++;
    	return accessed;
    }
    
    //Creating an Equals Method to compare objects created by Lab8.java
    public boolean equals(Student stu2) {
    	
    	if (sAsuID.equals(stu2.sAsuID)) {
    		return true;
    	} else if (sFullName.equalsIgnoreCase(stu2.sFullName)) {
    		return true;
    	} else {
    		return false;
    	}
    		
    }
    //toString output. 
    public String toString() {
    	return String.format("Student: %s, ASUID: %s, Grade: %.2f",
    			sFullName, sAsuID, sGrade);
    }
}
