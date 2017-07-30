package datastructure.linklist;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayOfLinklistLW {
	public static ArrayList<node<BinaryTreeNode<Integer>>> LLforeachLevel(BinaryTreeNode<Integer> root) throws QueueEmptyException 
	{
		if(root == null){
			return null;
		}
		ArrayList<node<BinaryTreeNode<Integer>>> output = new ArrayList<>();
		QueueusingLL<BinaryTreeNode<Integer>> primary = new QueueusingLL<BinaryTreeNode<Integer>>();
		QueueusingLL<BinaryTreeNode<Integer>> secondary = new QueueusingLL<BinaryTreeNode<Integer>>();
		primary.enqueue(root);
		node<BinaryTreeNode<Integer>> head = null, tail= null;

		while(!primary.isempty())
		{
			BinaryTreeNode<Integer> currentNode = primary.dequeue();
			node<BinaryTreeNode<Integer>> newnode = new node<>();
			newnode.data = currentNode;
			if(head == null){
				head = newnode;
				tail= newnode;
			}
			else {
				tail.next =newnode;
				tail =newnode;
			}
			if (currentNode.left!= null){
			secondary.enqueue(currentNode.left);	
			}
			if (currentNode.right!= null){
				secondary.enqueue(currentNode.right);	
			}
			if(primary.isempty()){
			output.add(head);
			QueueusingLL<BinaryTreeNode<Integer>> temp = primary;
			primary= secondary;
			secondary= temp;
			head=  null;
			tail = null;
			}
		}
		return output;		
	}	
}
