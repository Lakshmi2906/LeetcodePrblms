class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        permuta(nums,0,ans);
        return ans;
    }
    int index=0;
    public void permuta(int[] nums,int index,List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> ls=new ArrayList<>();
            for(int num:nums){
                ls.add(num);
            }
            ans.add(ls);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            permuta(nums,index+1,ans);
            swap(nums,i,index);
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
