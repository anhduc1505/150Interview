import java.util.HashMap;

public class majorityNum {
    public int majorityElement1(int[] nums){
        // Step 1: Find the candidate for majority element
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }

        // Step 2: Verify the candidate (optional as per problem's guarantee)
        // Not needed since the problem guarantees the majority element always exists.
        return candidate;
    }
    public int majorityElement2(int[] nums){
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int major = 0;
        for (int i : nums){
            hash.put(i, hash.getOrDefault(i, 0) + 1);
            if(hash.get(i) > major){
                res = i;
                major = hash.get(i);
            }
        }
        return res;
    }
}
