class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int dp1[] =  new int [nums.length];
        Arrays.fill(dp1,-1);
        int dp2[] =  new int [nums.length];
        Arrays.fill(dp2,-1);
        return Math.max(solve(0,0,nums,dp1), solve(1,1,nums,dp2));
    }
    int solve(int index,int start, int [] nums, int dp[]){
        if(index >= nums.length) return 0;
        if(dp[index] != -1) return dp[index];
        if(start == 0 && index == nums.length-1){
            return 0;
        }
        int take = nums[index] + solve(index+2,start,nums,dp); 
        int notTake = solve(index+1,start,nums,dp);
        return dp[index] =  Math.max(take,notTake);
        
    }
}