package treesProblems;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeLevelOrder {

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
		PrintTree_LevelOrder(root);
		
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
