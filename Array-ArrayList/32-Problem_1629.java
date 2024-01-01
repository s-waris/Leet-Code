// LeetCode Problem 1629
// Spiral Matrix : https://leetcode.com/problems/slowest-key

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int press=0, maxIndex=0, max=0;
        for(int i = 0; i<releaseTimes.length; i++){
            int duration = releaseTimes[i]-press;
            press = releaseTimes[i];
            if(duration > max){
                max=duration;
                maxIndex=i;
            }
            if(duration == max){
                if(keysPressed.charAt(maxIndex)<keysPressed.charAt(i)){
                    maxIndex=i;
                }
            }
        }
        return(keysPressed.charAt(maxIndex));
    }
}