// LeetCode Problem 0066
// Plus One : https://leetcode.com/problems/plus-one

class Solution {
    
    public int[] cloneArray(int[] digits){
        int[] ans = new int[digits.length+1];
        int c=1;
        ans[0]=1;
        ans[1]=0;
        for(int i=2; i<ans.length; i++){
            ans[i]=digits[c];
            c++;
        }
        return ans;
    }

    public int[] addOne(int[] digits, int index){
        if(digits[index]<9){
            digits[index]++;
        }
        else if(index==0){
            return cloneArray(digits);
        }
        else{
            digits[index]=0;
            return addOne(digits, index-1);
        }
        return digits;
    }

    public int[] plusOne(int[] digits) {
        return addOne(digits, digits.length-1);
    }
}