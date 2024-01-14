//Leetcode Problem 0034
//Find First and Last Position of Element in Sorted Array : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


class Solution {
  public int[] searchRange(int[] nums, int target) {
      int[] ans = new int[]{-1,-1};
      if(nums.length==0){
          return ans;
      }
      else{
          ans[0] = startIndexSearch(nums, target);
          if(ans[0] == -1){
              return ans;
          }
          ans[1] = endIndexSearch(nums, target);
      }
      return ans;
  }

  public int startIndexSearch(int[] nums, int target){
      int start=0; int end = nums.length-1; int mid = 0;
      while(start<=end){
          mid = start+(end-start)/2;
          if(nums[mid]>=target){
              end = mid-1;
          }
          else{
              start = mid+1;
          }
      }
      if(start >= nums.length){
          return -1; // Number is out of array's range
      }
      if(nums[start]==target){
          return start;  // Number's first index found
      }
      return -1; // Number not found
  }

  public int endIndexSearch(int[] nums, int target){
      int start=0; int end = nums.length-1; int mid = 0;
      while(start<=end){
          mid = start+(end-start)/2;
          if(nums[mid]<=target){
              start = mid+1;
          }
          else{
              end = mid-1;
          }
      }
      if(end < 0){
          return -1; // Number is out of array's range
      }
      if(nums[end] == target){
          return end; // Number's last index found
      }
      return -1; // Number not found
  }
}