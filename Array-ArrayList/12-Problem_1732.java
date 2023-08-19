// LeetCode Problem 1732
// Find the Highest Altitude : https://leetcode.com/problems/find-the-highest-altitude

class Solution {
    public int largestAltitude(int[] gain) {
        int max=0; int currentAltitude=0;
        for(int i=0; i<gain.length; i++){
            currentAltitude = currentAltitude + gain[i];
            if(max<currentAltitude)
                max = currentAltitude;
        }
        return max;
    }
}