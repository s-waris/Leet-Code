// LeetCode Problem 1480
// Running Sum of 1d Array : https://leetcode.com/problems/running-sum-of-1d-array

class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i]+sum;
            sum+=nums[i];
        }
        return ans;
    }
}