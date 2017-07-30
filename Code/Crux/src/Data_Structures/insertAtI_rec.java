package datastructure.linklist;
import java.util.Scanner;

import Data_Structures.Node;
import datastructure.linklist.node;

public class insertAtI_rec {
	
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

	public static Node<Integer> insertIth_rec(Node<Integer> head, int data,int i){
		Node<Integer> newnode =new Node<>();
		newnode.data=data;
		if (i==1)
		{
			newnode.next=head;
			head=newnode;
			return head;
		}

		head.next =insertIth_rec(head.next,data,i-1 ); 
		return head;

	}

	public static Node<Integer> delete_rec(Node<Integer> head, int i){
		Node<Integer> temp =head;
		if (head==null)
		{
			return null;
		}
		if (i<2)
		{
			return head.next;
		}
		else{
			head.next=delete_rec(head.next, i-1);
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


	public static void main(String args[])
	{
		Node<Integer> head =takeinput();
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("enter ith position");
		i=s.nextInt();	
		head =insertIth_rec(head, 5, i);
		//head =delete_rec(head, i);
		print(head);

	}
}