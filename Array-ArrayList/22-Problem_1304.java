// LeetCode Problem 1304
// Find N Unique Integers Sum up to Zero : https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero

class Solution {
    public int[] sumZero(int n) {
    int[] ans = new int[n];   
        if(n%2==1){
            ans[0]=0;
            int num=1;
            for(int i=1; i<n-1; i++){
                ans[i++]=num;
                ans[i]=0-num;
                num++;
            }
        }
        else{
            int num=1;
            for(int i=0; i<n-1; i++){
                ans[i++]=num;
                ans[i]=0-num;
                num++;
            }
        }
        return ans;
    }
}