package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class HighestGrossingMovies {

	public static void main(String[] args) {
		
		List<String> topMovies = new ArrayList<>();
		
		
		topMovies.add("Baahubali 2: The Conclusion");
		topMovies.add("Pushpa 2: The Rule");
		topMovies.add("RRR");
		topMovies.add("Kalki 2898 AD");
		topMovies.add("Salaar: Part 1 – Ceasefire");
		
		// Print all top 5 movies
        System.out.println("Top 5 Highest-Grossing Movies of All Time:");
        
        for (int i = 0; i < topMovies.size(); i++) {
            System.out.println((i + 1) + ". " + topMovies.get(i));
        }
        
     // Print the 3rd movie on the list
        System.out.println("\nThe 3rd movie on the list is: " + topMovies.get(2));


	}

}
