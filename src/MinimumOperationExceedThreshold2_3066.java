import java.util.PriorityQueue;

public class MinimumOperationExceedThreshold2_3066 {
    public int minOperations(int[] nums,int k){
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.offer((long)num);
        }

        int operations = 0;
        while (pq.peek() < k){
            long x = pq.poll();
            long y = pq.poll();
            pq.offer(x * 2 + y);
            operations++;
        }

        return operations;
    }

    public int operation(int num1, int num2){
        return Math.min(num1, num2) * 2 + Math.max(num1, num2);
    }
}
