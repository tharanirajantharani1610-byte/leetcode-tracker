// Last updated: 20/07/2026, 15:03:15
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    private static final String[] PHONE_MAP = {
6        "",     
7        "",     
8        "abc",  
9        "def",  
10        "ghi",  
11        "jkl",  
12        "mno",  
13        "pqrs", 
14        "tuv",  
15        "wxyz"  
16    };
17
18    public List<String> letterCombinations(String digits) {
19        List<String> result = new ArrayList<>();
20        
21        if (digits == null || digits.length() == 0) {
22            return result;
23        }
24        
25        backtrack(digits, 0, new StringBuilder(), result);
26        return result;
27    }
28
29    private void backtrack(String digits, int index, StringBuilder current, List<String> result) {
30        if (index == digits.length()) {
31            result.add(current.toString());
32            return;
33        }
34
35        String letters = PHONE_MAP[digits.charAt(index) - '0'];
36
37        for (char c : letters.toCharArray()) {
38            current.append(c);                                  
39            backtrack(digits, index + 1, current, result);     
40            current.deleteCharAt(current.length() - 1);         
41        }
42    }
43}