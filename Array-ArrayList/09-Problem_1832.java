// Check if the Sentence Is Pangram : https://leetcode.com/problems/check-if-the-sentence-is-pangram

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean flag = true;
        int[] arr = new int[26];
        for(int i=0; i<sentence.length(); i++){
            arr[sentence.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(arr[i]==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}