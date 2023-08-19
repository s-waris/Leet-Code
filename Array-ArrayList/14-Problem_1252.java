// LeetCode Problem 1252
// Cells with Odd Values in a Matrix : https://leetcode.com/problems/cells-with-odd-values-in-a-matrix


class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int count=0;
        for(int i=0; i<indices.length; i++){
            for(int j=0; j<n; j++){
                matrix[(indices[i][0])][j]++; // increment in the particular row of all the columns

                if(matrix[(indices[i][0])][j]%2!=0) //odd counter
                    count++;
                else
                    count--;
            }
            for(int j=0; j<m; j++){
                matrix[j][(indices[i][1])]++; // increment in the paricular column of all the rows.

                if(matrix[j][(indices[i][1])]%2!=0) //odd counter
                    count++;
                else
                    count--;
            }
        }

        // counter loop
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if((matrix[i][j]%2)!=0)
        //             count++;
        //     }
        // }
        return count;
    }
}

// class Solution {
//     public int oddCells(int m, int n, int[][] indices) {
//         int[][] matrix = new int[m][n];
//         int count=0;
//         for(int i=0; i<indices.length; i++){
//             for(int j=0; j<n; j++){
//                 int row = indices[i][0];
//                 matrix[row][j]++; // increment in the particular row of all the columns

//                 if(matrix[row][j]%2!=0) //odd counter
//                     count++;
//                 else
//                     count--;
//             }
//             for(int j=0; j<m; j++){
//                 int col = indices[i][1];
//                 matrix[j][col]++; // increment in the paricular column of all the rows.

//                 if(matrix[j][col]%2!=0) //odd counter
//                     count++;
//                 else
//                     count--;
//             }
//         }

//         // counter loop
//         // for(int i=0; i<m; i++){
//         //     for(int j=0; j<n; j++){
//         //         if((matrix[i][j]%2)!=0)
//         //             count++;
//         //     }
//         // }
//         return count;
//     }
// }