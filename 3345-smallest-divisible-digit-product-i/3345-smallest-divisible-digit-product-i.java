class Solution {
    public int smallestNumber(int n, int t) {
     while(true){
        if(digprod(n)%t==0) return n;
        n++;
     }
    }
    public int digprod(int n){
        int temp=n,digprod=1;
        while(temp>0){
        digprod*=temp%10;
        temp/=10;
      }
      return digprod;
    }
}