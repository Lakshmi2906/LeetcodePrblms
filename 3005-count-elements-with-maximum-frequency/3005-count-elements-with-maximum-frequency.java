import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
       int[] freq=new int[101];
       int maxfreq=0;
       for(int f:nums){
        freq[f]++;
       }
       for(int fr:freq){
            maxfreq=Math.max(fr,maxfreq);
       }
       int res=0;
       for(int fre:freq){
        if(fre==maxfreq){
            res+=fre;
        }
       }
       return res;
    }
}