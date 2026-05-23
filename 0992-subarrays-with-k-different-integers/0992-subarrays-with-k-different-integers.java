class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums,k - 1);
    }

    public int atMost(int[] nums, int k) {
        int n = nums.length, l = 0, cnt = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int r = 0; r < n; r++) {
            hm.put(nums[r], hm.getOrDefault(nums[r], 0) + 1);
            while (hm.size() > k) {
                hm.put(nums[l], hm.get(nums[l]) - 1);
                if (hm.get(nums[l]) == 0) {
                    hm.remove(nums[l]);
                }
                l++;
            }
            cnt += (r - l + 1);
        }
        return cnt;
    }
}