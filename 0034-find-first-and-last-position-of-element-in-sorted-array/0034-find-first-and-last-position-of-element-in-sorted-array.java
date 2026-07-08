class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int first=firstOcc(nums,l,r,target);
        int last=lastOcc(nums,l,r,target);
        return new int[] {first,last};
    }
    public int firstOcc(int[] arr,int l,int r,int target){
        int first=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                first=mid;
                r=mid-1;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else r=mid-1;
        }
        return first;
    }
    public int lastOcc(int[] arr,int l,int r,int target){
        int last=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                last=mid;
                l=mid+1;
            }
            else if(arr[mid]<target) l=mid+1;
            else r=mid-1;
        }
        return last;
    }
}