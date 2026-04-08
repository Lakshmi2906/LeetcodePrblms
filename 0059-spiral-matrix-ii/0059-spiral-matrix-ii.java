class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int cnt=1;
        int rmin=0,cmin=0,rmax=n-1,cmax=n-1;
        while(cnt <= n*n){
        for(int i=cmin;i<=cmax && cnt<=n*n;i++){
            matrix[rmin][i]=cnt++;
        }
        rmin++;
        for(int j=rmin;j<=rmax && cnt<=n*n;j++){
            matrix[j][cmax]=cnt++;
        }
        cmax--;
        for(int k=cmax;k>=cmin && cnt<=n*n;k--){
            matrix[rmax][k]=cnt++;
        }
        rmax--;
        for(int l=rmax;l>=rmin && cnt<=n*n;l--){
            matrix[l][cmin]=cnt++;
        }
        cmin++;
        }
        return matrix;
    }
}