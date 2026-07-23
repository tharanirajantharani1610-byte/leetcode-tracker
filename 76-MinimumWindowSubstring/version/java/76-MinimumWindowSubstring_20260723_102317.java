// Last updated: 23/07/2026, 10:23:17
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<List<Integer>> combine(int n, int k) {
6        List<List<Integer>> result = new ArrayList<>();
7        backtrack(1, n, k, new ArrayList<>(), result);
8        return result;
9    }
10
11    private void backtrack(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
12        if (current.size() == k) {
13            result.add(new ArrayList<>(current));
14            return;
15        }
16
17        
18        for (int i = start; i <= n - (k - current.size()) + 1; i++) {
19            current.add(i);
20            backtrack(i + 1, n, k, current, result);
21            current.remove(current.size() - 1); 
22        }
23    }
24}