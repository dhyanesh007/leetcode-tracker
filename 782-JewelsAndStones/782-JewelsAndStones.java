// Last updated: 7/9/2026, 9:57:56 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char ch:stones.toCharArray()){
            if(jewels.indexOf(ch)!=-1){
                count++;
            }
        }
        return count;
    }
}