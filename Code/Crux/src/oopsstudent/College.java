
package oopsstudent;

public class College {
	private String name;
	private String address;
	Batch[] batches;
	private int maxBatches;
	private int numBatches;
	
	public College(String name, int maxBatches){
		this.name = name;
		this.maxBatches = maxBatches;
		batches = new Batch[maxBatches];
	}
	public boolean addBatch(Batch b){
		if(numBatches == maxBatches){
			return false;
		}	
		else{
			batches[numBatches]= b;
			numBatches++;
			return true;
		}
	}
	public Batch  getBatch(String name){
		for(int i = 0; i < numBatches; i++){
			if(batches[i].getName().equals(name)){
				return batches[i];
			}
		}
		return null;
	}
	public boolean addStudentToBatch(String name, String batchName){
		Batch b = getBatch(batchName);
		Student s1;
		if(b != null){
			s1 = new Student(name,b);
			boolean status = b.addStudent(s1);
			return status;
			//System.out.println("Student successfully added");
		}
		else{
			return false;
			//System.out.println("Can't add :");
		}
	}
	public void showBatches(){
		for(int i = 0; i < numBatches; i++){
			System.out.println(batches[i].getName() + " "  );
		}
	}
}