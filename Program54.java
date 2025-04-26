public class Program54 {
    public static void main(String[] args) {
        int[] machines = {1, 0, 5};
        int result = findMinMoves(machines);
        System.out.println(result); // Output: 3
    }

    public static int findMinMoves(int[] machines){
        int total = 0;
        for(int m : machines) total += m;
        int n = machines.length;
        if(total % n != 0) return -1; // If total is not divisible by n, return -1

        int target = total / n;
        int moves = 0, currBalance = 0;

        for(int i = 0; i < n; i++){
            int diff = machines[i] - target;
            currBalance += diff;
            moves = Math.max(moves, Math.abs(currBalance)); // Update moves with the absolute value of current balance
            moves = Math.max(moves, diff); // Update moves with the difference
        }
        return moves;
    }
}
