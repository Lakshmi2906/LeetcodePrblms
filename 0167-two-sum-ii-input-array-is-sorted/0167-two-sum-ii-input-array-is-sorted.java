class Solution {
    public int[] twoSum(int[] numbers, int target) {
     HashMap<Integer,Integer> hm=new HashMap<>();
     for(int i=0;i<numbers.length;i++){
        int sear=target-numbers[i];
        if(hm.containsKey(sear)){
            return new int[] {hm.get(sear)+1,i+1};
        }
        hm.put(numbers[i],i);
     }
     return new int[] {};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna