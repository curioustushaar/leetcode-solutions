class Solution {
    public long subArrayRanges(int[] arr) {
        int n = arr.length;
        long sum = 0;  // int nahi

        for (int i = 0; i < n; i++) {

            int lt = arr[i];
            int sm = arr[i];

            for (int j = i; j < n; j++) {
                sm = Math.min(sm, arr[j]);
                lt = Math.max(lt, arr[j]);

                sum += (long)(lt - sm);
            }
        }

        return sum;
    }
}