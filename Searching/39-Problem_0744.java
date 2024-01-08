//Leetcode Problem 0744
//Find Smallest Letter Greater Than Target : https://leetcode.com/problems/find-smallest-letter-greater-than-target/


class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        if(target>=letters[end])
        {
            return letters[0];
        }

        while(start<=end){
            int mid = (start+end)/2;

            if(target==letters[mid]){
                if(target!=letters[mid+1]){
                    return letters[mid+1];
                }
                else{
                    start=mid+1;
                }
                
            }
            else if(target>letters[mid]){
                start=mid+1;
            }
            else if(target<letters[mid]){
                end=mid-1;
            }
            
        }
        return letters[start];
    }
}

// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {
//         int start=0;
//         int end=letters.length-1;
//         if(target>=letters[end])
//         {
//             return letters[0];
//         }

//         while(start<=end){

//             if(target==letters[(start+end)/2]){
//                 if(target!=letters[(start+end)/2+1]){
//                     return letters[(start+end)/2+1];
//                 }
//                 else{
//                     start=(start+end)/2+1;
//                 }
                
//             }
//             else if(target>letters[(start+end)/2]){
//                 start=(start+end)/2+1;
//             }
//             else if(target<letters[(start+end)/2]){
//                 end=(start+end)/2-1;
//             }
            
//         }
//         return letters[start];
//     }
// }