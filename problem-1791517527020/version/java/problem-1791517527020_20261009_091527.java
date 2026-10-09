// Last updated: 09/10/2026, 09:15:27
1class Solution {
2    public int minCut(String s) {
3        int n = s.length();
4        if (n <= 1) return 0;
5
6        boolean[][] isPalindrome = new boolean[n][n];
7        int[] cuts = new int[n];
8
9        for (int i = 0; i < n; i++) {
10            int minCuts = i; 
11
12            for (int j = 0; j <= i; j++) {
13                if (s.charAt(j) == s.charAt(i) && (i - j <= 2 || isPalindrome[j + 1][i - 1])) {
14                    isPalindrome[j][i] = true;
15
16                  
17                    if (j == 0) {
18                        minCuts = 0;
19                    } else {
20                        minCuts = Math.min(minCuts, cuts[j - 1] + 1);
21                    }
22                }
23            }
24            cuts[i] = minCuts;
25        }
26
27        return cuts[n - 1];
28    }
29}