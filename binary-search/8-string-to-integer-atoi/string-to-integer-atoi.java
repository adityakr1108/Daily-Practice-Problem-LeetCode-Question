class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        int ans = 0;
        boolean negative = false;

        // Skip spaces
        while (i < n && s.charAt(i) == ' ') i++;

        // Sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            negative = s.charAt(i) == '-';
            i++;
        }

        // Build number
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Overflow check
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            ans = ans * 10 + digit;
            i++;
        }

        return negative ? -ans : ans;
    }
}