package Data_Structures;

import java.util.Scanner;

public class KReverse {
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

	private static int length(Node<Integer> head) {
		// TODO Auto-generated method stub
		if(head == null)
			return 0;
		return 1 + length(head.next);
	}

	public static Node<Integer> reverse(Node<Integer> head){

		if(head == null || head.next == null){
			return head;
		}

		Node<Integer> prev = null, currentNode = head, temp;
		while(currentNode != null){
			temp = currentNode.next;
			currentNode.next = prev;
			prev = currentNode;
			currentNode = temp;	
		}

		return prev;
	}

	public static Node<Integer> kReverse(Node<Integer> head, int k){
		Node<Integer> temp = head;
		int length = length(head);
		if(k>length)
		{
			return head;
		}
			int i =1;
			while (i<k)
			{
				temp=temp.next;
				i++;
			}
				Node<Integer> nexthead=temp.next;
			//	temp.next=null;
				Node<Integer> Reverse =reverse(head);
				head.next = kReverse(nexthead,k);
				
		//System.out.println(head.data);
		return Reverse;
	}


	public static void main(String args[]){
		Node<Integer> head = takeInput_Better();
		//print(head);
		kReverse(head,3);
		//print(head1.head);
	}
}

