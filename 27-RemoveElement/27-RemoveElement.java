// Last updated: 09/07/2026, 10:13:17
class Solution {
    public int removeElement(int[] nums, int val) {
         int n = 0;
         for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }
}