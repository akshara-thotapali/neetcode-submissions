class Solution {
    public int dfs(int[][] dp,int n,int m,int i,int j)
    {
        if( i>=n || j>=m)
        {
            return 0;
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }
        dp[i][j]=dfs(dp,n,m,i,j+1)+dfs(dp,n,m,i+1,j);
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        return dfs(dp,m,n,0,0);
    }
}
