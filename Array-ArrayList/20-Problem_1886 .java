// LeetCode Problem 1886
// Determine Whether Matrix Can Be Obtained By Rotation : https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation

class Solution {

    public int[][] rotation(int[][] mat){
        if(mat.length>1){
            int[][] ans = new int[mat.length][mat.length];
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat.length; j++){
                    ans[i][j]=mat[mat.length-1-j][i];
                }
            }

            // for(int i=0; i<mat.length; i++){
            //     int col=0;
            //     for(int j=mat.length-1; j>-1; j--){
            //         mat[i][col]=ans[i][j];
            //         col++;
            //     }
            // }
            return ans;
        }
        else
            return mat;
    }

    public boolean equalArrays(int[][] mat, int[][] target){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(mat[i][j]!=target[i][j])
                    return false;
            }
        }
        return true;
    }

    // public void printArray(int[][] mat){
    //     for(int i=0; i<mat.length; i++){
    //         for(int j=0; j<mat.length; j++){
    //             System.out.print(mat[i][j]);
    //         }
    //         System.out.println("");
    //     }
    // }
    
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean key=false;
        key=equalArrays(target, mat);
        System.out.println("Initial key :"+key);
        for(int i=0; i<4; i++){
            System.out.println("Iteration number "+(i+1));
            // printArray(mat);
            if(key==true){
                System.out.println("Iteration no. for true :"+i);
                return true;
            }
            key=equalArrays(target, rotation(mat));
            mat=rotation(mat);
        }
        return false;
    }
}