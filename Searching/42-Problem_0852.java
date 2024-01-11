//Leetcode Problem 0852
//Peak index in a mountain array : https://leetcode.com/problems/peak-index-in-a-mountain-array/description/



class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;

        //Binary search to find the index until which the elements are in increasing order
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}




// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int start=0;
//         int end=arr.length-1;

//         //Handle the edge cases, when the desired index is 2nd or 2nd last
//         if(arr[1]>arr[2]){
//             return 1;
//         }
//         if(arr[arr.length-2]>arr[arr.length-3]){
//             return arr.length-2;
//         }

//         //Binary search to find the index until which the elements are in increasing order
//         while(start<=end){
//             int mid = start+(end-start)/2;
//             if(arr[mid]>=arr[mid-1]){
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
//         }
//         return end;
//     }
// }