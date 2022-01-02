package treesProblems;

import java.util.LinkedList;
import java.util.Queue;

public class BSTceil {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(25);
	        root.left = new TreeNode(12);
	        root.right = new TreeNode(36);
	        root.left.left = new TreeNode(10);
	        root.left.right = new TreeNode(15);
	        root.right.left = new TreeNode(30);

			int c = Ceil(root,16);
			System.out.println(c);
			int c2 = Ceil2(root,16);
			System.out.println(c2);
	}

	 static int Ceil(TreeNode node, int input)
	    {
	 
	        // Base case
	        if (node == null) {
	            return -1;
	        }
	 
	        // We found equal key
	        if (node.val == input) {
	            return node.val;
	        }
	 
	        // If root's key is smaller,
	        // ceil must be in right subtree
	        if (node.val < input) {
	            return Ceil(node.right, input);
	        }
	 
	        // Else, either left subtree or root
	        // has the ceil value
	        int ceil = Ceil(node.left, input);
	 
	        return (ceil >= input) ? ceil : node.val;
	    }

	 static int Ceil2(TreeNode node, int input)
	    {
	 
	        // Base case
	        if (node == null) {
	            return -1;
	        }
	 
	        // We found equal key
	        if (node.val == input) {
	            return node.val;
	        }
	 
	        // If root's key is smaller,
	        // ceil must be in right subtree
	        if (node.val < input) {
	            return Ceil(node.right, input);
	        }
	 
	        // Else, either left subtree or root
	        // has the ceil value
	        int tmp  = Ceil(node.left, input);
	 
	        return (tmp == -1 ) ? node.val :tmp;
	    }
	 
	
	private static void PrintTree_LevelOrder(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null)
			return;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(! q.isEmpty())
		{
			TreeNode tmp= q.remove();
			System.out.println(tmp.val);
			if(tmp.left != null)
			{
				q.add(tmp.left);
			}
			if(tmp.right!=null)
			{
				q.add(tmp.right);
			}
		}
	}
}

