/* 
A program to convert shilling and old penny into pound 
COM1003 Java Programming Autumn Semester 2019-20
Programming Assignment 1
Written by: Ahmet Can Yavuz
Written on: 21/10/2019
*/

import sheffield.*; 
public class Money {
	public static void main(String[] args) {
		EasyReader keyboard = new EasyReader(); // to read things in 
		EasyWriter screen = new EasyWriter(); // to output 
		
		int shillings = keyboard.readInt("How many shillings? ");
		final double ONE_SHILLINGS = 0.05000; // one shillings fraction of a pound
		double resultShillingsTOPound = shillings *ONE_SHILLINGS; // shilling to pound 
		screen.print("That is ");
		screen.print(resultShillingsTOPound,3); // 3 for 3 decimal places
		screen.println(" pounds");
		
		/* The first task is finished here */
		
		int oldPence = keyboard.readInt("How many old pence? ");
		final double ONE_OLD_PENNY = 0.00417; //  one old penny fraction of a pound
		double resultOldPenceToPound = (resultShillingsTOPound+
(oldPence*ONE_OLD_PENNY)); // old pence to pound
		screen.print(shillings+"s ");
		screen.print(oldPence+"d "+"is ");
		screen.print(resultOldPenceToPound,3); // 3 for 3 decimal places
		screen.println(" pounds");
		
		/* The second task is finished here */
		
		EasyReader fileInput = new EasyReader("testdata.txt"); // for reading files in 
		int fileOneShillings = fileInput.readInt(); // first line of file
		int fileTwoOldPence = fileInput.readInt();  // second line of file
		double resultFileOne = fileOneShillings *ONE_SHILLINGS; // to convert first line of file to shilling
		double resultFileTwoOldPence = fileTwoOldPence *ONE_OLD_PENNY;  // to convert second line of file to old penny
		double resultFile = (resultFileOne+resultFileTwoOldPence); // file's result 
		screen.print(fileOneShillings+"s ");
		screen.print(fileTwoOldPence+"d "+"is ");
		screen.print(resultFile,3);  // 3 for 3 decimal places
		screen.println(" pounds");
	    
		/* The third task is finished here */
		
		String fileTwo = fileInput.readString();
		int a = 9, b=10;
		double resultFileTwo = (a*ONE_SHILLINGS)+(b*ONE_OLD_PENNY);
		screen.print(fileTwo+" is ");
		screen.print(resultFileTwo,3);
		screen.println(" pounds");
	  
		/* The fourth task task is finished here */
	  
		String singleSpace = " ";  // for single space 
	    	String doubleSpace = "  ";  // for two spaces
	    	String tripleSpace = "   ";  // for three spaces 
	    	screen.println(doubleSpace+"s"+doubleSpace+"d"+singleSpace+"Pounds");
	    	screen.print(singleSpace + shillings);
		screen.print(singleSpace + oldPence + tripleSpace);
		screen.println(resultOldPenceToPound,2);  // 2 for 2 decimal places
		screen.print(doubleSpace + fileOneShillings);
		screen.print(doubleSpace + fileTwoOldPence + tripleSpace);
		screen.println(resultFile,2);  // 2 for 2 decimal places
		screen.print(doubleSpace + a);
		screen.print(singleSpace + b + tripleSpace);
		screen.println(resultFileTwo,2);
		 
		/* End of the COM1003 Java Programming
	     Autumn Semester 2019-20 
	     Programming Assignment 1
	  */
	    
		}
}
