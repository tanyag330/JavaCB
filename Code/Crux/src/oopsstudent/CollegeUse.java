package oopsstudent;

import java.util.Scanner;

public class CollegeUse {
	public static void main(String[] args) {
		College c = new College("Abc", 10);
		Scanner s = new Scanner(System.in);
		String ans = "y";
		// s.useDelimiter("\n");
		int choice;
		String name;
		int size;
		Batch b;
		Student s1;

		while(ans.equals("y")){
			System.out.println("1. Add batch ");
			System.out.println("2. Add student ");
			System.out.println("3. View Batches ");
			System.out.println("4. View Students in a batch ");
			choice = s.nextInt();

			switch(choice){
			case 1 :
				System.out.println("Enter batch name :");
				name = s.next();
				System.out.println("Enter Batch size :");
				size = s.nextInt();
				b = new Batch(name, size);
				if(c.addBatch(b)){
					System.out.println("Batch added successfully");
				}
				else{
					System.out.println("Can't add Batch ");
				}
				break;

			case 2 :
				System.out.println("Enter student name :");
				name = s.next();
				System.out.println("Enter batch :");
				String batchName = s.next();
				if(c.addStudentToBatch(name, batchName)){
					System.out.println("Student successfully added");
				}
				else{
					System.out.println("Can't add");
				}
				break;
				
			case 3 :
				c.showBatches();
				break;
			case 4 :
				System.out.println("Enter batch :");
				name = s.next();
				b = c.getBatch(name);
				b.showStudentDetails();
				break;
			}
			System.out.println("Want to continue : y/n ?");
			ans = s.next();
		}
	}
}
