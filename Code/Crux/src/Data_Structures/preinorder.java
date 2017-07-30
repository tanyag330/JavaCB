package datastructure.linklist;

import java.util.Scanner;

public class preinorder {
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
	

	public static BinaryTreeNode<Integer> CreateTreeUsingPreInorder(int[] inorder, int[] preorder, int inorderstart,int inorderend,int preorderend, int preorderstart){
		if(inorderstart> inorderend){
			return null ;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>();
		root.data = preorder[preorderstart];
		int i;
		for (i=inorderstart; i<inorderend; i++)
		{
			if (root.data==inorder[i]);
		break;
		}
		int leftinorderstart = inorderstart;
		int leftinorderend =i-1;
		int rightinorderstart=i+1;
		int rightinorderend = inorderend;
	
		int leftpreorderstart = preorderstart+1;
		int leftpreorderend =preorderend;
		int leftlength = leftinorderend- leftinorderstart+1;
		int rightpreorderstart= leftpreorderstart +leftlength -1;
		int rightpreorderend = leftpreorderend+1;
		
		root.left= CreateTreeUsingPreInorder(inorder, preorder, leftinorderstart, leftinorderend, leftpreorderend, leftpreorderstart);
		root.right= CreateTreeUsingPreInorder(inorder, preorder, rightinorderstart, rightinorderend, rightpreorderend, rightpreorderstart);
		return root;
	}	
	public static void main(String args[]) throws Exception
	{
		int preorder[] = { 1,2,4,5,3,6,7};
		int inorder[] = {4,2,5,1,6,3,7};
		BinaryTreeNode<Integer> root = CreateTreeUsingPreInorder(inorder, preorder, 0, inorder.length-1, 0, preorder.length-1);
		printrec(root);
		
	}
}
	
