class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefixPrdFromRight[] = new int[nums.length];
        int prefixPrdFromLeft[] = new int[nums.length];
        int prodFromLeft = 1;
        prefixPrdFromLeft[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            prefixPrdFromLeft[i] = prefixPrdFromLeft[i-1] * nums[i];
        }
        prefixPrdFromRight[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            prefixPrdFromRight[i] = prefixPrdFromRight[i+1] * nums[i];
        }

        int ans[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(i == 0){
                ans[i] = 1 * prefixPrdFromRight[i+1];
            }
            else if(i == nums.length-1){
                ans[i] = prefixPrdFromLeft[i-1];
            }
            else{
                ans[i] = prefixPrdFromLeft[i-1] * prefixPrdFromRight[i+1];
            }
        }
        return ans;
    }
}