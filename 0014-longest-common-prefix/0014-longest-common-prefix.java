class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int k = 1; k < strs.length; k++) {

            int i = 0;
            int j = 0;

            while (i < prefix.length() &&
                   j < strs[k].length() &&
                   prefix.charAt(i) == strs[k].charAt(j)) {
                i++;
                j++;
            }

            prefix = prefix.substring(0, i);

            if (prefix.isEmpty())
                return "";
        }

        return prefix;
    }
}