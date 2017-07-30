package Data_Structures;

import java.util.Scanner;

public class TreeUse {


	public static TreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);

		System.out.println("Enter root data :");
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		System.out.println("Enter number of children of "+rootData+" : ");
		int numChild = s.nextInt();

		for(int i = 0; i < numChild; i++){
			TreeNode<Integer> currentChild = takeInput();
			root.children.add(currentChild);
		}

		return root;
	}

	public static TreeNode<Integer> takeInputLevelWise() throws Exception{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data :");
		int rootData = s.nextInt();

		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty())
		{	
			TreeNode<Integer> currentNode = pendingNodes.dequeue();
			System.out.println("Enter number of children of "+currentNode.data+" :");
			int numChild = s.nextInt();	
			for(int i =0; i < numChild; i++){
				System.out.println("Enter "+i+" child of :"+currentNode.data);
				int childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				pendingNodes.enqueue(child);
				currentNode.children.add(child);			}
		}
		return root;
	}


	public static void print(TreeNode<Integer> root){
		if(root == null){
			return;
		}
		String toBePrinted  = root.data +" : ";

		for(int i = 0; i < root.children.size(); i++){
			TreeNode<Integer> currentChild = root.children.get(i);
			toBePrinted+= currentChild.data +", ";
		}
		System.out.println(toBePrinted);

		for(int i = 0; i < root.children.size(); i++){
			TreeNode<Integer> currentChild = root.children.get(i);
			print(currentChild);
		}


	}

	public static void main(String args[]) throws Exception{
		TreeNode<Integer> root = takeInputLevelWise();
		print(root);

	}

}
