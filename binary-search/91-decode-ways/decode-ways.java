class Solution {
    public int numDecodings(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return solve(0, s, memo);
    }

    int solve(int i, String s, int[] memo) {
        if (i == s.length()) return 1;
        if (s.charAt(i) == '0') return 0;

        if (memo[i] != -1) return memo[i];

        int ways = solve(i + 1, s, memo);

        if (i + 1 < s.length()) {
            int num = Integer.parseInt(s.substring(i, i + 2));
            if (num >= 10 && num <= 26) {
                ways += solve(i + 2, s, memo);
            }
        }

        return memo[i] = ways;
    }
}
