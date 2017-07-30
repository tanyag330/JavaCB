package datastructure.linklist;
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

		QueueusingLL<TreeNode<Integer>> pendingNodes = new QueueusingLL<TreeNode<Integer>>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isempty())
		{	
			TreeNode<Integer> currentNode = pendingNodes.dequeue();
			System.out.println("Enter number of children of "+currentNode.data+" :");
			int numChild = s.nextInt();	
			for(int i =0; i < numChild; i++){
				System.out.println("Enter "+i+" child of :"+currentNode.data);
				int childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				pendingNodes.enqueue(child);
				currentNode.children.add(child);			
			}
		}
		return root;
	}


	public static void printrec(TreeNode<Integer> root){
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
			printrec(currentChild);
		}
	}


	public static void print(TreeNode<Integer> root) throws Exception{
		if(root == null){
			return;
		}

		QueueusingLL<TreeNode<Integer>> pendingNodes = new QueueusingLL<TreeNode<Integer>>();
		pendingNodes.enqueue(root);

		while(!pendingNodes.isempty())
		{	
			TreeNode<Integer> currentNode = pendingNodes.dequeue();
			String toBePrinted  = currentNode.data +" : ";
			/*for(int i = 0; i < currentNode.children.size(); i++){
				TreeNode<Integer> currentChild = currentNode.children.get(i);
				toBePrinted+= currentChild.data +", ";
				pendingNodes.enqueue(currentChild);
			}*/
			for(TreeNode<Integer> child : currentNode.children){
				toBePrinted+= child.data +", ";
				pendingNodes.enqueue(child);
			}
			System.out.println(toBePrinted);


		}

	}
	public static int countnodes(TreeNode<Integer> root)
	{

		if(root == null){
			return 0 ;
		}
		int count =1 ;
		for(TreeNode<Integer> child : root.children){
			int numNodesInChild = countnodes(child);
			count = count + numNodesInChild;
		}

		return count;

	}
	public static TreeNode<Integer> largestdata(TreeNode<Integer> root)
	{

		if(root == null){
			return null ;
		}
		TreeNode<Integer> max= root;
		for(TreeNode<Integer> child : root.children){
			if (max.data < largestdata(child).data)

				max = largestdata(child);
		}

		return max;

	}
	public static TreeNode<Integer> secondlargestdata(TreeNode<Integer> root)
	{

		if(root == null){
			return null ;
		}
		TreeNode<Integer> max= largestdata(root);
		TreeNode<Integer> max2= root;
		for(TreeNode<Integer> child : root.children){
			if (max2.data < secondlargestdata(child).data &&  max.data > secondlargestdata(child).data)

				max2 = secondlargestdata(child);
		}

		return max2;

	}
	/*	public static TreeNode<Integer> nextlargestelement(TreeNode<Integer> root, int number )
	{

		if(root == null){
			return root ;
		}
		TreeNode<Integer> nextlargestinnode;
		if (root.data >number){
			nextlargestinnode = root;
		}
		for(TreeNode<Integer> child : root.children){
			TreeNode<Integer> nextlargestinchild = nextlargestelement(child,number);
			{
		if (nextlargestinchild!= null){
		if  (nextlargestinnode== null ||nextlargestinnode.data== nextlargestinchild.data)
		{
			nextlargestinnode = nextlargestinchild;
		}
		}
			}
		}
		return nextlargestinnode ;
	}*/

	public static int height(TreeNode<Integer> root)
	{
		if(root == null){
			return 0 ;
		}
		int height =0;
		for(TreeNode<Integer> child : root.children){
			int maxheight =height(child);
			if (height < maxheight){
				height = maxheight +height;

			}
		}
		return height+1;
	}
	public static int GreaterNodes(TreeNode<Integer> root, int x)
	{

		if(root == null){
			return 0 ;
		}
		int count =0 ;
		if (root.data >x){
			count =1 ;
		}
		for(TreeNode<Integer> child : root.children){


			int greaterNodesInChild = GreaterNodes(child,x);
			count = count + greaterNodesInChild;


		}
		return count;
	}
	public static int maximumSum(TreeNode<Integer> root, int x)
	{

		if(root == null){
			return 0 ;
		}
		int count =0 ;
		if (root.data >x){
			count =1 ;
		}
		for(TreeNode<Integer> child : root.children){


			int greaterNodesInChild = GreaterNodes(child,x);
			count = count + greaterNodesInChild;


		}
		return count;
	}

	public static void preorder_stack(TreeNode<Integer> root) throws StackEmptyException{
		if(root == null){
			return;
		}
		StackUsingLL<TreeNode<Integer>> s = new StackUsingLL<>();
		s.push(root);
		while(s.isempty())
		{
			TreeNode<Integer> currentNode = s.pop();
			String toBePrinted  = currentNode.data +" : ";
			for(int i =currentNode.children.size(); i >0; i--)
			{

				TreeNode<Integer> currentChild = currentNode.children.get(i);
				toBePrinted+= currentChild.data +", ";
				s.push(currentChild);

			}
			System.out.println(toBePrinted);

		}
	}

	public static void postorder(TreeNode<Integer> root) throws StackEmptyException{
		if(root == null){
			return;
		}
		StackUsingLL<TreeNode<Integer>> s = new StackUsingLL<>();
		
		while(s.isempty())
		{
			TreeNode<Integer> currentNode = s.pop();
			String toBePrinted  = currentNode.data +" : ";
			for(int i =currentNode.children.size(); i >0; i--)
			{

				TreeNode<Integer> currentChild = currentNode.children.get(i);
				toBePrinted+= currentChild.data +", ";
				s.push(currentChild);

			}
			System.out.println(toBePrinted);

		}
		s.push(root);
	}



	public static void main(String args[]) throws Exception{
		TreeNode<Integer> root = takeInputLevelWise();
		printrec(root);
		//System.out.print(countnodes(root));
		//System.out.print(GreaterNodes(root,4));

		/*	TreeNode<Integer> max = largestdata(root);
		System.out.print("largest node is" + max.data);*/

	//	TreeNode<Integer> max = secondlargestdata(root);
		//System.out.print("second largest node is" + max.data);
		
		/*int maxheight = height(root);
		System.out.print("height is" + maxheight);
		 */
		
		//preorder_stack(root);

		//1 2 2 3 2 4 5 2 6 7 0 0 0 0
	}
}