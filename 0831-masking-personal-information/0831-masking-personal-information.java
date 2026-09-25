class Solution {
    public String maskPII(String s) {
        s = s.trim();

        // EMAIL CASE
        if (s.contains("@")) {
            s = s.toLowerCase();           // lowercase whole email
            int at = s.indexOf('@');       // find '@'

            char first = s.charAt(0);      // first character
            char last = s.charAt(at - 1);  // last before '@'
            String domain = s.substring(at);

            return first + "*****" + last + domain;
        }

        // PHONE NUMBER CASE
        StringBuilder digits = new StringBuilder();

        // keep digits only
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) digits.append(c);
        }

        String d = digits.toString();
        int n = d.length();

        // last 4 numbers shown
        String local = "***-***-" + d.substring(n - 4);

        // normal phone: 10 digits
        if (n == 10) return local;

        // country code masking
        StringBuilder prefix = new StringBuilder("+");
        for (int i = 0; i < n - 10; i++) prefix.append("*");

        return prefix + "-" + local;
    }
}