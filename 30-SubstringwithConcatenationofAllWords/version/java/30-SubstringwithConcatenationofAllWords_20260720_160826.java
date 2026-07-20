// Last updated: 20/07/2026, 16:08:26
1import java.util.*;
2
3class Solution {
4    public List<Integer> findSubstring(String s, String[] words) {
5        List<Integer> result = new ArrayList<>();
6        if (s == null || s.length() == 0 || words == null || words.length == 0) {
7            return result;
8        }
9
10        int wordLen = words[0].length();
11        int numWords = words.length;
12        int totalLen = wordLen * numWords;
13        int sLen = s.length();
14
15        if (sLen < totalLen) return result;
16
17        Map<String, Integer> wordCounts = new HashMap<>();
18        for (String word : words) {
19            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
20        }
21
22        for (int i = 0; i < wordLen; i++) {
23            int left = i;
24            int count = 0;
25            Map<String, Integer> currentMap = new HashMap<>();
26
27            for (int right = i; right <= sLen - wordLen; right += wordLen) {
28                String sub = s.substring(right, right + wordLen);
29
30                if (wordCounts.containsKey(sub)) {
31                    currentMap.put(sub, currentMap.getOrDefault(sub, 0) + 1);
32                    count++;
33
34                    while (currentMap.get(sub) > wordCounts.get(sub)) {
35                        String leftWord = s.substring(left, left + wordLen);
36                        currentMap.put(leftWord, currentMap.get(leftWord) - 1);
37                        count--;
38                        left += wordLen;
39                    }
40
41                    if (count == numWords) {
42                        result.add(left);
43                    }
44                } else {
45                    currentMap.clear();
46                    count = 0;
47                    left = right + wordLen;
48                }
49            }
50        }
51
52        return result;
53    }
54}