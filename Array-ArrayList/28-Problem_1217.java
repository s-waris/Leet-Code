// LeetCode Problem 1217
// Minimum Cost to Move Chips to The Same Position : https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position

class Solution {
    public int minCostToMoveChips(int[] position) {
        int[] arr=new int[2];
        for(int i=0; i<position.length; i++){
            if(position[i]%2==0){
                arr[1]++;
            }
            else{
                arr[0]++;
            }
        }
        return Math.min(arr[0], arr[1]);
    }
}