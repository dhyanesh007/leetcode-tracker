// Last updated: 7/9/2026, 9:59:00 AM
class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;
        int next=0;
        int f=3;
        int l=2;
        for(int i=4;i<=n;i++){
            next=f+l;
            l=f;
            f=next;
        }
        return f;
    }
}