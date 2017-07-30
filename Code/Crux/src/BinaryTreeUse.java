package datastructure.linklist;

import java.util.Scanner;

public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeInputLevelWise() throws Exception{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data :");

		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>();
		root.data =rootData;
		QueueusingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueusingLL<BinaryTreeNode<Integer>>();

		pendingNodes.enqueue(root);

		while(!pendingNodes.isempty())
		{	
			BinaryTreeNode<Integer> currentNode = pendingNodes.dequeue();
			System.out.println("Enter left child of "+currentNode.data+" :");
			int leftData = s.nextInt();	
			if(leftData != -1){
				BinaryTreeNode<Integer> leftchild = new BinaryTreeNode<Integer>();
				leftchild.data = leftData;
				currentNode.left =leftchild;
				pendingNodes.enqueue(leftchild);			
			}
			System.out.println("Enter right child of "+currentNode.data+" :");
			int rightData = s.nextInt();	
			if(rightData != -1){
				BinaryTreeNode<Integer> rightchild = new BinaryTreeNode<Integer>();
				rightchild.data = rightData;
				currentNode.left =rightchild;
				pendingNodes.enqueue(rightchild);			
			}
		}
		return root;
	}


	public static void printrec(BinaryTreeNode<Integer> root) throws QueueEmptyException{
		if(root == null){
			return;
		}
		String toBePrinted  = root.data +" : ";
		if(root.left!= null)
		{	
			toBePrinted += root.left.data +", ";
		}
		if(root.right!= null)
		{
			toBePrinted+= root.right.data;
		}
		System.out.println(toBePrinted);

		printrec(root.left);
		printrec(root.right);
	}
	
	public static int height(BinaryTreeNode<Integer> root)
	{
		if(root == null){
			return 0 ;
		}

		return Integer.max(height(root.left) , height(root.right))+1;
	}

	public static int diameter(BinaryTreeNode<Integer> root){
		if(root == null){
			return 0 ;
		}
		int leftheight = height(root.left);
		int rightheight = height(root.right);
		int height = leftheight+rightheight+1;
		int leftDiameter = diameter(root.left);
		int rightDiameter = diameter(root.right);
		return Integer.max(Integer.max(leftDiameter,rightDiameter), height);
	}


	public static BinaryTreeNode<Integer> findnode(BinaryTreeNode<Integer> root, int node){
		if(root == null){
			return root ;
		}
		if(root.data == node){
			return root;
		}
		BinaryTreeNode<Integer> data=null;
		BinaryTreeNode<Integer> leftdata = findnode(root.left, node);
		BinaryTreeNode<Integer> rightdata = findnode(root.right, node);
		if(leftdata != null){
			return leftdata;
		}
		return rightdata;


	}
	public static int recursiveSumOfnodes(BinaryTreeNode<Integer> root) {
	       if(root!= null) {
	           if(root.left != null || root.right!= null) {
	               return recursiveSumOfnodes(root.left)
	                  + recursiveSumOfnodes(root.right);
	           }
	           else {
	               return root.data;
	           }
	       }
	       else {
	           return 0;
	       }
	   }

	public static boolean MirrorTrees(BinaryTreeNode<Integer> a, BinaryTreeNode<Integer> b) {
	    if (a == null && b == null) {
	        return true;
	    }
	    if (a == null || b == null) {
	        return false;
	    }
	    return a.data == b.data && MirrorTrees(a.left, b.right)
	            && MirrorTrees(a.right, b.left);
	}
	
	
	public static void main(String args[]) throws Exception{
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		//printrec(root);

		/*	int h = height(root);
		System.out.println("height " +h);
		int d = diameter(root);
		System.out.print("diameter"+d);*/
		
		/*BinaryTreeNode<Integer>  data = findnode(root,3);
		if(data!=null){
		System.out.print(data.data);*/
		
	/*	int sum = recursiveSumOfnodes(root);
		System.out.println("sum of nodes is " +sum);*/
	
		
		if(MirrorTrees(root.left, root.right)){
			System.out.println("Is Mirror Tree");
		}
		else{
			System.out.println("Not a Mirror Tree");
		}
	}
}
// 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1