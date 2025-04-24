import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program50 {

    static HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the edges: (Format: u v, type '-1' to finish)");
        while (true) {
            String edge = sc.nextLine();
            if (edge.equals("-1")) {
                break;
            }
            addEdge(edge);
        }
        findOutDegree();
        findInDegree();
        sc.close();
    }

    public static void addEdge(String edge){
        String[] parts = edge.split(" ");
        int u = Integer.parseInt(parts[0]);
        int v = Integer.parseInt(parts[1]);
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(v);
    }

    public static void findOutDegree(){
        System.out.println("Out Degree of each Vertex : ");
        for(Map.Entry<Integer, ArrayList<Integer>> entry : graph.entrySet()){
            System.out.println("Vertes "+entry.getKey()+" : "+entry.getValue().size());
        }
    }

    public static void findInDegree(){
        HashMap<Integer,Integer> inDegree = new HashMap<>();
        for(Map.Entry<Integer,ArrayList<Integer>> entry : graph.entrySet()){
            for(int v : entry.getValue()){
                inDegree.put(v , inDegree.getOrDefault(v, 0) + 1);
            }
        }
        System.out.println("In Degree of each Vertex : ");
        for(Map.Entry<Integer,Integer> entry : inDegree.entrySet()){
            System.out.println("Vertex "+entry.getKey()+" : "+entry.getValue());
        }
    }
}
