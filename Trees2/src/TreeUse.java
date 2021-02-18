import java.util.Scanner;

public class TreeUse {
	
	
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root)
	{
		if(root==null)
        {
            return null;
        }
        
        TreeNode<Integer> ans = root;
        
        int sum = root.data;
        
        for(int i=0;i<root.children.size();i++)
        {
            sum+= root.children.get(i).data;
        }
        
         for(int i=0;i<root.children.size();i++)
        {
           TreeNode<Integer> smallAns = root.children.get(i);
             
             int smallSum = smallAns.data;
             
             for(int j=0;j<smallAns.children.size();j++)
             {
                 smallSum+=smallAns.children.get(j).data;
             }
             
             if(smallSum>sum)
             {
                 sum = smallSum;
                 ans=smallAns;
             }
             
        }
        
        return ans;
        
	}
	
	public static void printAtK(TreeNode<Integer> root, int k)
	{
		if(k<0)
		{
			return;
		}
		
		if(k==0)
		{
			System.out.println(root.data);
			return;
		}
		
		for(int i=0;i<root.children.size();i++)
		{
			printAtK(root.children.get(i), k-1);
		}
		
		
	}
	
	public static void preorder(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		
		System.out.print(root.data +" ");
		
		for(int i=0;i<root.children.size();i++)
		{
			preorder(root.children.get(i));
		}
	}
	 
	
	public static int numNodes(TreeNode<Integer> root)
	{   
		if(root==null)
		{
			return 0;
		}
		int count=1;
		
		for(int i=0;i<root.children.size();i++)
		{
			count+=numNodes(root.children.get(i));
		}
		
		return count;
	}
	
	public static int largest(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		
		int ans = root.data;
		
		for(int i=0;i<root.children.size();i++)
		{
			int childLargest = largest(root.children.get(i));
			
			if(childLargest>ans)
			{
				ans = childLargest;
			}
		}
		
		return ans;
	}
	
	public static TreeNode<Integer> takeInputLevelWise()
	{
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<>(rootData);
		
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty())
		{
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter number of children of "+frontNode.data);
				int numChildren = s.nextInt();
				
				for(int i=0;i<numChildren;i++)
				{
					System.out.println("Enter "+(i+1)+" th child of "+frontNode.data);
					
					int child=s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
				
			} catch (QueueEmptyException e) {
				
				//Shouldn't come
				return null;
			}	
		}
		return root;
	} 
	
	public static TreeNode<Integer> takeInput(Scanner s)
	{
		int n;
		
		System.out.println("Enter next Node data");
		n=s.nextInt();
		TreeNode<Integer> root = new TreeNode<>(n);
		System.out.println("Enter no of children for "+ n);
		int childCount=s.nextInt();
		
		for(int i=0;i<childCount;i++)
		{
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		
		return root;
		
	}
	
	public static void print(TreeNode<Integer> root)
	{
		String s = root.data+":";
		
		for(int i=0;i<root.children.size();i++)
		{
			s=s+root.children.get(i).data+",";
		}
		
		System.out.println(s);
		
		for(int i=0;i<root.children.size();i++)
		{
			print(root.children.get(i));
		}
		
	}
	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        if(root==null)
        {
            return null;
        }
        else if(root.children.size()==0)
        {
            return null;
        }
        
       
        for(int i=0;i<root.children.size();i++)
        {
            root.children.set(i, removeLeafNodes(root.children.get(i)));
        }
        
        return root;
		
	}

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		TreeNode<Integer> root = takeInput(s);
		
		TreeNode<Integer> root = takeInputLevelWise();
		
		removeLeafNodes(root);
		print(root);
		//printAtK(root, 2);
		preorder(root);
		//System.out.println(largest(root));
		//print(root);
        
//		TreeNode<Integer> root = new TreeNode<>(4);
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(5);
//		TreeNode<Integer> node4 = new TreeNode<>(6);
//		
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node2.children.add(node4);
//        
//        System.out.println(root);
		
		
        
	}

}
