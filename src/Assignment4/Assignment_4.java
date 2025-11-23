package Assignment4;

import java.util.ArrayList;

/*Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
cities combined.*/

public class Assignment_4 {

	 public static void main(String[] args) {
	        
	        // Create a list for the areas of the top 5 largest cities
	        ArrayList<Integer> cityAreas = new ArrayList<>();

	        // Add areas in KM's.
	        
	        cityAreas.add(12093); // 1st city
	        cityAreas.add(9538);  // 2nd city
	        cityAreas.add(8231);  // 3rd city
	        cityAreas.add(7400);  // 4th city
	        cityAreas.add(7006);  // 5th city

	        // Calculate combined area of the 3rd and 4th cities
	        int combinedArea = cityAreas.get(2) + cityAreas.get(3);

	        // Print result
	        System.out.println("Combined area of the 3rd and 4th cities: " + combinedArea + " km²");
	    }

}
