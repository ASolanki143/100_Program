import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Program75 {
    public static void main(String[] args) {
        int[][] arr = {
            {100,200}, // duration, end-day
            {200,1300},
            {1000,1250},
            {2000,3200}
        };

        System.out.println("Maximum courses : "+maxCources(arr)); // Output: 3
    }

    public static int maxCources(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int time = 0;

        for(int[] c : arr){
            int duration = c[0];
            int lastDay = c[1];

            time += duration;
            maxHeap.offer(duration);
            if(time > lastDay){
                time -= maxHeap.poll();
            }
        }

        return maxHeap.size();
    }
}
