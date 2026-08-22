class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
       
       int n = nums.length;
       for(int i = 0; i < nums.length; i++){

        ans = ans ^ nums[i];

       }

       return ans;
    }
}