class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int n=numbers.length;
     int left=0,right=n-1;
     while(left<right){
        if(numbers[left]+numbers[right]==target){
            return new int[]{left+1,right+1};
        }
        if(numbers[left]+numbers[right]<target){
            left++;
        }
        else right--;
     }
     return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna