// Last updated: 20/07/2026, 15:14:22
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        boolean[][] rows = new boolean[9][9];
4        boolean[][] cols = new boolean[9][9];
5        boolean[][] boxes = new boolean[9][9];
6
7        for (int r = 0; r < 9; r++) {
8            for (int c = 0; c < 9; c++) {
9                char val = board[r][c];
10
11                if (val == '.') {
12                    continue;
13                }
14
15                int num = val - '1'; 
16                int boxIndex = (r / 3) * 3 + (c / 3);
17
18                if (rows[r][num] || cols[c][num] || boxes[boxIndex][num]) {
19                    return false;
20                }
21
22                rows[r][num] = true;
23                cols[c][num] = true;
24                boxes[boxIndex][num] = true;
25            }
26        }
27
28        return true;
29    }
30}