package oopsstudent;

public class Batch {

	private String name;
	private int numStudents;
	Student[] s;
	private int maxSize;
	public  static int numBatches;
	
	public Batch(String name, int maxSize){
		this.name = name;
		this.maxSize = maxSize;
		s = new Student[maxSize];
		numBatches++;
	}
	
	public void showStudentDetails(){
		for(int i = 0; i < numStudents; i++){
			System.out.println(s[i].getName() + " " + s[i].getRollNo());
		}
	}
	
	public boolean addStudent(Student s){
		if(numStudents == maxSize){
			return false;
		}
		else{
			this.s[numStudents] = s;
			numStudents++;
			return true;
		}
	}
	
	public String getName() {
		
		return name;
	}
}