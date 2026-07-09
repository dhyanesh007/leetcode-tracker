// Last updated: 7/9/2026, 9:58:25 AM
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            int value = c - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
}