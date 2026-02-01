class Solution {
    public int minimumCost(int[] nums) {
        int min_cost = Integer.MAX_VALUE;
        if(nums.length < 3) return -1;
        if(nums.length == 3){
            return nums[0] + nums[1] + nums[2];
        }
        int cost = nums[0];
        for(int i = 1;i<nums.length-1;i++){
            cost += nums[i];
            for(int j = i+1;j<nums.length;j++){
                cost += nums[j];
                min_cost = Math.min(min_cost,cost);
                cost -= nums[j];
            }
            cost -= nums[i];

        }

        return min_cost;
    }
}