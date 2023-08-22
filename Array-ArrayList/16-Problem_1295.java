// LeetCode Problem 1295
// Find Numbers with Even Number of Digits : https://leetcode.com/problems/find-numbers-with-even-number-of-digits


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