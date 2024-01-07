//Leetcode Problem 0441
//Arranging Coins : https://leetcode.com/problems/arranging-coins/description/


class Solution {
  public int arrangeCoins(int n) {
      if(n==0){
          return n;
      }
      int num=n; int lim=0; int c=0;
      while(num>lim){
          num-=lim+1;
          lim++;
      }
      return lim;
  }
}