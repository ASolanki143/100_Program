import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Program48 {
    public static void main(String[] args) {
        ArrayList<Integer>[] graph = getGraph();
        System.out.println("BFS Traversal starting from node 0:");
        BFS(graph, 0);
        System.out.println();
    }

    public static ArrayList<Integer>[] getGraph(){
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[5];
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[1].add(0);
        graph[2].add(0);
        graph[2].add(3);
        graph[3].add(4);
        graph[3].add(1);
        graph[3].add(1);
        graph[4].add(3);
        return graph;
    }

    public static void BFS(ArrayList<Integer>[] graph, int start){
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);

        visited[start] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " ");
            for(int neighbor : graph[node]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
