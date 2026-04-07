class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls=new ArrayList<>();
        int cnt=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int rmin=0,cmin=0,rmax=matrix.length-1,cmax=matrix[0].length-1;
        while(cnt< n*m){
            for(int i=cmin;i<=cmax && cnt< n*m;i++){
                ls.add(matrix[rmin][i]);
                cnt++;
            }
            rmin++;
            for(int j=rmin;j<=rmax && cnt< n*m;j++){
                ls.add(matrix[j][cmax]);
                cnt++;
            }
            cmax--;
            for(int k=cmax;k>=cmin && cnt< n*m;k--){
                ls.add(matrix[rmax][k]);
                cnt++;
            }
            rmax--;
            for(int l=rmax;l>=rmin && cnt< n*m;l--){
                ls.add(matrix[l][cmin]);
                cnt++;
            }
            cmin++;
        }
        return ls;
    }
}