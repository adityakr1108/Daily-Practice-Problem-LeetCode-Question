class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if(n < 3) return false;
        int i = 0;
         while(i+1 < n && nums[i+1] > nums[i]){
            i++;
         }
         if(i == 0) return false;
        int dec = i;
        while(i+1 < n && nums[i+1] < nums[i]){
            i++;
        }
        if(i == dec) return false;

        int secondInc = i;
        while(i+1 < n && nums[i+1] > nums[i]){
            i++;
        }
        if(i == secondInc) return false;

        return i == n-1;
    }

}