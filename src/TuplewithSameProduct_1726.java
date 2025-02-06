import java.util.HashMap;
import java.util.Map;

public class TuplewithSameProduct_1726 {
    public int tupleSameProduct(int[] nums){
        Map<Integer, Integer> productCnt = new HashMap<>();
        int n = nums.length;
        int cnt = 0;

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int product = nums[i] * nums[j];
                productCnt.put(product, productCnt.getOrDefault(product,0) + 1);
            }
        }

        for(int val : productCnt.values()){
            if(val > 1){
                cnt += 8 * ((val * (val - 1)) / 2);
            }
        }
        return cnt;
    }
}
