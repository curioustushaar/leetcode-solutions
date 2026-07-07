class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int sum = 0;

            for(int j = i; j < n; j++){
           
           sum = sum + arr[j];
           int length = j - i + 1;
           if(length % 2 != 0){
            ans = ans + sum;
           }

            }
        }
        return ans;
    }
}