// LeetCode Problem 0566
// Reshape the Matrix : https://leetcode.com/problems/reshape-the-matrix/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        if((mat.length * mat[0].length) == (r*c)){
            int row=0;
            int col=0;
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat[0].length; j++){
                    if(col==c){
                        col=0;
                        row++;
                    }
                    ans[row][col++]=mat[i][j];
                }
            }
            return ans;
        }
        return mat;
    }
}