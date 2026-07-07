class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points, (a,b) -> Integer.compare(a[0] , b[0]));
        int[] prev = points[0];
        int count = 1;

        for(int i = 1; i < n ; i++){
            int currSP = points[i][0];
            int currEP = points[i][1];

            int prevSP = prev[0];
            int prevEP = prev[1];

            if(currSP > prevEP){
                count++;
                prev = points[i];
            }
            else{
                prev[0] = Math.max(prevSP , currSP);
                prev[1] = Math.min(prevEP , currEP);
            }
        }
        
        return count;
    }
}