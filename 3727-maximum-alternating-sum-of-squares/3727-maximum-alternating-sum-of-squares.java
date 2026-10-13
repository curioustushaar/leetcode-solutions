class Solution {
    public long maxAlternatingSum(int[] nums) {

        long[] squres = new long[nums.length];
        int n = nums.length;
        long sum = 0;

        for(int i = 0; i < nums.length; i++){
            squres[i] = 1L * nums[i] * nums[i];
        }

        Arrays.sort(squres);

        for(int i = 0; i < n/2; i++){
            sum -= squres[i];
        }

        for(int i = n/2; i < n; i++){
            sum += squres[i];
        }

        return sum; 
    }
}