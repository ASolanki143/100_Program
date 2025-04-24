import java.util.ArrayList;

public class Program49 {
    public static void main(String[] args) {
        ArrayList<Integer>[] graph = Program48.getGraph();
        System.out.println("DFS Traversal starting from node 0:");
        DFS(graph,0);
        System.out.println();
    }

    public static void DFS(ArrayList<Integer>[] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        DFSUtil(graph, start, visited);
    }
    private static void DFSUtil(ArrayList<Integer>[] graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                DFSUtil(graph, neighbor, visited);
            }
        }
    }
}
