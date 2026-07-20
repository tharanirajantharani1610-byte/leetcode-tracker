# Last updated: 20/07/2026, 10:35:08
class Solution(object):
    def longestPalindrome(self, s):
        if not s:
            return ""
        
        start = 0
        end = 0
        
        for i in range(len(s)):
            len1 = self.expand(s, i, i)       # Odd length palindrome
            len2 = self.expand(s, i, i + 1)   # Even length palindrome
            max_len = max(len1, len2)
            
            if max_len > end - start:
                start = i - (max_len - 1) // 2
                end = i + max_len // 2
        
        return s[start:end + 1]
    
    def expand(self, s, left, right):
        while left >= 0 and right < len(s) and s[left] == s[right]:
            left -= 1
            right += 1
        
        return right - left - 1