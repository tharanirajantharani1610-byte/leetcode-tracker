# Last updated: 20/07/2026, 10:34:28
class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        
        i, j = 0, 0
        result = []
        
        while i < len(word1) and j < len(word2):
            result.append(word1[i])
            result.append(word2[j])
            i += 1
            j += 1
        
        # Append remaining characters
        result.append(word1[i:])
        result.append(word2[j:])
        
        return "".join(result)