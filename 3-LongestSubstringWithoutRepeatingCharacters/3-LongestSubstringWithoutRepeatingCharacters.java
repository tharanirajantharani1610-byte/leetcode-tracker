// Last updated: 20/07/2026, 10:17:58
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128];
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            left = Math.max(left, lastIndex[ch]);

            maxLength = Math.max(maxLength, right - left + 1);

            lastIndex[ch] = right + 1;
        }

        return maxLength;
    }
}