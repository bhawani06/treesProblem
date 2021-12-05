package treesProblems;

import java.util.LinkedList;
import java.util.Queue;

public class BuildBinaryTree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] preorder = new int[] {1,2,4,5,3,6,7};
		int[] inorder = new int[] {4,2,5,1,6,3,7};
		int[] postOrder = new int[] {4,5,2,6,7,3,1};

		TreeNode root = buildBinaryTreePre(preorder,inorder,0,6,0,6);
		//PrintTree_LevelOrder(root);
		TreeNode root1 = buildBinaryTreePost(postOrder,inorder,0,6,0,6);
		PrintTree_LevelOrder(root1);
	}

	private static TreeNode buildBinaryTreePost(int[] po, int[] io, int ps, int pe, int is, int ie) {
		// TODO Auto-generated method stub
		
		if(ps>pe || is > ie)
		{
			return null;
		}
		
		TreeNode root = new TreeNode(po[pe]);
		
		int k =is;
		for(;k<ie;++k)
		{
			if(io[k]==po[pe])
			{
				break;
			}
		}
		
		root.Left= buildBinaryTreePost(po, io, ps, ps-is+k-1, is, k-1);
		root.Right = buildBinaryTreePost(po, io, pe-ie+k, pe-1, k+1, ie);
		return root;
	}

	private static TreeNode buildBinaryTreePre(int[] po, int[] io, int ps, int pe, int is, int ie) {
		// TODO Auto-generated method stub
		if(ps>pe || is>ie)
		{
			return null;
		}
		
		TreeNode root = new TreeNode(po[ps]);
		
		int k=is;
		for( k=0;k<ie;++k)
		{
			if(io[k]==po[ps])
			{
				break;
			}
		}
		
		root.Left = buildBinaryTreePre(po, io, ps+1, ps+k-is, is, k-1);
		root.Right = buildBinaryTreePre(po, io, pe-(ie-k)+1, pe, k+1, ie);
		return root;
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
