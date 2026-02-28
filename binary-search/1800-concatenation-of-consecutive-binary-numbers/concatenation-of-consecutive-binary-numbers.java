class Solution {
    public int concatenatedBinary(int n) {
        long num = 0;
        int mod = 1_000_000_007;
        for(int i = 1;i<=n;i++){
            int length = Integer.toBinaryString(i).length();
            num = (num << length)%mod ;
            num = (num + i)%mod;
        }
        return (int)num;
    }
}