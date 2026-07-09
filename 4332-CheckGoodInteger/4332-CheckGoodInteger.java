// Last updated: 09/07/2026, 10:12:56
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;
        while(n > 0){
            int d = n % 10;
            digitSum += d;
            squareSum += d * d;
            n /= 10;
        }
        return squareSum - digitSum >= 50;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.checkGoodInteger(1000));
        System.out.println(s.checkGoodInteger(19));
    }
}