class Solution {
    public int countSubstrings(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s,i,j)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public boolean isPalindrome(String str, int l, int r) {
        while (l < r) {
            if (str.charAt(l) != str.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}