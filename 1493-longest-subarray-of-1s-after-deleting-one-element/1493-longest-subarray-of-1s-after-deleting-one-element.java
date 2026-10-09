class Solution {
    public int longestSubarray(int[] nums) {

        int maxZero = 0;
        int left = 0;
        int maxLen = 0;


        for(int right = 0; right < nums.length; right ++){

            if(nums[right] == 0){
                maxZero++;
            }

            while(maxZero > 1){
                if(nums[left] == 0){
                    maxZero--;
                }
                left++;
            }


            maxLen = Math.max(maxLen , right - left);
        }

        return maxLen;
    }
}