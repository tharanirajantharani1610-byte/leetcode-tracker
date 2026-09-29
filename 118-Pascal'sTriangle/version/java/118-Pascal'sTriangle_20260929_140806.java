// Last updated: 29/09/2026, 14:08:06
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<List<Integer>> generate(int numRows) {
6        List<List<Integer>> triangle = new ArrayList<>();
7
8        for (int i = 0; i < numRows; i++) {
9            List<Integer> row = new ArrayList<>();
10            
11            for (int j = 0; j <= i; j++) {
12                if (j == 0 || j == i) {
13                    row.add(1);
14                } else {
15                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
16                    row.add(val);
17                }
18            }
19            
20            triangle.add(row);
21        }
22
23        return triangle;
24    }
25}