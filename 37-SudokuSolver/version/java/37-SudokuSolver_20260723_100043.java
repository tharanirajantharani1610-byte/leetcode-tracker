// Last updated: 23/07/2026, 10:00:43
1class Solution {
2    public void solveSudoku(char[][] board) {
3        solve(board);
4    }
5
6    private boolean solve(char[][] board) {
7        for (int row = 0; row < 9; row++) {
8            for (int col = 0; col < 9; col++) {
9                if (board[row][col] == '.') {
10                    for (char num = '1'; num <= '9'; num++) {
11                        if (isValid(board, row, col, num)) {
12                            board[row][col] = num; 
13
14                            if (solve(board)) {
15                                return true;
16                            }
17
18                            board[row][col] = '.'; 
19                        }
20                    }
21                    return false; 
22                }
23            }
24        }
25        return true; 
26    }
27
28    private boolean isValid(char[][] board, int row, int col, char num) {
29        for (int i = 0; i < 9; i++) {
30            if (board[row][i] == num) return false;
31
32            if (board[i][col] == num) return false;
33
34            int subRow = 3 * (row / 3) + i / 3;
35            int subCol = 3 * (col / 3) + i % 3;
36            if (board[subRow][subCol] == num) return false;
37        }
38        return true;
39    }
40}