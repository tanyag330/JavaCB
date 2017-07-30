package Data_Structures;

import java.util.Scanner;

public class reverse_Q12 {

	public static  Node<Integer> takeInput_Better(){
		Node<Integer> head = null,tail = null;
		Scanner s = new Scanner(System.in);
		int data;
		System.out.println("Enter next Element :");
		data = s.nextInt();

		while(data != -1){
			Node<Integer> newNode = new Node<Integer>();
			newNode.data = data;
			//	newNode.next = null;
			if(head == null){
				head = newNode;
				tail = newNode;
			}
			else{
				tail.next = newNode;
				tail = newNode;
			}
			System.out.println("Enter next Element :");
			data = s.nextInt();
		}

		return head;
	}

	public static void print(Node<Integer> head){
		Node<Integer> temp = head;
		while(temp != null){
			System.out.print(temp.data +"->");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void printReverse(Node<Integer> head){

		if(head == null){
			return;
		}
		
		printReverse(head.next);
		
		System.out.println(head.data);
	}
	
	
	public static void main(String args[]){
		Node<Integer> head = takeInput_Better();
		//print(head);
		printReverse(head);
		//print(head1.head);
	}

}
