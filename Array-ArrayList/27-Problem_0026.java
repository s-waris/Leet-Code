// LeetCode Problem 0026
//Remove Duplicates from Sorted Array : https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Solution {
    public int removeDuplicates(int[] nums) {
        int prev=nums[0]; int duplicate=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==prev){
                duplicate++;
            }
            else{
                prev=nums[i];
                nums[i-duplicate]=nums[i];
            }
        }
        return (nums.length-duplicate);
    }
}