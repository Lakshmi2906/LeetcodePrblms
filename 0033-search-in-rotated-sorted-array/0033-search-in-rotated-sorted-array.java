class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int min=minValue(nums);
        int ans=binarySearch(nums,0,min-1,target);
        if(ans==-1){
            ans=binarySearch(nums,min,nums.length-1,target);
        }
        return ans;
    }
    public int binarySearch(int arr[],int left,int right,int target){
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public int minValue(int[] nums){
        int low=0,high=nums.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]<nums[high]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}