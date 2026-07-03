class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int asum=0,bsum=0;
        for(int a:aliceSizes) asum+=a;
        for(int b:bobSizes) bsum+=b;
        HashSet<Integer> hs=new HashSet<>();
        for(int b:bobSizes){
            hs.add(b);
        }
        int diff=(asum-bsum)/2;
        for(int a:aliceSizes){
            int y=a-diff;
            if(hs.contains(y)){
                return new int[] {a,y};
            }
        }
        return new int[] {};
    }
}