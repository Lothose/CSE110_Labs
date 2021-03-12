/*-------------------------------------------------------------
// AUTHOR: Brandon Billmeyer
// FILENAME: Student.java
// SPECIFICATION: public student class to hold student data. To be used with Program.java, and Lab7.java
// FOR: CSE 110- Lab #7
// TIME SPENT: 3 hrs
//-----------------------------------------------------------*/
package Lab7;

public class Student {
	private String firstName, lastName, fullName, asuId;
    private double grade;

    public Student(String firstName, String lastName, String asuId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.asuId = asuId;
        this.grade = -1.00;
    }
    public void setGrade(double newGrade) {
        this.grade = newGrade;
    }
    
    public String toString() {
    	return String.format("Student: %s, ASUID: %s, Grade: %.2f",
    			fullName, asuId, grade);
    }
    

    
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return fullName;
    }
    public String getAsuID() {
        return asuId;
    }
    public double getGrade() {
        return grade;
    }
}
