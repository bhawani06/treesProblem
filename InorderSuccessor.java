package treesProblems;

public class InorderSuccessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(25);
        root.left = new TreeNode(12);
        root.right = new TreeNode(36);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(15);
        root.right.left = new TreeNode(30);
  
        // convert to DLL
        TreeNode res =inorderSucc(root,new TreeNode(36));
        System.out.println(res.val);
	}

	private static TreeNode inorderSucc(TreeNode root,TreeNode p) {
		// TODO Auto-generated method stub
		if(root == null)
		{
			return null;
		}
		if(root.val <= p.val)
		{
			return	inorderSucc(root.right, p);
		}
		TreeNode temp = inorderSucc(root.left, p);
		if(temp!=null)	
		{
			return temp;
		}
		return root;
	}

}
