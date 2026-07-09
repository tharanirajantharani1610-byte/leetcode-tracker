// Last updated: 09/07/2026, 10:12:54
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum = 0;
        for(int num : nums){
            int x = num;
            int max = 0,min = 9;
            while(x > 0){
                int d = x % 10;
                max = Math.max(max, d);
                min = Math.min(min, d);
                x /= 10;
            }
            int range = max - min;
            if(range > maxRange){
                maxRange = range;
                sum = num;
            } else if(range == maxRange){
                sum += num;
            }
        }
        return sum;
    }
}