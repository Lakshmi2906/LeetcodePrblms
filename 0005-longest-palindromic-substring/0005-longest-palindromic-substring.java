class Solution {
    public String longestPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        String res="";
        int start=0,end=0;
        for(i=0;i<s.length();i++){
            int lenOdd=expand(s,i,i);
            int lenEven=expand(s,i,i+1);
            int max=Math.max(lenOdd,lenEven);
            if(max>end-start){
                start=i-(max-1)/2;
                end=i+(max/2);
            }
        }
        return s.substring(start,end+1);
    }
    public int expand(String str,int i,int j){
            while(i>=0 && j<str.length()&& str.charAt(i)==str.charAt(j)){
                i--;
                j++;
            }
        return j-i-1;
    }
}