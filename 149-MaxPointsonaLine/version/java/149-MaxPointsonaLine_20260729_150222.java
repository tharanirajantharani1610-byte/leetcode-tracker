// Last updated: 29/07/2026, 15:02:22
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int maxPoints(int[][] points) {
6        int n = points.length;
7        if (n <= 2) return n;
8
9        int maxPointsOnLine = 1;
10
11        for (int i = 0; i < n; i++) {
12            Map<String, Integer> slopeMap = new HashMap<>();
13            int localMax = 0;
14
15            for (int j = i + 1; j < n; j++) {
16                int dx = points[j][0] - points[i][0];
17                int dy = points[j][1] - points[i][1];
18
19                 int gcd = gcd(dx, dy);
20                dx /= gcd;
21                dy /= gcd;
22
23                 
24                if (dx < 0) {
25                    dx = -dx;
26                    dy = -dy;
27                } else if (dx == 0) {
28                    dy = Math.abs(dy);  
29                }
30
31                String slopeKey = dx + "/" + dy;
32                slopeMap.put(slopeKey, slopeMap.getOrDefault(slopeKey, 0) + 1);
33                localMax = Math.max(localMax, slopeMap.get(slopeKey));
34            }
35 
36            maxPointsOnLine = Math.max(maxPointsOnLine, localMax + 1);
37        }
38
39        return maxPointsOnLine;
40    }
41
42    private int gcd(int a, int b) {
43        if (b == 0) return a;
44        return gcd(b, a % b);
45    }
46}