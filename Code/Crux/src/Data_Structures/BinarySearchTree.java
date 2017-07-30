package datastructure.linklist;

public class BinarySearchTree {

	public static void printBwNums(BinaryTreeNode<Integer> root, int num1, int num2){
		if(root == null){
			return;
		}
		if(root.data >= num1 && root.data <= num2){

			printBwNums(root.left, num1, num2);
			System.out.println(root.data);
			printBwNums(root.right, num1, num2);
		}

		if (num2 < root.data){
			printBwNums(root.left, num1, num2);
		}
		if (num1 > root.data){
			printBwNums(root.right, num1, num2);
		}

	}
	public static int largestdata(BinaryTreeNode<Integer> root)
	{

		if(root == null){
			return 0;
		}
		int max= root.data;

		return Integer.max(max,Integer.max(largestdata(root.left),largestdata(root.right)));

	}
	public static int minimum(BinaryTreeNode<Integer> root)
	{

		if(root == null){
			int min= root.data;
			return min ;
		}
		int min= root.data;

		return Integer.min(min,Integer.max(minimum(root.left),minimum(root.right)));

	}

	/*public static boolean checkBST(BinaryTreeNode<Integer> root) {
		if(root == null){
			return true ;
		}
		int max = largestdata(root.left);
		int min = largestdata(root.right);
		if (!(max<root.data)){
			return false;
		}
		if (!(min>root.data)){
			return false;
		}	
		return 
	}
*/
	
	
	public static BinaryTreeNode<Integer> buildBST(int [] input, int beginningval, int endval){
		BinaryTreeNode<Integer> output = new BinaryTreeNode<Integer>();
		int midval=(beginningval+endval)/2;
		if(input.length == 0){
			return null;	
		}
		if (beginningval> endval){
			return null;	
				
		}
		output.data =input[midval];
		output.left= buildBST(input, beginningval, midval-1);
		output.right= buildBST(input, midval+1, endval );
		return output;
	}

	public static void printrec(BinaryTreeNode<Integer> root) throws Exception{
		if(root == null){
			return;
		}
		String toBePrinted  = root.data +" : ";
		if(root.left!= null)
		{
			toBePrinted+= root.left.data;
		}
		if(root.right!= null)
		{
			toBePrinted+=" , " + root.right.data;
		}
		System.out.println(toBePrinted);

		printrec(root.left);
		printrec(root.right);
	}
	
	public static void main(String args[]) throws Exception{
		//BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		//printBwNums(root, 7, 13);
/*		int a = largestdata(root);
		System.out.println(a);
		int b = minimum(root);
		System.out.println(b);*/
		int[] input = { 1,2,3,4,5};
		BinaryTreeNode<Integer> a = buildBST(input, 0, input.length-1);
		printrec(a);
		 
	}
}//10 7 20 6 9 13 25 -1 -1 -1 -1 -1 -1 -1 -1
