package Data_Structures;

import java.util.ArrayList;

public class DynamicArrayUse {
	public static void main(String args[]){
		DynamicArray dArray = new DynamicArray();
		dArray.add(5);
		try {
			dArray.add(4, 0);
			dArray.print();
			dArray.remove(3);
		} catch (IndexOutofBoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Please enter correct Index");
		}
		dArray.print();
		ArrayList<DoubleNode> list = new ArrayList<>();
	}
}
