//Leetcode Problem 0167
//Two Sum II - Input Array Is Sorted : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        int mark = 0;
        for(int i=0; i<numbers.length; i++){
            int result = binarySearch(numbers, target-numbers[i], i+1);
            if(result!=-10001){
                ans[0]=i+1;
                ans[1]=result+1;
            }
        }
        return ans;
    }

    public int binarySearch(int[] numbers, int target, int begin) {
        int mid, start = begin;
        int end = numbers.length-1;
        while(end>=start){
            mid = (start+(end-start)/2);
            if(numbers[mid]==target){
                return mid;
            }
            else if(numbers[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -10001;
    }
}