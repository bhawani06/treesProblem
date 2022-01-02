package treesProblems;

import java.util.LinkedList;
import java.util.Queue;

public class InsertInTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode a1 = new TreeNode(2);
		TreeNode a2 = new TreeNode(3);
		TreeNode a3 = new TreeNode(4);
		TreeNode a4 = new TreeNode(5);
		TreeNode a5 = new TreeNode(6);
		TreeNode a6 = new TreeNode(7);
		root.left = a1;
		root.right = a2;
		a1.left = a3;
		a1.right = a4;
		a2.left = a5;
		a2.right = a6;

		//int max = findMaxInTree(root);
		PrintTree_LevelOrder(root);
		root = insertInTreeRecursive(root , 20);

		PrintTree_LevelOrder(root);
		
	}
	

	private static TreeNode insertInTreeRecursive(TreeNode root, int val) 
	{
		if(root==null)
		{	root = new TreeNode(val);
			return root;
		}
		return insertInTreeRecursive(root.left, val);
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
