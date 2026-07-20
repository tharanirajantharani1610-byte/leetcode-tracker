// Last updated: 20/07/2026, 16:19:16
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5        boolean firstColHasZero = false;
6
7        for (int i = 0; i < rows; i++) {
8            if (matrix[i][0] == 0) {
9                firstColHasZero = true;
10            }
11
12            for (int j = 1; j < cols; j++) {
13                if (matrix[i][j] == 0) {
14                    matrix[i][0] = 0; 
15                    matrix[0][j] = 0; 
16                }
17            }
18        }
19
20        
21        for (int i = 1; i < rows; i++) {
22            for (int j = 1; j < cols; j++) {
23                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
24                    matrix[i][j] = 0;
25                }
26            }
27        }
28
29        if (matrix[0][0] == 0) {
30            for (int j = 0; j < cols; j++) {
31                matrix[0][j] = 0;
32            }
33        }
34
35        if (firstColHasZero) {
36            for (int i = 0; i < rows; i++) {
37                matrix[i][0] = 0;
38            }
39        }
40    }
41}