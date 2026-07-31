// Last updated: 31/07/2026, 13:43:03
1import java.util.ArrayList;
2import java.util.HashSet;
3import java.util.List;
4import java.util.Set;
5
6class Solution {
7    public List<String> findRepeatedDnaSequences(String s) {
8        Set<String> seen = new HashSet<>();
9        Set<String> repeated = new HashSet<>();
10        
11        for (int i = 0; i <= s.length() - 10; i++) {
12            String sub = s.substring(i, i + 10);
13            if (!seen.add(sub)) {
14                repeated.add(sub);
15            }
16        }
17        
18        return new ArrayList<>(repeated);
19    }
20}