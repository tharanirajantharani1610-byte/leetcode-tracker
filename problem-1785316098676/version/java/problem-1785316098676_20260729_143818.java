// Last updated: 29/07/2026, 14:38:18
1class Solution {
2    public int numTrees(int n) {
3    
4        int[] G = new int[n + 1];
5        
6        G[0] = 1; 
7        G[1] = 1;
8        
9        for (int i = 2; i <= n; i++) {
10            for (int j = 1; j <= i; j++) {
11                G[i] += G[j - 1] * G[i - j];
12            }
13        }
14        
15        return G[n];
16    }
17}