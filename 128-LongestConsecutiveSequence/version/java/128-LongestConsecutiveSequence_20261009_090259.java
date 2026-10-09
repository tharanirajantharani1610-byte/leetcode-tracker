// Last updated: 09/10/2026, 09:02:59
1import java.util.HashSet;
2import java.util.Set;
3
4class Solution {
5    public int longestConsecutive(int[] nums) {
6        if (nums == null || nums.length == 0) {
7            return 0;
8        }
9
10        Set<Integer> numSet = new HashSet<>();
11        for (int num : nums) {
12            numSet.add(num);
13        }
14
15        int maxLength = 0;
16
17        for (int num : numSet) {
18            
19            if (!numSet.contains(num - 1)) {
20                int currentNum = num;
21                int currentStreak = 1;
22
23                while (numSet.contains(currentNum + 1)) {
24                    currentNum++;
25                    currentStreak++;
26                }
27
28                maxLength = Math.max(maxLength, currentStreak);
29            }
30        }
31
32        return maxLength;
33    }
34}