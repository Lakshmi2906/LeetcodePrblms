class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int[] pa=new int[26];
        for(int c:p.toCharArray()){
            pa[c-'a']++;
        }
        int sa[]=new int[26];
        for(int i=0;i<s.length();i++){
            sa[s.charAt(i)-'a']++;
            if(i>=p.length()){
                sa[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(sa,pa)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
}