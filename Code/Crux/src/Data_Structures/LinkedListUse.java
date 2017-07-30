package Data_Structures;

import java.util.Scanner;

public class LinkedListUse {

	public static  Node<Integer> takeInput(){
		Node<Integer> head = null;
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
			}
			else{
				Node<Integer> temp = head;
				while(temp.next != null){
					temp = temp.next;
				}
				temp.next = newNode;	
			}
			System.out.println("Enter next Element :");
			data = s.nextInt();
		}

		return head;
	}

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


	public static Node<Integer> getIth(Node<Integer> head, int pos){
		if(head == null){
			return null;
		}
		int count = 1;
		Node<Integer> temp = head;

		while(count < pos){
			temp = temp.next;
			count++;
		}
		return temp;
	}


	public static Node<Integer> insertR(Node<Integer> head,int data,int pos){
		Node<Integer> newNode = new  Node<>();
		newNode.data = data;
		if(pos == 1){
			newNode.next = head;
			head = newNode;
			return head;
		}
		head.next = insertR(head.next, data, pos-1);
		return head;
	}
	
	
	public static Node<Integer> insertAtIth(Node<Integer> head, int data,int i){

		int count = 1;
		Node<Integer> temp = head;
		Node<Integer> newNode = new Node<>();
		newNode.data = data;
		if(i == 1){
			newNode.next = head;
			head = newNode;
			return head;
		}
		else{
			while(count < i-1){
				temp = temp.next;
				count++;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		return head;
	}

	public static int findR(Node<Integer> head, int data){
		if(head == null){
			return -1;
		}
		if(head.data == data){
			return 1;
		}
		else{
			int pos = findR(head.next, data);
			if(pos != -1)
				return 1 + pos;
			else{
				return -1;
			}
		}
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
	
	public static Node<Integer> bubbleSort(Node<Integer> head){
		if(head == null || head.next == null){
			return head;
		}
		Node<Integer> currentNode=head, prev = null;
		int length = length(head);
		for(int i = 0;  i < length; i++){
			currentNode = head;
			prev = null;
			while(currentNode != null && currentNode.next != null){
				if(currentNode.data > currentNode.next.data){	
					if(prev == null){
						prev = head.next;
						currentNode.next = currentNode.next.next;
						prev.next = currentNode;
						head = prev;
					}
					else{
						prev.next = currentNode.next;
						currentNode.next = currentNode.next.next;
						prev = prev.next;
						prev.next = currentNode;
					}	
				}
				else{
					prev = currentNode;
					currentNode = currentNode.next;
				}	
			}
		}
		return head;
	}
	
	/*public static Node<Integer> mergeSort(Node<Integer> head){
		if(head == null || head.next == null){
			return head;
		}
		
		Node<Integer> mid = findMid(head);
		Node<Integer> firstHalf = head;
		Node<Integer> secondHalf = mid.next;
		mid.next = null;
		
		firstHalf = mergeSort(firstHalf);
		secondHalf = mergeSort(secondHalf);
		head = merge(firstHalf,secondHalf);
		return head;
	}*/

	
	/*public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
		if(head1 == null){
			return head2;
		}
		if(head2 == null){
			return head1;
		}
		
		Node<Integer> mergedHead = null;
		Node<Integer> mergedTail = null;
		Node<Integer> temp1 = head1,temp2=head2;
		while(temp1 != null && temp2 != null){
			if(temp1.data > temp2.data){
				if(mergedHead == null){
					
				}
				else{
				}		
			}	
		}
		
		if(temp1 == null){
			mergedTail = temp2;
		}
		if(temp2 == null){
			mergedTail = temp1;
		}
	}*/


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
	
	public static Node<Integer> reverseR1(Node<Integer> head){
		if(head == null || head.next == null){
			return head;
		}
		
		Node<Integer> smallOutput = reverseR1(head.next);
		Node<Integer> temp = smallOutput;
		
		while(temp.next != null){
			temp = temp.next;
		}
		
		temp.next = head;
		head.next = null;
		return smallOutput;
		
	}
	
	
	public static DoubleNode reverseR2(Node<Integer> head){
		if(head == null || head.next == null){
			DoubleNode node = new DoubleNode();
			node.head = head;
			node.tail = head;
			return node;
		}
		
		DoubleNode smallOutput = reverseR2(head.next);
		smallOutput.tail.next = head;
		smallOutput.tail = head;
		head.next = null;
		return smallOutput;
		
	}
	
	
	public static Node<Integer> reverseR3(Node<Integer> head){
		if(head == null || head.next == null){
			return head;
		}
		
		
		Node<Integer> tail = head.next;
		Node<Integer> smallOutput = reverseR1(head.next);
	
		tail.next = head;
		head.next = null;
		return smallOutput;
	}
	
	
	private static int length(Node<Integer> head) {
		// TODO Auto-generated method stub
		if(head == null)
			return 0;
		return 1 + length(head.next);
	}

	public static void main(String args[]){
		Node<Integer> head = takeInput_Better();
		
		//Node<Integer> h = reverse(head);
		//print(h);
		//print(head);
		//	System.out.println();
		//print(head);
		/*	Node<Integer> temp = getIth(head, 3);
		System.out.println(temp.data);*/
		//head = insertAtIth(head, 6, 5);
		//print(head);

		//System.out.println(findR(head, 3));
		/*Node<Integer> mid = findMid(head);
		System.out.println(mid.data);*/
		head = bubbleSort(head);
		print(head);
	//	head = insertR(head,5,3);
		//DoubleNode head1 = reverseR2(head);
		//print(head1.head);
	}


}
