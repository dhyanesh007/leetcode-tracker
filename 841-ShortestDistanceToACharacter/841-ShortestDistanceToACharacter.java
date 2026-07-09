// Last updated: 7/9/2026, 9:57:53 AM
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int cur = Integer.MAX_VALUE / 2;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                cur = 0;
            } else {
                cur++;
            }
            ans[i] = cur;
        }
        cur = Integer.MAX_VALUE / 2;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                cur = 0;
            } else {
                cur++;
            }
            ans[i] = Math.min(ans[i], cur);
        }

        return ans;
    }
}