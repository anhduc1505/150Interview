public class JumpGame {

    public boolean canJump1(int[] nums) {
        int n = nums.length;
        int jump = nums[0]; // Khởi tạo bước nhảy ban đầu

        for (int i = 0; i < n; i++) {
            // Nếu vị trí hiện tại vượt quá bước nhảy khả dĩ, không thể tiếp tục
            if (i > jump) {
                return false;
            }

            // Duyệt qua các bước nhảy khả dĩ từ vị trí hiện tại
            for (int j = i + 1; j <= jump && j < n; j++) {
                jump = Math.max(jump, j + nums[j]); // Cập nhật khoảng cách nhảy xa nhất
                // Nếu đã có thể nhảy tới cuối mảng
                if (jump >= n - 1) {
                    return true;
                }
            }
        }

        return jump >= n - 1; // Kiểm tra xem bước nhảy có tới được cuối mảng không
    }

    public boolean canJump2(int[] nums) {
        int lastGoodIndex = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--){
            if(i + nums[i] >= lastGoodIndex){
                lastGoodIndex = i;
            }
        }

        return lastGoodIndex == 0;
    }
}
