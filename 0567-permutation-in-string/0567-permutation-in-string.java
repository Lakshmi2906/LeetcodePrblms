class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l=0;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char ch:s1.toCharArray()){
            freq1[ch-'a']++;
        }
        for(int r=0;r<s2.length();r++){
            freq2[s2.charAt(r)-'a']++;
            if(r-l+1>s1.length()){
                freq2[s2.charAt(l)-'a']--;
                l++;
            }
            if(r-l+1==s1.length()){
                boolean ismatch=true;
                for(int i=0;i<26;i++){
                    if(freq1[i]!=freq2[i]){
                    ismatch=false;
                    break;
                }
                }
                if(ismatch) return true;
            }
            
        }
          return false;
    }
}