// Last updated: 23/07/2026, 10:24:10
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<List<Integer>> subsets(int[] nums) {
6        List<List<Integer>> result = new ArrayList<>();
7        backtrack(0, nums, new ArrayList<>(), result);
8        return result;
9    }
10
11    private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
12       
13        result.add(new ArrayList<>(current));
14
15        for (int i = start; i < nums.length; i++) {
16            current.add(nums[i]);                     
17            backtrack(i + 1, nums, current, result); 
18            current.remove(current.size() - 1);      
19        }
20    }
21}