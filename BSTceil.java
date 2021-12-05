package treesProblems;

import java.util.LinkedList;
import java.util.Queue;

public class BSTceil {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(25);
	        root.Left = new TreeNode(12);
	        root.Right = new TreeNode(36);
	        root.Left.Left = new TreeNode(10);
	        root.Left.Right = new TreeNode(15);
	        root.Right.Left = new TreeNode(30);

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
	        if (node.data == input) {
	            return node.data;
	        }
	 
	        // If root's key is smaller,
	        // ceil must be in right subtree
	        if (node.data < input) {
	            return Ceil(node.Right, input);
	        }
	 
	        // Else, either left subtree or root
	        // has the ceil value
	        int ceil = Ceil(node.Left, input);
	 
	        return (ceil >= input) ? ceil : node.data;
	    }

	 static int Ceil2(TreeNode node, int input)
	    {
	 
	        // Base case
	        if (node == null) {
	            return -1;
	        }
	 
	        // We found equal key
	        if (node.data == input) {
	            return node.data;
	        }
	 
	        // If root's key is smaller,
	        // ceil must be in right subtree
	        if (node.data < input) {
	            return Ceil(node.Right, input);
	        }
	 
	        // Else, either left subtree or root
	        // has the ceil value
	        int tmp  = Ceil(node.Left, input);
	 
	        return (tmp == -1 ) ? node.data :tmp;
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
			System.out.println(tmp.data);
			if(tmp.Left != null)
			{
				q.add(tmp.Left);
			}
			if(tmp.Right!=null)
			{
				q.add(tmp.Right);
			}
		}
	}
}

