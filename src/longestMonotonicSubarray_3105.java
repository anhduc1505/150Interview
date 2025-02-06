public class longestMonotonicSubarray_3105 {
    public int longestMonotonicSubarray(int[] nums) {
        int inLen = 1, deLen = 1;
        int maxLen = 1;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] < nums[i]){
                deLen++;
                inLen = 1;
            }
            else if(nums[i + 1] > nums[i]){
                inLen++;
                deLen = 1;
            }
            else{
                deLen = 1;
                inLen = 1;
            }
            maxLen = Math.max(maxLen, Math.max(deLen, inLen));
        }
        return maxLen;
    }

}
