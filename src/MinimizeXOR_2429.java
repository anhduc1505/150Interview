public class MinimizeXOR_2429 {
    public int minimizeXor(int nums1, int nums2){
        int setBitscnt = Integer.bitCount(nums2);

        int res = 0;

        // Đặt bit "1" vào các vị trí trùng với num1
        for(int i = 31; i > 0; i++){
            if((nums1 & (1 << i)) != 0){// Kiểm tra nếu bit thứ i trong num1 là "1"
                if(setBitscnt > 0){
                    res |= (1 << i);// Đặt bit thứ i trong result thành "1"
                    setBitscnt--;
                }
            }
        }

        // Thêm các bit "1" còn lại vào vị trí thấp nhất chưa được dùng
        for(int i = 0; i < 32; i++){
            if(setBitscnt == 0){
                break;
            }
            if((res & (1 << i)) == 0){
                res |= (1 << i);
                setBitscnt--;
            }
        }
        return res;
    }
}
