class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        vector<int> temp;
        int n = nums.size();
        for(int i = 0 ; i<n ; i++){
            if(nums[i] != val){
                temp.push_back(nums[i]);
            }
        }
    nums=temp;
    return temp.size();
    }   
};