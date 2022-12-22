import java.io.*;
import java.util.*;

class ShortestPath {
	static class AdjListNode {
		int vertex, weight;
		AdjListNode(int v, int w)
		{
			vertex = v;
			weight = w;
		}
		int getVertex() { 
            return vertex; 
        }
		int getWeight() { 
            return weight; 
        }
	}

	public static int dijkstra( int V, ArrayList<ArrayList<AdjListNode>> graph, int src,int destination)
	{
		int[] distance = new int[V];
		for (int i = 0; i < V; i++)
			distance[i] = Integer.MAX_VALUE;
		distance[src] = 0;

		PriorityQueue<AdjListNode> pq = new PriorityQueue<>((v1, v2) -> v1.getWeight() - v2.getWeight());
		pq.add(new AdjListNode(src, 0));

		while (pq.size() > 0) {
			AdjListNode current = pq.poll();

			for (AdjListNode n :graph.get(current.getVertex())) {
				if (distance[current.getVertex()]+ n.getWeight()< distance[n.getVertex()]) {
					distance[n.getVertex()]= n.getWeight()+ distance[current.getVertex()];
					pq.add(new AdjListNode(n.getVertex(),distance[n.getVertex()]));
				}
			}
		}
		return distance[destination];
	}

	public static void main(String[] args)
	{
        Scanner in =new Scanner(System.in);
		int V = 10;
		ArrayList<ArrayList<AdjListNode> > graph= new ArrayList<>();
		for (int i = 0; i < V; i++) {
			graph.add(new ArrayList<>());
		}
	    graph.get(0).add(new AdjListNode(1, 4));
		graph.get(0).add(new AdjListNode(7, 8));
		graph.get(1).add(new AdjListNode(2, 8));
		graph.get(1).add(new AdjListNode(7, 11));
		graph.get(1).add(new AdjListNode(0, 4));
		graph.get(2).add(new AdjListNode(1, 8));
		graph.get(2).add(new AdjListNode(3, 7));
		graph.get(2).add(new AdjListNode(8, 2));
		graph.get(2).add(new AdjListNode(5, 4));
		graph.get(3).add(new AdjListNode(2, 7));
		graph.get(3).add(new AdjListNode(4, 9));
		graph.get(3).add(new AdjListNode(5, 14));
		graph.get(4).add(new AdjListNode(3, 9));
		graph.get(4).add(new AdjListNode(5, 10));
		graph.get(5).add(new AdjListNode(4, 10));
		graph.get(5).add(new AdjListNode(6, 2));
            graph.get(5).add(new AdjListNode(2, 4));
            graph.get(5).add(new AdjListNode(3, 14));
		graph.get(6).add(new AdjListNode(5, 2));
		graph.get(6).add(new AdjListNode(7, 1));
		graph.get(6).add(new AdjListNode(8, 6));
		graph.get(7).add(new AdjListNode(0, 8));
		graph.get(7).add(new AdjListNode(1, 11));
		graph.get(7).add(new AdjListNode(6, 1));
		graph.get(7).add(new AdjListNode(8, 7));
		graph.get(8).add(new AdjListNode(2, 2));
		graph.get(8).add(new AdjListNode(6, 6));
		graph.get(8).add(new AdjListNode(7, 1));
            graph.get(9).add(new AdjListNode(4, 2));
            graph.get(9).add(new AdjListNode(5, 1));
          
            System.out.println("Enter the source vertex");
		int source = in.nextInt();
        
            System.out.println("Enter the destination vertex");
		int destination = in.nextInt();

		int shortestDist = dijkstra(V, graph, source, destination);
		System.out.println("Least travelling distance from source vertex-"+ source+" to destination vertex-"+destination+" is "+shortestDist);
	}
}
