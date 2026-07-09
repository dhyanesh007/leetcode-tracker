// Last updated: 7/9/2026, 9:57:33 AM
class Solution {
    public String truncateSentence(String s, int k) {
        String ans="";
        String[] j=s.split(" ");
        for(int i=0;i<k-1;i++){
            ans=ans+j[i]+" ";
        }
        ans=ans+j[k-1];
        return ans;
    }
}