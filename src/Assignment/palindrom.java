package Assignment;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		
		//Initialization 
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter A number = ");
		int num = sc.nextInt();
		int originalNum = num;
		int reversedNum = 0;
		int reminder;
		
		//taking while loop to reverse the number
		while(num != 0) {
			reminder = num%10;
			reversedNum = reversedNum*10+reminder;
			num /=10;
		}
		
		// verifying the reversedNum is Palindrome number
		if(reversedNum==originalNum)
		{
			System.out.println(originalNum+" is Palindrome number");
		}
		else
		{
			System.out.println(originalNum+" is not a Palindrome number");
		}
	}

}
