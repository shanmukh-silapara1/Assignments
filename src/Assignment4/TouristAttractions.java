package Assignment4;

import java.util.HashSet;
import java.util.Set;

public class TouristAttractions {

	public static void main(String[] args) {
	
		// Create a Set for top 10+2 most visited tourist attractions
        Set<String> attractions = new HashSet<>();
        
        attractions.add("Somnath Temple (Gujarat)");
        attractions.add("Mallikarjuna Temple (Andhra Pradesh)");
        attractions.add("Mahakaleshwar Temple (Madhya Pradesh)");
        attractions.add("Omkareshwar Temple (Madhya Pradesh)");
        attractions.add("Kedarnath Temple (Uttarakhand)");
        attractions.add("Bhimashankar Temple (Maharashtra)");
        attractions.add("Kashi Vishwanath Temple (Uttar Pradesh)");
        attractions.add("Trimbakeshwar Temple (Maharashtra)");
        attractions.add("Baidyanath Temple (Jharkhand)");
        attractions.add("Nageshwar Temple (Gujarat)");
        attractions.add("Rameshwaram Temple (Tamil Nadu)");
        attractions.add("Grishneshwar Temple (Maharashtra)");
        
     // Print all attractions
        System.out.println("Top 12 Most Visited Tourist Attractions:");
        
        for (String place : attractions) {
            System.out.println("- " + place);
        }
        
     // Print the size of the Set
        System.out.println("\nTotal attractions: " + attractions.size());

	}

}
