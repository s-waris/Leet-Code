//Leetcode Problem 0349
//Intersection of Two Arrays : https://leetcode.com/problems/intersection-of-two-arrays/description/

class Solution {

  public int[] intersection(int[] nums1, int[] nums2){

      // sort both the arrays
      Arrays.sort(nums1);
      Arrays.sort(nums2);

      // initialize an array with the size of minimum of both arrays and store the common elements
      int[] intersection = new int[nums1.length>nums2.length? nums1.length : nums2.length];
      int count=-1;
      for(int i=0; i<nums2.length; i++){
          if(binarySearch(nums1, nums2[i])){
              intersection[++count]=nums2[i];
          }
      }

      // if there are no common elements return an empty array
      if(count < 0){ // count has the last index of common elements present in the arrays
          int[] ans = new int[]{};
          return ans;
      }

      // removing the duplicate from the intersection and store in an array called dupli
      int[] dupli = new int[count+1];
      int counter=0; int check=intersection[0];
      dupli[0]=check;
      for(int i=1; i<=count; i++){
          if(intersection[i]!=check){
              dupli[++counter]=intersection[i];
              check=intersection[i];
          }
      }

      // counter has the number of unique elements present after removing duplicates

      // we trim the zeroes from the resulting array of unique numbers
      int[] ans = new int[counter+1];
      for(int i=0; i<=counter; i++){
          ans[i]=dupli[i];
      }
      return ans;
  }

  // simple binary search
  public boolean binarySearch(int arr[], int target){
      int start=0; int end =arr.length-1;
      while(start<=end){
          int mid = start+(end-start)/2;
          if(arr[mid]==target){
              return true;
          }
          else if(arr[mid]>target){
              end = mid-1;
          }
          else{
              start = mid+1;
          }
      }
      return false;
  }
}
