# Last updated: 20/07/2026, 10:34:42
class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        
        result = []
        
        def backtrack(current, open_count, close_count):
            
            # If full length reached
            if len(current) == 2 * n:
                result.append(current)
                return
            
            # Add '(' if we can
            if open_count < n:
                backtrack(current + "(", open_count + 1, close_count)
            
            # Add ')' if valid
            if close_count < open_count:
                backtrack(current + ")", open_count, close_count + 1)
        
        backtrack("", 0, 0)
        return result