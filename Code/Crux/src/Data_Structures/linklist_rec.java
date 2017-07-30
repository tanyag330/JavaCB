package datastructure.linklist;

import java.util.Scanner;

public class linklist_rec {
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
	public static node<Integer> insertIth_rec(node<Integer> head, int data,int i){
		//node<Integer> temp =head;
		node<Integer> newnode =new node<>();
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

	public static node<Integer> delete_rec(node<Integer> head, int i){
		node<Integer> temp =head;
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
		//temp.next=temp.next.next;
	return head;
}

public static int length_rec(node<Integer> head)
{	
	if (head==null)
	{
		return 0 ;
	}
	int length =1+length_rec(head.next); 
	return length;
}

public static void main(String args[])
{
	node<Integer> head =takeinput();
	/*	int a =length_rec(head);
		System.out.println("length is"+a);*/
	//head =insertIth_rec(head, 5, 3);
	head =delete_rec(head, 3);
	print(head);

}
}
