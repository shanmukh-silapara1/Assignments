package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeStringCheck {

	public static void main(String[] args) {
		// InputString Initialization 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String = ");
		String inputString = sc.nextLine();
		sc.close();
		
		// convert into lower case for case sensitive check
		inputString = inputString.toLowerCase();
		
		//converting into char array
		char[] originalArray = inputString.toCharArray();
		char[] reversedArray = new char[originalArray.length];
		
		for(int i=0;i<originalArray.length;i++) {
			reversedArray[i]=originalArray[originalArray.length-1-i];
		}
			  // Compare the arrays
	        if (Arrays.equals(originalArray,reversedArray)){
	        	System.out.println("The String \""+inputString+"\" is a palindrome");
	        } else {
	            System.out.println("The string \"" + inputString + "\" is not a palindrome.");
	        
		}
		

	}

}
