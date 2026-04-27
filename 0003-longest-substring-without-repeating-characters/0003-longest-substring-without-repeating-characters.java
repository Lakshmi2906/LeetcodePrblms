import java.util.HashMap;
import java.util.Map;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,n=s.length();
        int end=0,ans=0,maxLen=Math.min(s.length(),1);
        Set<Character> sh=new HashSet<>();
        while(end<n){
            char ch=s.charAt(end);
            while(sh.contains(ch)){
                sh.remove(s.charAt(start));
                start++;
            }
            sh.add(ch);
            maxLen=Math.max(maxLen,end-start+1);
            end++;
        }
        return maxLen;
    }
}