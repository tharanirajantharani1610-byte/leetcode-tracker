// Last updated: 11/07/2026, 15:56:58
1class Solution {
2    public String convert(String s, int numRows) {
3
4        if (numRows == 1 || numRows >= s.length()) {
5            return s;
6        }
7
8        StringBuilder[] rows = new StringBuilder[numRows];
9
10        for (int i = 0; i < numRows; i++) {
11            rows[i] = new StringBuilder();
12        }
13
14        int currentRow = 0;
15        boolean goingDown = false;
16
17        for (char c : s.toCharArray()) {
18            rows[currentRow].append(c);
19
20            if (currentRow == 0 || currentRow == numRows - 1) {
21                goingDown = !goingDown;
22            }
23
24            currentRow += goingDown ? 1 : -1;
25        }
26
27        StringBuilder result = new StringBuilder();
28
29        for (StringBuilder row : rows) {
30            result.append(row);
31        }
32
33        return result.toString();
34    }
35}