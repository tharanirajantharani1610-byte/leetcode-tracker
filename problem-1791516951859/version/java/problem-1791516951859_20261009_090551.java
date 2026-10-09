// Last updated: 09/10/2026, 09:05:51
1class Solution {
2    public void solve(char[][] board) {
3        if (board == null || board.length == 0 || board[0].length == 0) {
4            return;
5        }
6
7        int rows = board.length;
8        int cols = board[0].length;
9
10        for (int r = 0; r < rows; r++) {
11            if (board[r][0] == 'O') dfs(board, r, 0);
12            if (board[r][cols - 1] == 'O') dfs(board, r, cols - 1);
13        }
14
15        for (int c = 0; c < cols; c++) {
16            if (board[0][c] == 'O') dfs(board, 0, c);
17            if (board[rows - 1][c] == 'O') dfs(board, rows - 1, c);
18        }
19
20      
21        for (int r = 0; r < rows; r++) {
22            for (int c = 0; c < cols; c++) {
23                if (board[r][c] == 'O') {
24                    board[r][c] = 'X';
25                } else if (board[r][c] == 'T') {
26                    board[r][c] = 'O';
27                }
28            }
29        }
30    }
31
32    private void dfs(char[][] board, int r, int c) {
33        int rows = board.length;
34        int cols = board[0].length;
35
36        if (r < 0 || r >= rows || c < 0 || c >= cols || board[r][c] != 'O') {
37            return;
38        }
39
40        board[r][c] = 'T';
41
42        dfs(board, r + 1, c);
43        dfs(board, r - 1, c);
44        dfs(board, r, c + 1);
45        dfs(board, r, c - 1);
46    }
47}