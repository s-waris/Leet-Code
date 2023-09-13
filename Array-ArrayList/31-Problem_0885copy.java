// LeetCode Problem 0885
// Spiral Matrix : https://leetcode.com/problems/spiral-matrix-iii

class Solution {

  int n=0;
  int key=0;

  public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
    int[][] ans = new int[rows*cols][2];
      right(rows, cols, rStart, cStart, rStart, cStart+1, ans);
      return ans;
    }

    public void right(int rows, int cols, int rStart, int cStart, int rEnd, int cEnd, int[][] ans){
      if(key<4){
        if(rStart>-1){
          key=0;
          if(cStart>-1 && cEnd<cols){
            for(int i=cStart; i<cEnd; i++){
              ans[n][0]=rStart;
              ans[n++][1]=i;
            }
          }
          else if (cStart<0){
            if(cEnd<cols){
              for(int i=0; i<cEnd; i++){
                ans[n][0]=rStart;
                ans[n++][1]=i;
              }
            }
            else{
              for(int i=0; i<cols; i++){
                ans[n][0]=rStart;
                ans[n++][1]=i;
            }
          }
          }
          else if(cEnd>=cols){
            if(cStart<0){
              for(int i=0; i<cols; i++){
                ans[n][0]=rStart;
                ans[n++][1]=i;
              }
            }
            else{
              for(int i=cStart; i<cols; i++){
                ans[n][0]=rStart;
                ans[n++][1]=i;
            }
          }
          }
          down(rows, cols, rStart, cStart, ++rEnd, cEnd, ans);
        }
        else{
          key++;
          down(rows, cols, rStart, cStart, ++rEnd, cEnd, ans);
        }
      }
    }

    public void down(int rows, int cols, int rStart, int cStart, int rEnd, int cEnd, int[][] ans){
      if(key<4){
        if(cEnd<cols){
          key=0;
          if(rStart>-1 && rEnd<rows){
            for(int i=rStart; i<rEnd; i++){
              ans[n][0]=i;
              ans[n++][1]=cEnd;
            }
          }
          else if(rStart<0){
            if(rEnd>rows){
              for(int i=0; i<rows; i++){
              ans[n][0]=i;
              ans[n++][1]=cEnd;
            }
            }
            else{
              for(int i=0; i<rEnd; i++){
              ans[n][0]=i;
              ans[n++][1]=cEnd;
            }
          }
          }
        
          else if(rEnd>=rows){
            if(rStart<0){
              for(int i=0; i<rows; i++){
              ans[n][0]=i;
              ans[n++][1]=cEnd;
            }
            }
            else{
              for(int i=rStart; i<rows; i++){
              ans[n][0]=i;
              ans[n++][1]=cEnd;
            }
          }
        }
          left(rows, cols, rStart, --cStart, rEnd, cEnd, ans);
        }
        else{
          key++;
          left(rows, cols, rStart, --cStart, rEnd, cEnd, ans);
        }
      }
    }

    public void left(int rows, int cols, int rStart, int cStart, int rEnd, int cEnd, int[][] ans){
      if(key<4){
        if(rEnd<rows){
          key=0;
          if(cStart>-1 && cEnd<cols){
            for(int i=cEnd; i>cStart; i--){
              ans[n][0]=rEnd;
              ans[n++][1]=i;
            }
          }
          else if(cStart<0){
            if(cEnd>=cols){
              for(int i=cols-1; i>=0; i--){
              ans[n][0]=rEnd;
              ans[n++][1]=i;
            }
            }
            else{
              for(int i=cEnd; i>=0; i--){
              ans[n][0]=rEnd;
              ans[n++][1]=i;
            }
          }
          }
          else if(cEnd>=cols){
            if(cStart<0){
              for(int i=cols-1; i>=0; i--){
              ans[n][0]=rEnd;
              ans[n++][1]=i;
            }
        }
            else{
              for(int i=cols-1; i>cStart; i--){
              ans[n][0]=rEnd;
              ans[n++][1]=i;
            }
          }
        }
          up(rows, cols, --rStart, cStart, rEnd, cEnd, ans);
        }
        else{
          key++;
          up(rows, cols, --rStart, cStart, rEnd, cEnd, ans);
        }
      }
    }

    public void up(int rows, int cols, int rStart, int cStart, int rEnd, int cEnd, int[][] ans){
      if(key<4){
        if(cStart>-1){
          key=0;
          if(rStart>-1 && rEnd<rows){
            for(int i=rEnd; i>rStart; i--){
              ans[n][0]=i;
              ans[n++][1]=cStart;
            }}
          else if(rStart<0){
            if(rEnd>=rows){
                for(int i=rows-1; i>=0; i--){
                    ans[n][0]=i;
                    ans[n++][1]=cStart;
                }
            }
            else{
                for(int i=rEnd; i>=0; i--){
                    ans[n][0]=i;
                    ans[n++][1]=cStart;
                }
            }
          }
          else if(rEnd>=rows){
            if(rStart<0){
                for(int i=rows-1; i>=0; i--){
                    ans[n][0]=i;
                    ans[n++][1]=cStart;
                }
            }
            else{
                for(int i=rows-1; i>rStart; i--){
                    ans[n][0]=i;
                    ans[n++][1]=cStart;
                }
            }
          }
          }
          
          right(rows, cols, rStart, cStart, rEnd, ++cEnd, ans);
        }
      else{
        key++;
        right(rows, cols, rStart, cStart, rEnd, ++cEnd, ans);
      }
    }
}