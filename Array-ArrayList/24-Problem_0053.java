// LeetCode Problem 0053
// Maximum Subarray : https://leetcode.com/problems/maximum-subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0]; int oldMax=ans;
        int max=ans, min=ans, minIn=0, maxIn=0, start=0;
        int end=nums.length-1;
        while(true){
            int sum=0;
            for(int i=start; i<=end; i++){
                if(sum<0)
                    sum=0;
                sum=sum+nums[i];
                if(sum>=max){
                    max=sum;
                    maxIn=i;
                }
                if(sum<=min){
                    min=sum;
                    minIn=i;
                
                }
            }
            if(minIn>maxIn)
                end=maxIn;
            else if(min<maxIn){
                start=minIn+1;
                end=maxIn;
            }
            else if(minIn==maxIn){
                ans=max;
                break;
            }
            if(oldMax>=max){
                ans=max;
                break;
            }
            else
                oldMax=max;
        }
        return ans;
    }
}