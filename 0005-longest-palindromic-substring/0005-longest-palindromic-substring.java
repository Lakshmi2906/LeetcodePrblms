class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int lenOdd=expand(s,i,i);
            int lenEven=expand(s,i,i+1);
            int max=Math.max(lenOdd,lenEven);
            if(max > end-start){
                start= i - (max-1)/2;
                end=i+(max/2);
            }
        }
        return s.substring(start,end+1);
    }
    public int expand(String str,int left,int right){
        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}