// Last updated: 09/07/2026, 10:12:53
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        int n = nums.length;
        for(int i = 0; i < k; i++){
            int x = nums[n - 1 - i];
            ans += Math.max((long) x, (long) x * mul);
            mul--;
        }
        return ans;
    }
}