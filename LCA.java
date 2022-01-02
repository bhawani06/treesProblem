package treesProblems;

public class LCA {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		TreeNode a1 = new TreeNode(2);
		TreeNode a2 = new TreeNode(3);
		TreeNode a3 = new TreeNode(4);
		TreeNode a4 = new TreeNode(5);
		TreeNode a5 = new TreeNode(6);
		TreeNode a6 = new TreeNode(7);
		TreeNode a7 = new TreeNode(8);
		root.left = a1;
		root.right = a2;
		a1.left = a3;
		a1.right = a4;
		a2.left = a5;
		a2.right = a6;
		a3.right = a7;
		
		TreeNode lca = lca(root,a7,a6);
		
		System.out.println(lca.val);
	}

	private static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
		// TODO Auto-generated method stub
		if(root == null)
		{
			return null;
		}
		
		if(root.val == p.val || root.val ==q.val)
			return root;
		TreeNode isleft = lca(root.left,p,q);
		TreeNode isright = lca(root.right,p,q);
		
		if(isleft != null && isright != null)
			return root;
		if(isleft != null)
			return isleft;
		if(isright != null)
			return isright;
		return null;
	}
}
