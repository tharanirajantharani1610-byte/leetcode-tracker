// Last updated: 09/07/2026, 10:13:14
class Solution {
    public int mySqrt(int x) {
        int i = 1;
        while((long)i * i <= x){
            i++;
        }
        return i - 1;
    }
}