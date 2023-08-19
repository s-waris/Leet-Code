// LeetCode Problem 1431
// Kids with the Greatest number of Candies : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> result = new ArrayList <>(candies.length);
        int[] upcandies = new int[candies.length];
        int max=0;
        for(int i=0; i<upcandies.length; i++){
            upcandies[i] = candies[i]+extraCandies;
            if(max<candies[i])
                max=candies[i];
        }
        for(int i=0; i<upcandies.length; i++){
            if(upcandies[i]>=max)               
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}








// BRUTE FORCE APPROACH 

/*class Solution {
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
}*/