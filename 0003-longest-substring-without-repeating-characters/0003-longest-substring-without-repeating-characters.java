class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,n=s.length(),len=Integer.MIN_VALUE;
        if(n==0) return 0;
        HashSet<Character> hs=new HashSet<>();
        for(int r=0;r<n;r++){
            while(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(r));
            len=Math.max(len,r-l+1);
        }
        return len;
    }
}