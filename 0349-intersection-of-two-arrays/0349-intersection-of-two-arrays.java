class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        Set<Integer> hash=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        for(int num:nums1){
           hs.add(num);
        }
        for(int ans:nums2){
             if(hs.contains(ans)){
                res.add(ans);
            }
        }
        int arr[]=new int[res.size()];
        int i=0;
        for(int answer:res){
            arr[i++]= answer;
        }
        return arr;
    }
}