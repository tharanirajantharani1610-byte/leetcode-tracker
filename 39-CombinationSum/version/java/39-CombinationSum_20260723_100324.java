// Last updated: 23/07/2026, 10:03:24
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<List<Integer>> combinationSum(int[] candidates, int target) {
6        List<List<Integer>> result = new ArrayList<>();
7        backtrack(candidates, target, 0, new ArrayList<>(), result);
8        return result;
9    }
10
11    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
12        if (target == 0) {
13            result.add(new ArrayList<>(current));
14            return;
15        }
16
17        for (int i = start; i < candidates.length; i++) {
18         
19            if (candidates[i] <= target) {
20                current.add(candidates[i]);
21               
22                backtrack(candidates, target - candidates[i], i, current, result);
23                current.remove(current.size() - 1); 
24            }
25        }
26    }
27}