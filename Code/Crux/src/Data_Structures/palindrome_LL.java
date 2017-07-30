package Data_Structures;

import java.util.Scanner;

public class palindrome_LL {

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
	public static Node<Integer> findMid(Node<Integer> head){
		if(head == null){
			return head;
		}
		Node<Integer> fast = head, slow = head;
		while(fast.next != null && fast.next.next != null ){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;	
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
	public static boolean checkPalindrome(Node<Integer> head){

		Node<Integer> temp= head;
		Node<Integer> mid =findMid(head);
		Node<Integer> Reverse =reverse(mid.next);
		mid.next= Reverse;
		while(temp!=mid.next){
			if(temp.data == Reverse.data )
				temp=temp.next;
			
			return true;
		}

		return false;

	}


	public static void main(String args[]){
		Node<Integer> head = takeInput_Better();
		//print(head);
		if(checkPalindrome(head)){
			System.out.println("Is Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}

}
