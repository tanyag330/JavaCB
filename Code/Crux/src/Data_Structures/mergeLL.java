package datastructure.linklist;

import java.util.Scanner;

public class mergeLL {
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
	public static node<Integer> mergell(node<Integer> head1,node<Integer> head2){
		{
			node<Integer> temp1 =head1;
			node<Integer> temp2 =head2;
			if (head1==null)
			{
				return head2;
			}
			if (head2==null)
			{
				return head1;
			}
			node<Integer> mergehead =null , mergetail= null;
			while((temp1!=null && temp2!= null)){
				if (mergehead ==null){
					if(temp1.data<temp2.data)
					{	
						mergehead = temp1;
						mergetail=temp1;
						temp1=temp1.next;
						//mergetail=mergetail.next;
					}
					else
					{	
						mergehead = temp2;
						mergetail=temp2;
						temp2=temp2.next;
						//mergetail=mergetail.next;
					}
				}
				else{
					if(temp1.data<temp2.data)
					{
						mergetail.next=temp1;
						temp1=temp1.next;
						mergetail=mergetail.next;
					}
					else
					{
						mergetail.next=temp2;
						temp2=temp2.next;
						mergetail=mergetail.next;
					}

				}
			}
			if(temp1==null){
				mergetail.next=temp2;
				mergetail=mergetail.next;
			}
			if(temp2==null){
				mergetail.next=temp1;
				mergetail=mergetail.next;
			
			}
			return mergehead;
		}
	}
	private static int length(node<Integer> head) {
		if(head == null)
			return 0;
		return 1 + length(head.next);
	}
	public static node<Integer> findMid(node<Integer> head){
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
	public static node<Integer> mergesort(node<Integer> head)
	{
		//node<Integer> temp = head;
		if(head == null || head.next == null){
			return head;
		}
		
		node<Integer> mid= findMid(head);
		node<Integer> firsthalfhead=head, secondhalfhead =mid.next;
		mid.next=null;
		
		mergesort(firsthalfhead);
		mergesort(secondhalfhead);
	   head= mergell(firsthalfhead, secondhalfhead);
	  return head;
	}
		
	public static void main(String args[])
	{
		node<Integer> head =takeinput();
		//node<Integer> head1 =takeinput();
		//node<Integer> head2 =takeinput();
		//node<Integer> mergehead = mergell(head1, head2);
		head = mergesort(head);
		print(head);

	}	
}

