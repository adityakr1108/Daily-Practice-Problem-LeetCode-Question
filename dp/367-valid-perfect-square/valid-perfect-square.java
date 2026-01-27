class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        int low = 2;
        int high = num / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int div = num / mid;

            if (div == mid && num % mid == 0) {
                return true;
            } else if (div < mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
