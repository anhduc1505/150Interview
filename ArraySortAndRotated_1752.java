public class ArraySortAndRotated_1752 {
    public boolean check1(int[] nums) {
        int n = nums.length;

        int[] ArrSort = nums.clone();
        Arrays.sort(ArrSort);

        for(int rotationOffset = 0; rotationOffset < n; rotationOffset++){
            boolean isMatch = true;
            for(int i = 0; i < n; i++){
                if(nums[i] != ArrSort[(i + rotationOffset) % n]){
                    isMatch = false;
                    break;
                }
            }
            if(isMatch){
                return true;
            }
        }
        return false;
    }

    public boolean check2(int[] nums) {
        int n = nums.length;

        int[] ArrSort = nums.clone();
        Arrays.sort(ArrSort);

        for(int rotationOffset = 0; rotationOffset < n; rotationOffset++){
            boolean isMatch = true;
            for(int i = 0; i < n; i++){
                if(nums[i] != ArrSort[(i + rotationOffset) % n]){
                    isMatch = false;
                    break;
                }
            }
            if(isMatch){
                return true;
            }
        }
        return false;
    }
}
