// LeetCode Problem 0989
// Transpose Matrix : https://leetcode.com/problems/add-to-array-form-of-integer

class Solution {

    public List<Integer> addToArrayForm(int[] num, int k) {
    ArrayList<Integer> ans=new ArrayList<Integer>(num.length);
    int i=num.length-1;
    int c=num.length;
    int key=0;
    while(c>0||k>0){
        int n=0;
        if(i>=0){
        n=num[i];
        }
        else{
            n=0;
        }
        n=n+k%10;
        if(n<10){
            ans.add(0,n);
            k/=10;
        }
        else{
            ans.add(0,n%10);
            n/=10;
            k/=10;
            k+=n%10;
            }
            c--;
            i--;
    }
    return ans;
    }
}

