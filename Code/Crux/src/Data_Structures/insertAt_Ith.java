package datastructure.linklist;

import java.util.Scanner;

public class insertAt_Ith {
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
	public static node<Integer> ithelement(node<Integer> head, int i, int data)
	{
		int count = 1;
		node<Integer> temp = head;
		node<Integer> newnode = new node<>();
		newnode.data = data;
		if(i == 1){
			newnode.next = head;
			head = newnode;
			return head;
		}
		else{
			while(count < i-1){
				temp = temp.next;
				count++;
			}
			newnode.next = temp.next;
			temp.next = newnode;
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


	public static void main(String args[])
	{
		node<Integer> head =takeinput();
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("enter ith position");
		i=s.nextInt();	
		head = ithelement(head, i, 5);
		print(head);

	}
}