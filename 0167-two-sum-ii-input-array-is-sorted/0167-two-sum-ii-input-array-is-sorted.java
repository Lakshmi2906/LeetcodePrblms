class Solution {
    public int[] twoSum(int[] numbers, int target) {
     HashMap<Integer,Integer> hm=new HashMap<>();
     for(int i=0;i<numbers.length;i++){
        int search=target-numbers[i];
        if(hm.containsKey(search)){
            return new int[]{hm.get(search)+1,i+1};
        }
        hm.put(numbers[i],i);
     }
     return new int[]{};
    }
}