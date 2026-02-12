class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int cnt=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    cnt++;
                    break;
                }
            }
        }
        int count=0;
        for(int j=0;j<nums2.length;j++){
            for(int i=0;i<nums1.length;i++){
                if(nums2[j]==nums1[i]){
                   count++;
                   break;
                }
            }
        }
        int[] ans={cnt,count};
        return ans;
    }
}