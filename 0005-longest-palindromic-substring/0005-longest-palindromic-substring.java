class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            if(expand(s,i,i).length()>ans.length()) ans=expand(s,i,i);
            if(expand(s,i,i+1).length()>ans.length()) ans=expand(s,i,i+1);
        }
        return ans;
    }
    public String expand(String str,int left,int right){
       while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
        left--;
        right++;
       }
       return str.substring(left+1,right);
    }
}