import java.util.HashMap;

public class MaxSumPairDigit_2342 {
    public int maximumSum(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = - 1;
        for (int num : nums){
            int sum = getSumDigit(num);
            if(map.containsKey(sum)){
                maxSum = Math.max(maxSum, map.get(sum) + num);
                map.put(sum, Math.max(map.get(sum), num));
            }
            else{
                map.put(sum, num);
            }
        }
        return maxSum;
    }

    public int getSumDigit(int num){
        int sum = 0;
        while(num>0){
            sum+= num %10;
            num/= 10;
        }
        return sum;
    }
}
