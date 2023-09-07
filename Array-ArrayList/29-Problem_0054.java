// LeetCode Problem 0054
// Spiral Matrix : https://leetcode.com/problems/spiral-matrix

class Solution {
    
    ArrayList<Integer> ans = new ArrayList<Integer>();

    public void right(int[][] matrix, int rowLow, int rowHigh, int colLow, int colHigh){
        if(colLow <= colHigh){
            for(int i = colLow; i <= colHigh; i++){
                ans.add(matrix[rowLow][i]);
            }
            down(matrix, ++rowLow, rowHigh, colLow, colHigh);
        }
    }

    public void down(int[][] matrix, int rowLow, int rowHigh, int colLow, int colHigh){
        if(rowLow <= rowHigh){
            for(int i = rowLow; i <= rowHigh; i++){
                ans.add(matrix[i][colHigh]);        
            }
            left(matrix, rowLow, rowHigh, colLow, --colHigh);
        }    
    }

    public void left(int[][] matrix, int rowLow, int rowHigh, int colLow, int colHigh){
        if(colHigh >= colLow){
            for(int i = colHigh; i >= colLow; i--){
                ans.add(matrix[rowHigh][i]);        
            }
            up(matrix, rowLow, --rowHigh, colLow, colHigh);
        }
    }

    public void up(int[][] matrix, int rowLow, int rowHigh, int colLow, int colHigh){
        if(rowHigh >= rowLow){
            for(int i = rowHigh; i >= rowLow; i--){
                ans.add(matrix[i][colLow]);
            }
            right(matrix, rowLow, rowHigh, ++colLow, colHigh);
        }
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        right(matrix, 0, matrix.length-1, 0, matrix[0].length-1); 
        return ans;
    }
}