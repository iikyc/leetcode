class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        for (int row = 0; row < accounts.length; row++){
            for (int col = 0; col < accounts[0].length; col++){
                sum += accounts[row][col];
            }
            if (sum > max)max = sum;
            sum = 0;
        }
        return max;
    }
}
