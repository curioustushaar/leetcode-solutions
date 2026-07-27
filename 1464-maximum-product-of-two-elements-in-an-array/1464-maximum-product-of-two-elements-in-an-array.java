class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int one = nums[nums.length-1] - 1;
        int two =  nums[nums.length-2]-1;
        return one * two;
    }
}