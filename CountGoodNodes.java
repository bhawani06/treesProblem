package treesProblems;

public class CountGoodNodes {
//https://leetcode.com/problems/count-good-nodes-in-binary-tree/solution/
	 public void goodNodes(TreeNode root, int max) {
		 if(root == null)
			 return;
		 
		 if(root.val>=max)
		 {
			 ++ res;
			 max = root.val;
		 }

		 goodNodes(root.left, max);
		 goodNodes(root.right, max);
		 
		 
	    }
	 public int goodNodes(TreeNode root) {
		 if(root == null)
			 return 0;
		 goodNodes(root, max);
		 return res;
	    }
	 int max = Integer.MIN_VALUE, res=0;
	public static void main(String[] args) {
		
	}

}
