class Solution {
    public int countSubstrings(String s) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            cnt+=expand(s,i,i);
            cnt+=expand(s,i,i+1);
        }
        return cnt;
    }
    public int expand(String str,int l,int r){
        int lcnt=0;
        while(l>=0 && r<str.length() && str.charAt(l)==str.charAt(r)){
            l--;
            r++;
            lcnt++;
        }
        return lcnt;
    }
}