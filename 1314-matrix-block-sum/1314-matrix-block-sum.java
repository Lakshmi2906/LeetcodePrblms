class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int row=mat.length;
        int col=mat[0].length;
        int ans[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int sum=0;
                for(int r=i-k;r<=i+k;r++){
                    for(int c=j-k;c<=j+k;c++){
                        if(r>=0 && r<row && c>=0 && c<col){
                          sum+=mat[r][c];
                        }
                    }
                }
                ans[i][j]=sum;
            }
        }
        return ans;
    }
}