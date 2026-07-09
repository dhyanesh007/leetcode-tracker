// Last updated: 7/9/2026, 9:58:06 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int r = ransomNote.length();
        int m = magazine.length();

        if (r > m) return false;

        int[] mag = new int[26];

        for (int i = 0; i < m; i++) {
            mag[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < r; i++) {
            char ch = ransomNote.charAt(i);

            mag[ch - 'a']--;

            if(mag[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}