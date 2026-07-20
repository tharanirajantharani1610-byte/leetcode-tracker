# Last updated: 20/07/2026, 10:35:03
class Solution(object):
    def isPalindrome(self, x):
        # Negative numbers are not palindrome
        # Numbers ending with 0 (but not 0 itself) are not palindrome
        if x < 0 or (x % 10 == 0 and x != 0):
            return False
        
        reversed_half = 0
        
        while x > reversed_half:
            reversed_half = reversed_half * 10 + x % 10
            x //= 10
        
        # For even digits: x == reversed_half
        # For odd digits: x == reversed_half // 10
        return x == reversed_half or x == reversed_half // 10