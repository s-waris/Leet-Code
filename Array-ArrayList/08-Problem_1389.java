// LeetCode Problem 1389
// Create Target Array in the Given Order : https://leetcode.com/problems/create-target-array-in-the-given-order

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>arr=new ArrayList<Integer>(nums.length);
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
        
            arr.add(index[i],nums[i]);
        }
        for(int i=0;i<arr.size();i++){
            target[i]=arr.get(i);
        }
        return target;
    }
}