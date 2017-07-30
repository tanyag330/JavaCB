package datastructure.linklist;

import java.util.Scanner;

public class print_Ithelement {
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
	public static node<Integer> ithelement(node<Integer> head, int i)
	{
		if (head==null){
			return null;
		}
		node<Integer> temp =head;
		int count =1;
		while(count<i){
			temp=temp.next;
			count++;
		}
		return temp;
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
	public static node<Integer> deleteatith(node<Integer> head, int i){
		node<Integer> temp =head;
		int count =1;
		if (head==null)
		{
			return null;
		}
		if(i<2){
			return head.next;
		}

		else{
			while(count<i-1){
				temp=temp.next;
				count++;
			}
			temp.next=temp.next.next;
		}
		return head;
	}
	public static int lengthoflinklist(node<Integer> head)
	{

		node<Integer> temp =head;
		int count =1;
		while(temp.next !=null)
		{
			temp=temp.next;
			count++;
		}
		return count;
	}

	public static void main(String args[])
	{
		node<Integer> head =takeinput();
		/*		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("enter ith position");
		i=s.nextInt();	

		node<Integer> a=print(head,i);
		System.out.println("ith element is"+a.data);



			int a =lengthoflinklist(head);
		System.out.println("length is"+a);
		
		
		head =deleteatith(head,i);
		print(head);*/

	}
}
