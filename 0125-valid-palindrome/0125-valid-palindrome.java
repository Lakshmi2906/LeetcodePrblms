class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char[] ch=s.toCharArray();
        int left=0,right=ch.length-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(ch[left])) left++;
            while(left<right && !Character.isLetterOrDigit(ch[right])) right--;
            if(ch[left]!=ch[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}