// LeetCode Problem 0867
// Transpose Matrix : https://leetcode.com/problems/transpose-matrix

// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         int[][] ans = new int[matrix[0].length][matrix.length];
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[i].length; j++){
//                 ans[j][i]=matrix[i][j];
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] ans = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}
