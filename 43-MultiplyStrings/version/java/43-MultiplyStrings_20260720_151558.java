// Last updated: 20/07/2026, 15:15:58
1class Solution {
2    public String multiply(String num1, String num2) {
3        int m = num1.length();
4        int n = num2.length();
5        
6        int[] pos = new int[m + n];
7
8        for (int i = m - 1; i >= 0; i--) {
9            for (int j = n - 1; j >= 0; j--) {
10                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
11                int p1 = i + j;       
12                int p2 = i + j + 1;   
13                
14                int sum = mul + pos[p2];
15
16                pos[p1] += sum / 10;
17                pos[p2] = sum % 10;
18            }
19        }
20
21        StringBuilder sb = new StringBuilder();
22        for (int p : pos) {
23            if (!(sb.length() == 0 && p == 0)) {
24                sb.append(p);
25            }
26        }
27
28        return sb.length() == 0 ? "0" : sb.toString();
29    }
30}