//Leetcode Problem 1539
//Kth Missing Positive Number : https://leetcode.com/problems/kth-missing-positive-number/description/


class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            //Number of missing numbers at mid
            int diff = arr[mid]-(mid+1);   

            //Number of missing numbers =< k, therefore the min number with diff = k is towards left
            if(k<=diff){   
                end = mid-1;
            }

            //Number of missing numbers is more, therefore move towards right
            else{
                start = mid+1;
            }
        }
        
        return end+k+1;
    }
}
