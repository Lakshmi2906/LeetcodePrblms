class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int left=0,right=n-1;
        while(left<right){
            for(int i=0;i<matrix[0].length;i++){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
            }
            left++;
            right--;
        }
    }
}