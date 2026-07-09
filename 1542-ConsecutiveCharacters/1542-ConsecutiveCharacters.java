// Last updated: 7/9/2026, 9:57:41 AM
class Solution {
    public int maxPower(String s) {
        int c=1,max=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                c=1;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}