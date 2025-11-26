package Assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelTable_TestCases {

	public static void main(String[] args) {
		
		
		/*  Inside this Excel There are 3 TestCases with each Testcase having 3 rows of data.
		    Now, CreateMap<String, List<Map<String, String>>> to store all the data and Print
		    the data from Product details > Supplier Name > Office Depot 
		    from the Map<String, List<Map<String, String>>>
		Hint: Step 1: Create Map<String, String> for each row of data 
		Step 2: Create List<Map<String, String>> for entire table 
		Step 3: Create Map<String, List<Map<String, String>>> to store all 3 tables together 
		Step 4: Print the data from Product details > Supplier Name > 
		Office Depot from the Map<String, List<Map<String, String>>>create java program*/

		
		 // -------------------------------
        // Step 1: Create Map<String, String> for each row
		// -------------------------------
	
		// TestCase 1 
		Map<String,String> tc_row1= new HashMap<>();
		
		tc_row1.put("Product Name", "Laptops");
		tc_row1.put("Supplier Name", "Office Depot");
		tc_row1.put("Price", "1000000");
		
		tc_row1.put("Product Name", "Notepads");
		tc_row1.put("Supplier Name", "Office Depot");
		tc_row1.put("Price", "1000");
		
		tc_row1.put("Product Name", "Bags");
		tc_row1.put("Supplier Name", "Office Depot");
		tc_row1.put("Price", "10000");
		
		
		//TestCase 2
        List<Map<String, String>> tc_row2 = new ArrayList<>();
		
        tc_row2.add(Map.of("Product Name", "Laptop", "Supplier Name", "Mac", "Price", "150000"));
        tc_row2.add(Map.of("Product Name", "Mouse", "Supplier Name", "Mac", "Price", "3500"));
        tc_row2.add(Map.of("Product Name", "Keyboard", "Supplier Name", "Mac", "Price", "40000"));
	
        tc_row2.add(Map.of("Product Name", "Laptop", "Supplier Name", "Mac", "Price", "150000"));
        tc_row2.add(Map.of("Product Name", "Mouse", "Supplier Name", "Mac", "Price", "3500"));
        tc_row2.add(Map.of("Product Name", "Keyboard", "Supplier Name", "Mac", "Price", "40000"));
	
        // TestCase 3
        List<Map<String, String>> tc_row3 = new ArrayList<>();
        tc_row3.add(Map.of("Product Name", "Chair", "Supplier Name", "IKEA", "Price", "1500"));
        tc_row3.add(Map.of("Product Name", "Table", "Supplier Name", "IKEA", "Price", "2500"));
        tc_row3.add(Map.of("Product Name", "Sofa", "Supplier Name", "IKEA", "Price", "5000"));
	
	
	}

}
