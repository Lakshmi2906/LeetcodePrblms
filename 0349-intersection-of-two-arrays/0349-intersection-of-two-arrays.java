class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> ans=new HashSet<>();
        for(int n:nums1){
            if(hs.contains(n)) continue;
            else hs.add(n);
        }
        for(int m:nums2){
            if(hs.contains(m)) ans.add(m);
            else continue;
        }
        int[] answer=new int[ans.size()];
        int i=0;
        for(int k:ans){
            answer[i++]=k;
        }
        return answer;
    }
}