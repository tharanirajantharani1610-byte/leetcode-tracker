// Last updated: 23/07/2026, 10:01:48
1class Solution {
2    public String countAndSay(int n) {
3        if (n <= 0) return "";
4        
5        String result = "1";
6        
7        for (int i = 1; i < n; i++) {
8            StringBuilder current = new StringBuilder();
9            int count = 1;
10            
11            for (int j = 0; j < result.length(); j++) {
12                
13                if (j + 1 == result.length() || result.charAt(j) != result.charAt(j + 1)) {
14                    current.append(count).append(result.charAt(j));
15                    count = 1; 
16                } else {
17                    count++;
18                }
19            }
20            
21            result = current.toString();
22        }
23        
24        return result;
25    }
26}