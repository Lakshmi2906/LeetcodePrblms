class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left=0,right=letters.length-1;
        char first=letters[0];
        while(left<=right){
            int mid=left+(right-left)/2;
            if(letters[mid]>target){
                first=letters[mid];
                right=mid-1;
            }
            else left=mid+1;
        }
        return first;
    }
}