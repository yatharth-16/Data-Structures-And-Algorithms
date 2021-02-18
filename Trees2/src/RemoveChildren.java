
public class RemoveChildren {

	
	
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
		

	}

}
