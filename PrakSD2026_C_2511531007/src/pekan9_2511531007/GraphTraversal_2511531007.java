package pekan9_2511531007;

import java.util.*;
public class GraphTraversal_2511531007 {
	private Map<String, List<String>> graph_1007 = new HashMap<>();
	
	//Menambahkan edge (graf tak berarah)
	public void addEdge_1007(String node1_1007, String node2_1007) {
		graph_1007.putIfAbsent(node1_1007, new ArrayList<>());
		graph_1007.putIfAbsent(node2_1007, new ArrayList<>());
		graph_1007.get(node1_1007).add(node2_1007);
		graph_1007.get(node2_1007).add(node1_1007);
	}
	
	//Menampilkan graf awal
	public void printGraph_1007() {
		System.out.println("Graf Awal (Adjacency List):");
		for (String node_1007 : graph_1007.keySet()) {
			System.out.print(node_1007 + " -> ");
			List<String> neighbors_1007 = graph_1007.get(node_1007);
			System.out.println(String.join(", ", neighbors_1007));
		}
		System.out.println();
	}
	
	// DFS rekursif
	public void dfs_1007(String start_1007) {
		Set<String> visited_1007 = new HashSet<>();
		System.out.println("Penelusuran DFS:");
		dfsHelper_1007(start_1007, visited_1007);
		System.out.println();
	}

	private void dfsHelper_1007(String current_1007, Set<String> visited_1007) {
		if (visited_1007.contains(current_1007)) 
			return;
		visited_1007.add(current_1007);
		System.out.print(current_1007 + " ");
		for (String neighbor_1007 : graph_1007.getOrDefault(current_1007, new ArrayList<>())) {
			dfsHelper_1007(neighbor_1007, visited_1007);
		}
	}
	
	//BFS iteratif
	public void bfs_1007(String start_1007) {
		Set<String> visited_1007 = new HashSet<>();
		Queue<String> queue_1007 = new LinkedList<>();
		queue_1007.add(start_1007);
		visited_1007.add(start_1007);
		System.out.println("Penelusuran BFS:");
		while (!queue_1007.isEmpty()) {
			String current_1007 = queue_1007.poll();
			System.out.print(current_1007 + " ");
			for (String neighbor_1007 : graph_1007.getOrDefault(current_1007, new ArrayList<>())) {
				if (!visited_1007.contains(neighbor_1007)) {
					queue_1007.add(neighbor_1007);
					visited_1007.add(neighbor_1007);
				}
			}
		}
		System.out.println();
	}
	//Main
	public static void main(String[] args) {
		GraphTraversal_2511531007 graph_1007 = new GraphTraversal_2511531007();
		
		// Contoh graf: A-B, A-C, B-D, B-E
		graph_1007.addEdge_1007("A", "B");
		graph_1007.addEdge_1007("A", "C");
		graph_1007.addEdge_1007("B", "D");
		graph_1007.addEdge_1007("B", "E");
		
		//Cetak graf awal
		System.out.println("Graf Awal adalah: ");
		graph_1007.printGraph_1007();
		
		//Lakukan penelusuran
		graph_1007.dfs_1007("A");
		graph_1007.bfs_1007("A");

	}

}
