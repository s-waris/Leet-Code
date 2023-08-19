// LeetCode Problem 1773
// Count Items Matching a Rule : https://leetcode.com/problems/count-items-matching-a-rule

class Solution {
public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int key= 0;
        for(int i=0; i<items.size(); i++){
            if(ruleKey.equals("type")){
                if(ruleValue.equals((items.get(i)).get(0))){
                    key++;
                }   
            }
            else if(ruleKey.equals("color")){
                if(ruleValue.equals((items.get(i)).get(1))){
                    key++;
                }
            }
            else {
                if(ruleValue.equals((items.get(i)).get(2))){
                    key++;
                }
            }
        }
        return key;
    }
}