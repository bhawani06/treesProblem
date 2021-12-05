package treesProblems;

import java.util.LinkedList;

public class TreesInForest {

	int V;
	LinkedList<Integer>[] adj;
	
	public TreesInForest(int c) {
		// TODO Auto-generated constructor stub

        adj = new LinkedList[c];
        V=c;
		for(int i =0;i<c;++i)
		{
			adj[i]= new LinkedList<Integer>();
		}
	}

	// Method to add an edge into the graph
    void addEdge(int v, int w)
    {
 
        // Add w to v's list.
        adj[v].add(w);
    }
    
    public int CountTrees(int s)
	{
    	boolean[] vis = new boolean[V];
    	
    	int res=0;
    	for(int i=0;i<V;++i)
    	{
    		if(vis[i]==false)
    		{
    			++res;
    			CountTreesUtil(i,vis);
    		}
    	}

    	
    	return res;
	}
    
	private void CountTreesUtil(int s, boolean[] vis) 
	{
		vis[s]=true;
		
		for(int n:adj[s]) {
			if(vis[n]==false)
			{
				CountTreesUtil(n,vis);				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreesInForest g = new TreesInForest(9);
		 g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(3, 4);
	        g.addEdge(3, 5);
	        g.addEdge(6, 8);
	        g.addEdge(8, 7);
        
        System.out.println(g.CountTrees(0));

	}
}
