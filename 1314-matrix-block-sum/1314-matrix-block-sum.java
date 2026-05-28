class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i+1][j+1] = mat[i][j] 
                             + dp[i][j+1] 
                             + dp[i+1][j] 
                             - dp[i][j];
            }
        }
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i-k), c1 = Math.max(0, j-k);
                int r2 = Math.min(m-1, i+k), c2 = Math.min(n-1, j+k);

                ans[i][j] = dp[r2+1][c2+1] 
                          - dp[r1][c2+1] 
                          - dp[r2+1][c1] 
                          + dp[r1][c1];
            }
        }
        return ans;
    }
}