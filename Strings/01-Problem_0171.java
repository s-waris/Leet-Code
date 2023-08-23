// LeetCode Problem 0171
// Excel Sheet Column Number : https://leetcode.com/problems/excel-sheet-column-number

class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        for(int i=0; i<columnTitle.length(); i++){
            ans*=26;
            ans+=(columnTitle.charAt(i)-'A'+1);
        }
        return ans;
    }
}