public class GridGame_2017 {
    public long gridGame(int[][] grid) {
        long firstRow = 0;
        for (int num : grid[0]){
            firstRow += num;
        }

        long secondRow = 0;
        long minSum = Long.MAX_VALUE;

        for (int i = 0; i < grid[0].length; i++){
            firstRow -= grid[0][i];
            minSum = Math.min(minSum, Math.max(firstRow, secondRow));

            secondRow += grid[1][i];
        }

        return minSum;
    }
}
