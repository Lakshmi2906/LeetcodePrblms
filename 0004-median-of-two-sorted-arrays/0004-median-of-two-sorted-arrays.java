class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int arr[]=new int[n+m];
        int k=0;
        for(int num:nums1){
            arr[k]=num;
            k++;
        }
        for(int nu:nums2){
            arr[k]=nu;
            k++;
        }
        Arrays.sort(arr);
        int len=arr.length;
        if(len%2==1) return (double) arr[len/2];
        else return (double) (arr[(len/2)-1] + arr[len/2])/2.0;        
    }
}