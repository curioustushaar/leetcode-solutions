class Solution {
    public String removeKdigits(String nums, int k) {

        Stack<Character> st = new Stack<>();

        // Main algorithm
        for (int i = 0; i < nums.length(); i++) {

            char digit = nums.charAt(i);

            // Agar previous digit bada hai,
            // to usko remove karo
            while (!st.isEmpty() && k > 0 && st.peek() > digit) {
                st.pop();
                k--;
            }

            st.push(digit);
        }

        // Agar abhi bhi k digits remove karne hain,
        // to last digits remove karo
        while (k > 0) {
            st.pop();
            k--;
        }

        // Agar saare digits remove ho gaye
        if (st.isEmpty()) {
            return "0";
        }

        StringBuilder res = new StringBuilder();

        // Stack se digits nikalo
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        // Correct order
        res.reverse();

        // Leading zeros remove karo
        while (res.length() > 1 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }

        return res.toString();
    }
}