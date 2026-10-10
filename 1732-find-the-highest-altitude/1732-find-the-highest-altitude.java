class Solution {
    public int largestAltitude(int[] gain) {
        
        int currAl = 0;
        int maxAl = 0;

        for(int i = 0; i < gain.length; i++){
            currAl = currAl + gain[i];

            maxAl = Math.max(maxAl , currAl);
        }

        return maxAl;
    }
}