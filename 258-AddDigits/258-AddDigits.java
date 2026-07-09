// Last updated: 7/9/2026, 9:58:12 AM
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0; 
        else if (num % 9 != 0) return num % 9;
        else return 9;  
    }
}