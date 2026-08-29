// Last updated: 29/08/2026, 21:10:27
1class Solution {
2    public int minBishopMoves(int[] source, int[] target) {
3        int sr = source[0], sc = source[1];
4        int tr = target[0], tc = target[1];
5        if(sr == tr && sc == tc)
6            return 0;
7        if((sr + sc) % 2 != (tr + tc) % 2)
8            return -1;
9        if(Math.abs(sr - tr) == Math.abs(sc - tc))
10            return 1;
11        return 2;
12    }
13}