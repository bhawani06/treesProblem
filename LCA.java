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
		root.Left = a1;
		root.Right = a2;
		a1.Left = a3;
		a1.Right = a4;
		a2.Left = a5;
		a2.Right = a6;
		a3.Right = a7;
		
		TreeNode lca = lca(root,a7,a6);
		
		System.out.println(lca.data);
	}

	private static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
		// TODO Auto-generated method stub
		if(root == null)
		{
			return null;
		}
		
		if(root.data == p.data || root.data ==q.data)
			return root;
		TreeNode isLeft = lca(root.Left,p,q);
		TreeNode isRight = lca(root.Right,p,q);
		
		if(isLeft != null && isRight != null)
			return root;
		if(isLeft != null)
			return isLeft;
		if(isRight != null)
			return isRight;
		return null;
	}
}
