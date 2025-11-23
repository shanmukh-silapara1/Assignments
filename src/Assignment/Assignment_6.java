package Assignment;
/*Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
marks [75, 80, 82] Add 10 marks to each students using assignment operators and
store it into another array, after adding 10 marks identify the average marks of all
students*/

public class Assignment_6 {

	public static void main(String[] args) {
		// create student names array
		String [] names = {"Suresh","Mahesh","Naresh"};
		// create student Marks array
		int [] marks = {75,80,82};
		
		System.out.println("Student Name : "+names[0]+" | Marks: "+marks[0]);
		System.out.println("Student Name : "+names[1]+" | Marks: "+marks[1]);
		System.out.println("Student Name : "+names[2]+" | Marks: "+marks[2]);
		
		// adding 10 on every marks
		//System.out.println("After Adding 10 Marks to everyone");
		//System.out.println("Student Name : "+names[0]+" | Marks: "+(marks[0]+10));
		//System.out.println("Student Name : "+names[1]+" | Marks: "+(marks[1]+10));
		//System.out.println("Student Name : "+names[2]+" | Marks: "+(marks[2]+10));
		
		int [] updatedmarks = {(marks[0]+10),(marks[1]+10), (marks[2]+10)};
		
		System.out.println("After Adding 10 Marks to everyone");
		System.out.println("Student Name : "+names[0]+" | Marks: "+updatedmarks[0]);
		System.out.println("Student Name : "+names[1]+" | Marks: "+updatedmarks[1]);
		System.out.println("Student Name : "+names[2]+" | Marks: "+updatedmarks[2]);
	}

}
