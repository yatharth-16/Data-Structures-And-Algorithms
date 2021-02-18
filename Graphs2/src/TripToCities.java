import java.util.Scanner;

public class TripToCities {

	public static int findMinVertex(int distance[], boolean visited[]) {
		int minVertex = -1;
		for (int i = 1; i < distance.length; i++) {
			if (!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
				minVertex = i;
			}
		}
		return minVertex;
	}

	public static int dijkstras(int adjacentMatrix[][], int c, int k) {
        
		int v = adjacentMatrix.length;
		int distance[] = new int[v];
		boolean visited[] = new boolean[v];

		distance[c] = 0;

		for (int i = 1; i < distance.length; i++) {
			if(c != i){
                distance[i] = Integer.MAX_VALUE;
            }
		}

		for (int i = 1; i <v - 1; i++) {
			// find min vertex
			int minVertex = findMinVertex(distance, visited);
			visited[minVertex] = true;
			// Explore neighbors
			for (int j = 1; j < v; j++) {
				if (adjacentMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {
					int newDistance = distance[minVertex] + adjacentMatrix[minVertex][j];
					if (newDistance < distance[j]) {
						distance[j] = newDistance;
					}
				}
			}
		}
        
        int count = 0;
        for(int i = 1; i < v; i++){
            if(distance[i] <= k){
                count++;
            }
        }
        return count;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c = in.nextInt();
        int k = in.nextInt();
        
        int map[][] = new int[n+1][n+1];
        
        for(int i = 1; i <= m; i++) {
        	int x = in.nextInt();
        	int y = in.nextInt();
        	int z = in.nextInt();
        	map[x][y] = map[y][x] = z;
        }
        System.out.println(dijkstras(map, c, k));
    }
	
	
	
}
