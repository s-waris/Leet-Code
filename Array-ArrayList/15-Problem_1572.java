// LeetCode Problem 1572
// Matrix Diagonal Sum : https://leetcode.com/problems/matrix-diagonal-sum

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        if(mat.length%2==0){
            int k=mat.length-1;
            for(int i=0; i<mat.length; i++){
                sum+=(mat[i][i]+mat[i][k]);
                k--;
            }
        }
        else{
            int k=mat.length-1;
            for(int i=0; i<mat.length; i++){
                sum+=(mat[i][i]+mat[i][k]);
                k--;
            }
            sum-=mat[(mat.length)/2][(mat.length)/2];
        }
        return sum;
    }
}