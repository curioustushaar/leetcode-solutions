class Solution {

    // recursive helper function
    private void backtrack(List<String> result , String current , int open , int close , int n){
        // base case
        if(current.length() == 2*n){
            result.add(current);
            return;
        }
            if (open < n) {
            backtrack(result,current + "(", open + 1, close,n);
        }
         if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
    public List<String> generateParenthesis(int n) {
        // final result store krne ke liye
        List<String> result = new ArrayList<>();
        
        backtrack(result , "" , 0 , 0 , n);
        return result;
        
    }
}