class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int arr[] = new int[n];
        
        // Count trailing zeros
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = n - 1; j >= 0; j--){
                if(grid[i][j] == 0){
                    count++;
                } else {
                    break;
                }
            }
            arr[i] = count;
        }

        int ans = 0;

        for(int i = 0; i < n; i++){
            int required = n - i - 1;
            int index = -1;

            // Find first row that satisfies condition
            for(int j = i; j < n; j++){
                if(arr[j] >= required){
                    index = j;
                    break;
                }
            }

            if(index == -1) return -1;

            // Bring that row up using adjacent swaps
            for(int j = index; j > i; j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                ans++;
            }
        }

        return ans;
    }
}