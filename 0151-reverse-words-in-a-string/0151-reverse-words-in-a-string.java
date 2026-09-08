class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder sb=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ') sb.append(s.charAt(i));
            else{
                if(sb.length()>0){
                ans.append(sb.reverse()+" ");
                sb.setLength(0);
                }    
            }
        }
        ans.append(sb.reverse());
        return ans.toString();
    }
}