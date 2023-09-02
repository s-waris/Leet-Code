// LeetCode Problem 1380
// Lucky Numbers in a Matrix : https://leetcode.com/problems/lucky-numbers-in-a-matrix

class Solution {

    public int maxInRow(int[][] matrix, int row){
        int ans=0;
        for(int i=0; i<matrix[row].length; i++){
            if(matrix[row][ans]>matrix[row][i])
                ans=i;
        }
        return ans;
    }

    public boolean maxInCol(int[][] matrix, int row, int col){
        int key=matrix[row][col];
        for(int i=0; i<matrix.length; i++){
            if(key<matrix[i][col])
                return false;
        }
        return true;
    }

    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<matrix.length; i++){
            int col=maxInRow(matrix, i);
            if(maxInCol(matrix, i, col))
                ans.add(matrix[i][col]);
        }
        return ans;
    }
}