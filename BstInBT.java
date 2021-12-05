package treesProblems;

public class BstInBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(25);
	        root.Left = new TreeNode(12);
	        root.Right = new TreeNode(36);
	        root.Left.Left = new TreeNode(10);
	        root.Left.Right = new TreeNode(15);
	        root.Right.Left = new TreeNode(30);
	  
	        // convert to DLL
	        TreeNode bstRoot = largestBst(root);
	                 
	}

	private static TreeNode largestBst(TreeNode root) {
		// TODO Auto-generated method stub
		return null;
	}

}
