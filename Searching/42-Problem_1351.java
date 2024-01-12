//Leetcode Problem 1351
//Count Negative Numbers in a Sorted Matrix : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/



class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            count+=negatives(grid[i]);
        }
        return count;
    }

    public int negatives(int[] row){
        int start = 0;
        int end = row.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(row[mid]>-1){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return row.length-start;
    }
}