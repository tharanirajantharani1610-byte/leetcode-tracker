// Last updated: 23/07/2026, 10:04:38
1import java.util.ArrayList;
2import java.util.Arrays;
3import java.util.List;
4
5class Solution {
6    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
7        List<List<Integer>> result = new ArrayList<>();
8        
9       
10        Arrays.sort(candidates);
11        
12        backtrack(candidates, target, 0, new ArrayList<>(), result);
13        return result;
14    }
15
16    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
17        if (target == 0) {
18            result.add(new ArrayList<>(current));
19            return;
20        }
21
22        for (int i = start; i < candidates.length; i++) {
23            if (candidates[i] > target) {
24                break;
25            }
26
27            if (i > start && candidates[i] == candidates[i - 1]) {
28                continue;
29            }
30
31            current.add(candidates[i]);
32            backtrack(candidates, target - candidates[i], i + 1, current, result);
33            current.remove(current.size() - 1); 
34        }
35    }
36}