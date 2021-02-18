import java.util.LinkedList;
import java.util.Scanner;

public class AdjacencyList2 {

	 private static LinkedList<Integer> adj [];
	
	
	public AdjacencyList2(int v) {
		
		adj = new LinkedList[v];
		
		for(int i=0;i<v;i++)
		{
			adj[i]= new LinkedList<>();
		}
	}
	
	public static void add(int source,int destination)
	{   
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();
		
		AdjacencyList2 graph = new AdjacencyList2(v);
		
		for(int i=0;i<e;i++)
		{
			int source = s.nextInt();
			int destination = s.nextInt();
			add(source, destination);
		}
		
		for(int i=0;i<v;i++)
		{   
			System.out.print(i+":");
			for(int neighbour : adj[i])
			{
				System.out.print(neighbour+" ");
			}
		
			System.out.println();
		}
		
	}

}
