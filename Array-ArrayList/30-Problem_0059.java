// LeetCode Problem 0059
// Spiral Matrix : https://leetcode.com/problems/spiral-matrix-ii

class Solution {
    
    int num=1;
    public void freshman(int[][] matrix, int rowLow, int rowHigh, int colLow, int colHigh){
        if(colLow <= colHigh){
            for(int i = colLow; i <= colHigh; i++){
                matrix[rowLow][i]=num++;
            }
            sophomore(matrix, ++rowLow, rowHigh, colLow, colHigh);
        }
    }

    public void sophomore(int[][] matrix, int rowLow, int rowHigh, int colLow, int colHigh){
        if(rowLow <= rowHigh){
            for(int i = rowLow; i <= rowHigh; i++){
                matrix[i][colHigh]=num++;        
            }
            junior(matrix, rowLow, rowHigh, colLow, --colHigh);
        }    
    }

    public void junior(int[][] matrix, int rowLow, int rowHigh, int colLow, int colHigh){
        if(colHigh >= colLow){
            for(int i = colHigh; i >= colLow; i--){
                matrix[rowHigh][i]=num++;        
            }
            senior(matrix, rowLow, --rowHigh, colLow, colHigh);
        }
    }

    public void senior(int[][] matrix, int rowLow, int rowHigh, int colLow, int colHigh){
        if(rowHigh >= rowLow){
            for(int i = rowHigh; i >= rowLow; i--){
                matrix[i][colLow]=num++;
            }
            freshman(matrix, rowLow, rowHigh, ++colLow, colHigh);
        }
    }
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        freshman(matrix, 0, n-1, 0, n-1);
        return matrix;
    }
}