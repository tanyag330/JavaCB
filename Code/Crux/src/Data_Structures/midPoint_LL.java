package datastructure.linklist;
import java.util.Scanner;

import Data_Structures.Node;

public class midPoint_LL {


	public static Node<Integer> takeinput(){
		Node<Integer> head =null , tail= null;
		Scanner s=new Scanner(System.in);
		int data;
		System.out.println("enter next element");
		data=s.nextInt();
		while (data!=-1){
			Node<Integer> newnode =new Node<>();
			newnode.data=data;
			if (head==null){
				head =newnode;
				tail = newnode;

			}
			else {
				tail.next=newnode;
				tail =newnode;	
			}
			System.out.println("enter next element");
			data=s.nextInt();
		}
		return head;

	}

	public static void print(Node<Integer> head)
	{
		Node<Integer> temp =head;

		while(temp!= null){
			System.out.println(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static Node<Integer> Mid(Node<Integer> head){
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

	public static void main(String args[])
	{
		Node<Integer> head =takeinput();
		Node<Integer> mid = Mid(head);
		System.out.println(mid.data);
	}
}

