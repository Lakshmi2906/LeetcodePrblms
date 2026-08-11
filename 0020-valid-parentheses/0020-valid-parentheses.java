class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{'||c=='('||c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                if((c=='}'&& st.peek()!='{') ||(c==']'&& st.peek()!='[')|| (c==')' && st.peek()!='(')){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna