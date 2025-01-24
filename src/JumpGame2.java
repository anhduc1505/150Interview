public class JumpGame2 {
    public int jump(int[] nums) {
        int n = nums.length;
        if( n <= 1) return 0;

        int jumps = 0;
        int curEnd = 0;
        int max = 0;

        for(int i = 0; i < n - 1; i++){
            max = Math.max(max, i + nums[i]);
            if(i == curEnd){
                jumps++;
                curEnd = max;

                if(curEnd >= n - 1){
                    break;
                }
            }
        }

        return jumps;
    }
}
