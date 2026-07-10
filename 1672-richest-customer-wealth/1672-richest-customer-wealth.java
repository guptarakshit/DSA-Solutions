class Solution {
    public int maximumWealth(int[][] accounts) {

        int max = 0;
        int rowSum = 0;

        for(int row = 0; row < accounts.length; row++){
            rowSum = 0;
            for(int col = 0; col < accounts[row].length; col++){
                rowSum += accounts[row][col];
            }
            if(rowSum > max){
                max = rowSum;
            }
        }

        return max;

    }
}