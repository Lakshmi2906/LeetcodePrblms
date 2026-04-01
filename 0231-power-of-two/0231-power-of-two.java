class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<2) return n==1;
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
}