class Solution:
    def concatenatedBinary(self, n: int) -> int:
        result = 0
        mod = 1_000_000_007;
        for i in range(1,n+1):
            length = i.bit_length()
            result = (result << length)%mod
            result = (result + i)%mod
        return result