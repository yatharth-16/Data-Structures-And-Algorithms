import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class AdjacencyList {

	
	private LinkedList<Integer> adj[];
	
	public AdjacencyList(int v)
	{
		adj = new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i]= new LinkedList<Integer>();
		}	
	}
	
	public void addEdge(int source, int destination)
	{
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public int BFS(int source, int destination)
	{
		boolean visited[] = new boolean[adj.length];
		
		Queue<Integer> q = new LinkedList<>();
		q.add(source);
		int parent[] = new int[adj.length];
		parent[source]=-1;
		visited[source]=true;
		
		while(!	q.isEmpty())
		{
			int curr = q.poll();
			
			if(curr==destination)
			{
				break;
			}
			
			for(int neighbour : adj[curr])
			{
				if(!visited[neighbour])
				{
					q.add(neighbour);
					visited[neighbour]=true;
					parent[neighbour]=curr;
				}
			}
		}
		int curr=destination;
		int dist=0;
		while(parent[curr]!=-1)
		{
			System.out.print(curr+" ");
			curr=parent[curr];
			dist++;
		}
		System.out.println(curr);
		return dist;
		
		
	}
	public boolean dfsUtil(int source,int destination,boolean visited[])
	{
		if(source==destination)
		{   
			return true;
		}
		
		for(int neighbour : adj[source])
		{    
			if(!visited[neighbour])
			{
				visited[neighbour]=true;
				return dfsUtil(neighbour,destination,visited);
			}
		
		}
		
		return false;
	}
	
	public boolean dfs(int source,int destination)
	{
		boolean vis[] = new boolean[adj.length];
		vis[source]=true;
		return dfsUtil(source,destination,vis);
	}
	
	public boolean DFSUsingStack(int source,int destination)
	{
		boolean visited[] = new boolean[adj.length];
		visited[source]=true;
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(source);
		
		while(!stack.isEmpty())
		{
			int curr=stack.pop();
			if(curr==destination)
			{
				return true;
			}
			
			for(int neighbour : adj[curr])
			{
				if(!visited[neighbour])
				{
					visited[neighbour]=true;
					stack.push(neighbour);
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int v = s.nextInt();
		int e = s.nextInt();
		
		AdjacencyList graph = new AdjacencyList(v);
		
		for(int i=0;i<e;i++)
		{
			int source = s.nextInt();
			int destination = s.nextInt();
			graph.addEdge(source, destination);
		}
		
		System.out.println(graph.BFS(0, 3));
		

	}

}
