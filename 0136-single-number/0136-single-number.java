class Solution {
    public int singleNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int ans = nums[i];
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == ans) {
                    count++;
                }
            }

            if (count == 1) {
                return ans;
            }
        }

        return -1; // Agar koi single number na mile
    }
}