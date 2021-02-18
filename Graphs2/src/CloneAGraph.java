import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


public class CloneAGraph {
	
	public static Node cloneNode(Node node)
	{
		if(node==null)
		{
			return null;
		}
		
		HashMap<Node,Node> map = new HashMap<>();
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		map.put(node,new Node(node.val,new ArrayList<>()));
		
		while(!queue.isEmpty())
		{
			Node front = queue.poll();
			
			for(Node neighbor : front.neighbors)
			{
				if(!map.containsKey(neighbor))
				{
					map.put(neighbor,new Node(neighbor.val,new ArrayList<>()));
					queue.add(neighbor);
				}
				map.get(front).neighbors.add(map.get(neighbor));
			}
			
		}
		return map.get(node);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
