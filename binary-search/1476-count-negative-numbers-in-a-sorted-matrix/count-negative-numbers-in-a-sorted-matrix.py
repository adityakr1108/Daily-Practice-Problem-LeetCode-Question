class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        count = 0
        rows = len(grid)
        cols = len(grid[0])
        
        for i in range(rows):
            low = 0
            high = cols - 1
            
            while low <= high:
                mid = (low + high) // 2
                
                if grid[i][mid] < 0:
                    high = mid - 1
                else:
                    low = mid + 1
            
            count += (cols - low)
        
        return count