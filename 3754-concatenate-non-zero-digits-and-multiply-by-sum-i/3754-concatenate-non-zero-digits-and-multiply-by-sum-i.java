class Solution {
    public long sumAndMultiply(int n) {
       String str = Integer.toString(n);
       StringBuilder sb = new StringBuilder();

       int sum = 0;

       for(int i = 0; i < str.length(); i++){

         char ch = str.charAt(i);

         if(ch == '0'){
            continue;
         }

         sb.append(ch);
         sum = sum + ch - '0';

       }
       if(sb.length() == 0){
        return 0;
       }

       long x = Long.parseLong(sb.toString());

       return x * sum;
    }
}