// Last updated: 09/10/2026, 09:01:37
1import java.util.*;
2
3class Solution {
4    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
5        Set<String> wordSet = new HashSet<>(wordList);
6        
7        if (!wordSet.contains(endWord)) {
8            return 0;
9        }
10
11        Queue<String> queue = new LinkedList<>();
12        queue.add(beginWord);
13        
14        int level = 1;
15
16        while (!queue.isEmpty()) {
17            int size = queue.size();
18
19            for (int i = 0; i < size; i++) {
20                String currentWord = queue.poll();
21
22                if (currentWord.equals(endWord)) {
23                    return level;
24                }
25
26                char[] wordChars = currentWord.toCharArray();
27                for (int j = 0; j < wordChars.length; j++) {
28                    char originalChar = wordChars[j];
29
30                    for (char c = 'a'; c <= 'z'; c++) {
31                        if (c == originalChar) continue;
32
33                        wordChars[j] = c;
34                        String newWord = new String(wordChars);
35
36                        if (wordSet.contains(newWord)) {
37                            queue.add(newWord);
38                            wordSet.remove(newWord); 
39                        }
40                    }
41
42                    wordChars[j] = originalChar;
43                }
44            }
45            level++;
46        }
47
48        return 0;
49    }
50}