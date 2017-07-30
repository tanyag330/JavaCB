
package datastructure.linklist;

import java.util.Scanner;

public class StackUseLL {

	public static void main(String args[]) throws StackEmptyException
	{
		StackUsingLL<Integer> s = new StackUsingLL<>();
		for( int i=0 ; i<5; i++){
			s.push(i);	
		}
		//s.push(5);
		for( int i=0 ; i<5; i++){
	    System.out.println(s.pop());
		}
	   //s.top();
		
	}
}
