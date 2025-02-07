import java.util.HashMap;
import java.util.Map;
//ý tưởng sẽ là có 2 map màu và map bóng lưu trữ
//sau đó chạy tưừng query 1
//lấy giá trị bóng nếu đã có màu r thì trừ đi 1
//neeus = 0 thif remove
//sau đó nhét vào ballMap và colorMap
public class NumOfDistinctColorsBalls_3160 {
    public int[] queryResults(int limit, int[][] queries){
        int n = queries.length;
        int[] res = new int[n];
        Map<Integer, Integer> colorMap = new HashMap<>();
        Map<Integer, Integer> ballMap = new HashMap<>();

        for (int i = 0; i < n; i++){
            int ball = queries[i][0];
            int colour = queries[i][1];

            if(ballMap.containsKey(ball)){
                int preColour = ballMap.get(ball);
                colorMap.put(preColour, colorMap.get(preColour) - 1);

                if (colorMap.get(preColour) == 0){
                    colorMap.remove(preColour);
                }
            }

            ballMap.put(ball, colour);

            colorMap.put(colour, colorMap.getOrDefault(colour, 0) + 1);

            res[i] = colorMap.size();
        }

        return res;
    }
}
