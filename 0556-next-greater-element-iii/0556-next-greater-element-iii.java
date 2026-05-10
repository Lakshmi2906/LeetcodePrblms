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
    public void swap(char[] ch,int i,int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
    public void reverse(char[] ch,int i,int j){
        while(i<j){
            swap(ch,i,j);
            i++;
            j--;
        }
    }
}