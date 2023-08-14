// LeetCode Problem 1431
// Running Sum of 1d Array : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> result = new ArrayList <>(candies.length);
        int max=0;
        for(int i=0; i<candies.length; i++){
            int candy = candies[i]+ extraCandies;
            boolean flag = false;
            for (int j=0; j<candies.length; j++){
                if(candies[j]<=candy)
                    flag=true;
                else{
                    flag=false;
                    break;
                }
            }
            result.add(flag);
        }
        return result;
    }
}