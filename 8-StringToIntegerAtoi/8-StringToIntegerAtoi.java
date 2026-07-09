// Last updated: 7/9/2026, 10:00:18 AM
class Solution {
    public int myAtoi(String s) {
        s = s.trim(); 
        int signal = 1, i = 0;
        long res = 0;
        if (s.length() == 0) return 0;
        if (s.charAt(0) == '-') { signal = -1; i++; }
        else if (s.charAt(0) == '+') { i++; }
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break; 
            res = res * 10 + (ch - '0');
            if (signal * res > Integer.MAX_VALUE) return Integer.MAX_VALUE; 
            if (signal * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
        return (int) (signal * res);
    }
}