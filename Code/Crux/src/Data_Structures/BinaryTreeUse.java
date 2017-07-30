package Data_Structures;

import java.util.Scanner;

public class BinaryTreeUse {

	
	public static BinaryTreeNode<Integer> takeInput() throws Exception{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data :");
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>();
		root.data = rootData;
		
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> currentNode = pendingNodes.dequeue();
			System.out.println("Enter left child of " + currentNode.data);
			int leftData = s.nextInt();
			if(leftData != -1){
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>();
				leftChild.data = leftData;
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}
			System.out.println("Enter right child of " + currentNode.data);
			int rightData = s.nextInt();
			if(rightData != -1){
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>();
				rightChild.data = rightData;
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}
		
		return root;
		
	}
	
	
	public static void print(BinaryTreeNode<Integer> root){
		
		if(root == null){
			return;
		}
	//	System.out.println(root.data +" : "+root.left.data +", "+ root.right.data);
		
		String toBePrinted = root.data +" : ";
		if(root.left != null){
			toBePrinted+= root.left +", ";
		}
		if(root.right != null){
			toBePrinted+= root.right +", ";
		}
		System.out.println(toBePrinted);
		print(root.left);
		print(root.right);
		
	}
	
	public static int height(BinaryTreeNode<Integer> root){
		if(root == null){
			return 0;
		}
		return Integer.max(height(root.left) ,height(root.right)) + 1; 	
	}
	
	
	public static int diameter(BinaryTreeNode<Integer> root){
		
		if(root == null){
			return 0;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int leftDiameter = diameter(root.left);
		int rightDiameter = diameter(root.right);
		
		return Integer.max(Integer.max(leftDiameter, rightDiameter), leftHeight + rightHeight + 1);
		
	}
	
	public static BTPair diameterFaster(BinaryTreeNode<Integer> root){
		if(root == null){
			BTPair result = new BTPair(0,0);
			return result;
		}
		
		BTPair leftPair = diameterFaster(root.left);
		BTPair rightPair = diameterFaster(root.right);
		int treeHeight = Integer.max(leftPair.height, rightPair.height) + 1;
		int treeDiameter = Integer.max(Integer.max(leftPair.diameter, rightPair.diameter), leftPair.height + rightPair.height + 1);
		BTPair result = new BTPair(treeHeight,treeDiameter);
		return result;
		
	}
	
	//public static BinaryTreeNode<Integer> constructFromPreIn(int[] pre, int[] in,int inS,int inE,int preS, int preE)
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		BTPair result = diameterFaster(root);
		System.out.println(result.diameter);
	}

}
