# Last updated: 15/08/2026, 20:41:14
1class Solution:
2    def minOperations(self, s: str) -> int:
3        n = len(s)
4        ans = float('inf')
5        for r in range(n):
6            cost = r
7            for i in range(n // 2):
8                d = abs(ord(s[i]) - ord(s[n - 1 - i]))
9                cost += min(d, 26 - d)
10            ans = min(ans, cost)
11            s = s[1:] + s[0]
12        return ans