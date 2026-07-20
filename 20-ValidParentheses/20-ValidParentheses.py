# Last updated: 20/07/2026, 10:34:45
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        
        stack = []
        mapping = {
            ')': '(',
            '}': '{',
            ']': '['
        }
        
        for char in s:
            if char in mapping:  # If closing bracket
                if not stack or stack[-1] != mapping[char]:
                    return False
                stack.pop()
            else:  # Opening bracket
                stack.append(char)
        
        return len(stack) == 0