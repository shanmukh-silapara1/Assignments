package Assignment4;

public class GetAvarage {

	public static void main(String[] args) {
		
		// Create an array of 10 numbers
		int [] numbers = {23,45,52,63,87,47,512,832,976,848};
		
		// 5th value → index 4
        // 6th value → index 5
		double avarage =(numbers[4]+numbers[5])/2.0;
		
		//Print Average of index 4 & 5 element from array
		System.out.println("Average of 5th and 6th values: " + avarage);

	}

}
