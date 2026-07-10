class Solution {

    // Find maximum pile
    private int findMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    // Calculate total hours using LONG to avoid overflow
    private long calculateTotalHours(int[] piles, int speed) {
        long totalHours = 0;

        for (int pile : piles) {
            totalHours += (pile + speed - 1) / speed; // integer ceil
        }

        return totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = findMax(piles);
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hours = calculateTotalHours(piles, mid);

            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
