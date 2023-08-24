// LeetCode Problem 1854
// Maximum Population Year : https://leetcode.com/problems/maximum-population-year


class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] calendar=new int[101];
        for(int i=0; i<logs.length; i++){
            int birth = logs[i][0];
            int death = logs[i][1];
            calendar[birth-1950]++;
            calendar[death-1950]--;
        }
        int max=calendar[0]; 
        int year=1950;
        for(int i=1; i<101; i++){
            calendar[i]+=calendar[i-1];
            if(max<calendar[i]){
                max=calendar[i];
                year=i+1950; 
            }
        }
        return year;
    }
}