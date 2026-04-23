class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] arr=s.toCharArray();
        while(left<right){
            if(!isVowel(arr[left])) left++;
            else if(!isVowel(arr[right])) right--;
            else{
                swap(arr,left,right);
                left++;
                right--;
            }
        }
        return new String(arr);
    }
    public boolean isVowel(char c){
        if(c=='A'||c=='E'||c=='I'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||    c=='u') return true;
        return false;
    }
    public void swap(char[] arr,int left,int right){
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}