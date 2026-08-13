class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        
        // Use an array as a custom stack storing indices
        int[] stack = new int[2 * n];
        int top = -1;

        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            
            // Pop elements smaller than current number and record answer
            while (top >= 0 && nums[stack[top]] < num) {
                ans[stack[top--]] = num;
            }
            
            // Only push indices from the first pass
            if (i < n) {
                stack[++top] = i;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna