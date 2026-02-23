class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int maxDistance = 0;
        int i = 0;int j = 0;
        while(j<binary.length()){
            if(binary.charAt(j) == '0'){
                j++;
                continue;
            }
            maxDistance = Math.max(maxDistance,j-i);
            i = j;
            j++;
        }
        return maxDistance;
    }
}