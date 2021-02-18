import java.util.*;


class Edge implements Comparable<Edge>
{
	int source;
	int destination;
	int weight;
	@Override
	public int compareTo(Edge o) {
		
		return this.weight-o.weight;  //increasing
	}
}
public class Graphs_2 {
	
	public static int findParent(int v, int[] parent) {
		
		if(parent[v]==v)
		{
			return v;
		}
		
		return findParent(parent[v], parent);
	}

   
	public static void Kruskals(Edge[] input, int n) {
		
		Arrays.sort(input);
		Edge output[] = new Edge[n-1];
		
		
		
		int parent[] = new int[n];
		
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		
		
		int count=0;
		int i=0;
		
		while(count!=n-1)
		{
			Edge currentEdge = input[i];
			
			int sourceParent = findParent(currentEdge.source, parent);
			int destinationParent = findParent(currentEdge.destination,parent);
			
			if(sourceParent!=destinationParent)
			{
				output[count]= currentEdge;
				count++;
				parent[sourceParent]=destinationParent;
				
			}
			i++;
			
			
			
		}
		
		for(i=0;i<n-1;i++)
		{  
			if(output[i].source<output[i].destination)
			{
				System.out.println(output[i].source+" "+output[i].destination+" "+output[i].weight);
			}
			else
			{
				System.out.println(output[i].destination+" "+output[i].source+" "+output[i].weight);
			}
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int E = s.nextInt();
		
		Edge [] input = new Edge[E];
		
		for(int i=0;i<E;i++)
		{
			input[i]= new Edge();
			input[i].source= s.nextInt();
			input[i].destination= s.nextInt();
			input[i].weight= s.nextInt();
			
		}
		
		Kruskals(input,n);
	}

	
}
