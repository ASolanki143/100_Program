import java.util.ArrayList;
import java.util.List;

public class Program63 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result1 = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];
        ArrayList<Integer> ans = new ArrayList<>();
        Program63 program = new Program63();
        program.findPermutation1(arr, ans, visited, result1);
        System.out.println("Permutations: ");
        for (List<Integer> list : result1) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        List<List<Integer>> result2 = new ArrayList<>();
        program.findPermutation2(0, arr, result2);
        System.out.println("Permutations using swap: ");
        for (List<Integer> list : result2) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public void findPermutation1(int[] arr, ArrayList<Integer> ans, boolean[] visited, List<List<Integer>> result){
        if(ans.size() == arr.length){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int i = 0; i < arr.length ; i++){
            if(!visited[i]){
                visited[i] = true;
                ans.add(arr[i]);
                findPermutation1(arr, ans, visited, result);
                ans.remove(ans.size() - 1);
                visited[i] = false;
            }
        }
    }

    public void findPermutation2(int index, int[] arr, List<List<Integer>> result){
        if(index == arr.length){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < arr.length ; i++){
                list.add(arr[i]);
            }
            result.add(list);
            return;
        }

        for(int i = index; i < arr.length ; i++){
            swap(arr, index, i);
            findPermutation2(index + 1, arr, result);
            swap(arr, index, i);
        }
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
