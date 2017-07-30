package datastructure.linklist;

import java.util.Scanner;

public class reverse {
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
	public static node<Integer> reverse(node<Integer> head){
		if(head == null || head.next == null){
			return head;
		}
		node<Integer> currentNode=head,prev = null, temp;
		while(currentNode != null)
		{
			
		}
		return prev;
		}
	
	public static node<Integer> reverse_rec(node<Integer> head){
		if(head == null || head.next == null){
			return head;
		}
		node<Integer> smalloutput = reverse_rec(head.next);
		node<Integer> temp = smalloutput;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=head;
		return smalloutput;
		}
	public static void main(String args[])
	{
		node<Integer> head =takeinput();
		head = reverse(head);
		print(head);

	}	
}
