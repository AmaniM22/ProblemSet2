//Amani Minaya
//Problem set 2 assignment

// to relate both java files (Grade) & (ProblemSet2)
package edu.monmouth.grade;

public class problemSet2 {
	public static void main(String[] args) {
		// creating a Grade object
		Grade2 letter= new Grade2();
		
		//use the getGradeMethod, print out letter grade (UNKNOWN)
		System.out.println("the grade letter1 is: " + letter.getGradeLetter());	
		
		//Create new object letter2 and print out value
		Grade2 letter2 = new Grade2("B-");
		System.out.println("the grade letter2 is: " + letter2.getGradeLetter());
		
		// sets new value to letter2 using a mutator method
		letter2.setGradeLetter("C+");
		System.out.println("the grade letter2 is now: " + letter2.getGradeLetter());
		
		//Prints out the Value of letter3 (F) because we declared it as a new object
		Grade2 letter3 = new Grade2 ("F") ;
		System.out.println("the grade letter3 is: " + letter3.getGradeLetter());
	}

}
