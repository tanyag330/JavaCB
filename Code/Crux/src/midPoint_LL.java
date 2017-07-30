package datastructure.linklist;
import java.util.Scanner;

import Data_Structures.Node;

public class midPoint_LL {


	public static node<Integer> takeinput(){
		node<Integer> head =null , tail= null;
		Scanner s=new Scanner(System.in);
		int data;
		System.out.println("enter next element");
		data=s.nextInt();
		while (data!=-1){
			node<Integer> newnode =new node<>();
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

	public static void print(node<Integer> head)
	{
		node<Integer> temp =head;

		while(temp!= null){
			System.out.println(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static node<Integer> Mid(node<Integer> head){
		if(head == null){
			return head;
		}
		node<Integer> fast = head, slow = head;
		while(fast.next != null && fast.next.next != null ){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;	
	}

	public static void main(String args[])
	{
		node<Integer> head =takeinput();
		node<Integer> mid = Mid(head);
		System.out.println(mid.data);
	}
}

