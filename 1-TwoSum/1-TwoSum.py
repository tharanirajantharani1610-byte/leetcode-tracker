# Last updated: 20/07/2026, 10:35:15
class Solution(object):
    def twoSum(self, nums, target):
        seen = {}  # value -> index
        
        for i in range(len(nums)):
            complement = target - nums[i]
            
            if complement in seen:
                return [seen[complement], i]
            
            seen[nums[i]] = i
