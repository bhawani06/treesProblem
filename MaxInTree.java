package treesProblems;

import java.util.LinkedList;
import java.util.Queue;

public class MaxInTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode a1 = new TreeNode(2);
		TreeNode a2 = new TreeNode(3);
		TreeNode a3 = new TreeNode(4);
		TreeNode a4 = new TreeNode(5);
		TreeNode a5 = new TreeNode(6);
		TreeNode a6 = new TreeNode(7);
		root.Left = a1;
		root.Right = a2;
		a1.Left = a3;
		a1.Right = a4;
		a2.Left = a5;
		a2.Right = a6;

		//int max = findMaxInTree(root);
		int max = findMaxInTreeLevelOrder(root);
		System.out.println(max);
		
	}

	private static int findMaxInTreeLevelOrder(TreeNode root) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		if(root==null)
		{
			return max;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty())
		{
			root = q.remove();
			if(root.data > max)
			{
				max = root.data;
			}
			if(root.Left!=null)
			{
				q.add(root.Left);
			}
			if(root.Right!=null)
			{
				q.add(root.Right);
			}
		}
		return max;
	}

	private static int findMaxInTree(TreeNode root) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		
		if(root != null)
		{
			int leftmax = findMaxInTree(root.Left);
			int rightmax = findMaxInTree(root.Right);
			int maxchild = (leftmax > rightmax) ? leftmax:rightmax;
			max = (maxchild > root.data) ? maxchild:root.data;
		}
		return max;
	}
}