package Assignment;

public class Assignment2_MutliArray {
	
	public static void main(String[] args) 
	{
		String [][][] Semester = {
					{   // Semester 1
		                {"Mathematics I", "Pass(78)"},
		                {"Physics", "Pass(85)"},
		                {"Chemistry", "Fail(21)"},
		                {"Computer Programming", "Pass(74)"},
		                {"Engineering Drawing", "Pass(88)"},
		                {"Basic Electrical Eng.", "Pass(79)"}
					},
						{   // Semester 2
						{"Mathematics II", "Pass(82)"},
						{"Mechanics", "Pass(77)"},
						{"Environmental Sci.", "Pass(93)"},
						{"Basic Electronics", "Fail(19)"},
						{"Engineering Physics", "Fail(24)"},
						{"Engineering Graphics", "Pass(90)"}
					},
					{	// Semester 3
		                {"Data Structures", "Pass(88)"},
		                {"Discrete Mathematics", "Pass(81)"},
		                {"Digital Electronics", "Pass(76)"},
		                {"Operating Systems", "Fail(32)"},
		                {"Signals and Systems", "Pass(85)"},
		                {"Object-Oriented Prog.", "Pass(78)"}
					},
					{   // Semester 4
			            {"Algorithms", "Pass(91)"},
			            {"Computer Networks", "Pass(73)"},
			            {"Database Systems", "Fail(19)"},
			            {"Microprocessors", "Pass(80)"},
			            {"Communication Eng.", "Pass(76)"},
			            {"Software Engineering", "Pass(87)"}
					},
					{   // Semester 5
		                {"Probability & Stats", "—"},
		                {"Machine Learning", "—"},
		                {"Compiler Design", "—"},
		                {"Theory of Computation", "—"},
		                {"Embedded Systems", "—"},
		                {"Computer Graphics", "—"}
					}
				};
		// Print Semester 2 Subject 4 and Subject 5 names.
        System.out.println("Semester 2 - Subject 4 and 5 Names:");
        System.out.println("Subject 4: " + Semester[1][3][0]);
        System.out.println("Subject 5: " + Semester[1][4][0]);

        // Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
        System.out.println("\nSemester 4 - Subject 3 and 6 Status/Marks:");
        System.out.println("Subject 3: " + Semester[3][2][1]);
        System.out.println("Subject 6: " + Semester[3][5][1]);
	}


}
