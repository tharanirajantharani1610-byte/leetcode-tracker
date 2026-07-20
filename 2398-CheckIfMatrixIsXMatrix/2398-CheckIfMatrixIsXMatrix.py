# Last updated: 20/07/2026, 10:34:29
class Solution(object):
    def checkXMatrix(self, grid):
        n = len(grid)
        for i in range(n):
            for j in range(n):
                if i == j or i + j == n - 1:  # diagonal
                    if grid[i][j] == 0:
                        return False
                else:  # non-diagonal
                    if grid[i][j] != 0:
                        return False
        return True
