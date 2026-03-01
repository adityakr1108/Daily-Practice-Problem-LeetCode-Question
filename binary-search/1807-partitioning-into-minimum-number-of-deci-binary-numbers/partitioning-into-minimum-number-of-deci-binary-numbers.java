class Solution {
    public int minPartitions(String n) {
        
        int maxi = 0;
        char [] arr = n.toCharArray();
        for(char ch : arr){
            maxi = Math.max(maxi,ch - '0');
        }
        return maxi;
    }
}