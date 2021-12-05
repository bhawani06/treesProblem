package treesProblems;

public class InorderSuccessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(25);
        root.Left = new TreeNode(12);
        root.Right = new TreeNode(36);
        root.Left.Left = new TreeNode(10);
        root.Left.Right = new TreeNode(15);
        root.Right.Left = new TreeNode(30);
  
        // convert to DLL
        TreeNode res =inorderSucc(root,new TreeNode(36));
        System.out.println(res.data);
	}

	private static TreeNode inorderSucc(TreeNode root,TreeNode p) {
		// TODO Auto-generated method stub
		if(root == null)
		{
			return null;
		}
		if(root.data <= p.data)
		{
			return	inorderSucc(root.Right, p);
		}
		TreeNode temp = inorderSucc(root.Left, p);
		if(temp!=null)	
		{
			return temp;
		}
		return root;
	}

}
