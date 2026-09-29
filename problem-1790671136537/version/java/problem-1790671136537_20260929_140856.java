// Last updated: 29/09/2026, 14:08:56
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<Integer> getRow(int rowIndex) {
6        List<Integer> row = new ArrayList<>();
7        row.add(1);
8
9        for (int i = 1; i <= rowIndex; i++) {
10            row.add(1);
11            for (int j = i - 1; j > 0; j--) {
12                row.set(j, row.get(j) + row.get(j - 1));
13            }
14        }
15
16        return row;
17    }
18}