package Assignment;

public class Assignment3_2_EmpGroup {

	static //Employees Names
	String names[] = {"Bharath","John", "Aarav"};
	static int ids[]= {1234,1235,1236};

public Assignment3_2_EmpGroup(String[] names, int[] ids) {
// TODO Auto-generated constructor stub
}
public static void main(String[] args) {


// Create EmpGroups object
	Assignment3_2_EmpGroup group = new Assignment3_2_EmpGroup(names, ids);

// Display employee information
group.displayEmployees();


}
// Method to display employee details
public void displayEmployees() {
System.out.println("Employee List:");
for (int i = 0; i < names.length; i++) {
    System.out.println("ID: " + ids[i] + " | Name: " + names[i]);
    }
}
	
}
