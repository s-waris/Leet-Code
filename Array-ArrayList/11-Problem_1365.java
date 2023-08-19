// LeetCode Problem 1365
// How Many Numbers Are Smaller Than the Current Number : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]>nums[j])
                    count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}