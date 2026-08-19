class Solution {
    public int secondHighest(String s) {
        int max=0,smax=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c) && c>max){
                smax=max;
                max=c;
            }
            else if(c<max && c>smax){
                smax=c;
            }
        }
        return smax==0 ? -1 : smax-'0';
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna