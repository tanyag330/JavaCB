package oopsstudent;

public class Student implements Comparable<Student>{
	private String name;
//	private final int rollNo;
	private int phoneNumber;
	private String address;
	private static int numStudents;
	public int marks;
	Batch b;
	
	 /*Student(String name, Batch b){
		this.name = name;
		numStudents++;
		rollNo = 1000 + numStudents;
		this.b = b;
	}
	
	public String getName(){
			return name;
		}
	
	public void setBatch(Batch b){
		this.b = b;
	}
	
	public  void setPhoneNumber(int num){
		phoneNumber = num;
	}
	
	public  int getPhoneNumber(int num){
		 return phoneNumber;
	}
	
	public int getRollNo(){
		return rollNo;
		
	}*/
	public int compareTo(Student st)
	{
		if (marks ==st.marks)
		{
			return 0;
		}
		if (marks >st.marks)
		{
			return 1;
		}
		else {
			return-1;
		}
	}
}
