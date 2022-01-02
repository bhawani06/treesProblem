package treesProblems;
class NodeValue
{
	int max,min,val,size;
	boolean isbst;
	public NodeValue(int ma,int mi,int  v, int s, boolean isb)
	{
		max=ma;
		min =mi;
		val=v;
		size=s;
		isbst =isb;
	}
}
public class BstInBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(25);
	        root.left = new TreeNode(12);
	        root.right = new TreeNode(36);
	        root.left.left = new TreeNode(10);
	        root.left.right = new TreeNode(15);
	        root.right.left = new TreeNode(30);
	  
	        // convert to DLL
	        NodeValue bstRoot = largestBst(root);
	        System.out.println(bstRoot.size);
	                 
	}

	
	private static NodeValue largestBst(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null)
			return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0, true);
		
		if(root.left==null && root.right==null)
		{
			return new NodeValue(root.val, root.val, root.val, 1, true);
		}
        
		
		NodeValue l = largestBst(root.left);
		NodeValue r = largestBst(root.right);
		NodeValue cur;
		
		if(l.max<root.val && root.val<r.min)
				cur= new NodeValue(Math.max(root.val, r.max),Math.min(root.val, l.min),root.val,l.size+r.size+1,true);
		else
			cur = new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, root.val, Math.max(l.size, r.size), false);
		
		
		return cur;
	}
	

}
