// LeetCode Problem 0832
// Flipping an Image : https://leetcode.com/problems/flipping-an-image

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];
        for(int i=0; i<image.length; i++){
            int k = (image[i].length)-1;
            for(int j=0; j<image[i].length; j++){
                if(image[i][j] ==0)
                    ans[i][k]=1;
                else
                    ans[i][k]=0;
                k--;
            }
        }
        return ans;
    }
}