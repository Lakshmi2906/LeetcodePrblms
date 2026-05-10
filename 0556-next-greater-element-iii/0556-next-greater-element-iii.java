class Solution {
    public int nextGreaterElement(int n) {
       char[] ch=String.valueOf(n).toCharArray();
       int i=ch.length-2;
       while(i>=0 && ch[i]>=ch[i+1]){
        i--;
       }
       if(i<0) return -1;
       int j=ch.length-1;
       while(ch[j]<=ch[i]){
        j--;
       }
       swap(ch,i,j);
       reverse(ch,i+1,ch.length-1);
       long val=Long.parseLong(new String(ch));
       return(val>Integer.MAX_VALUE)?-1:(int) val;
    }
    public void swap(char arr[],int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void reverse(char arr[],int i,int j){
        while(i<j){
        swap(arr,i,j);
        i++;
        j--;
        }
    }
}