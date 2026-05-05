class Solution {
    public int[] dy={-1,1,0,0};
    public int[] dx={0,0,-1,1};
    public void dfs(char[][] grid,boolean[][] vis,int i,int j,int n,int m)
    {
        if(vis[i][j])
        {
            return;
        }
        vis[i][j]=true;
        for(int d=0;d<4;d++)
        {
            int x=i+dx[d];
            int y=j+dy[d];
            if(x>=0 && y>=0 && x<n && y<m && vis[x][y]==false && grid[x][y]=='1')
            {
                dfs(grid,vis,x,y,n,m);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
     boolean[][] vis=new boolean[n][m];  
     int count=0;
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<m;j++)
        {
            if(!vis[i][j])
            {
                if(grid[i][j]=='1')
                {
                    System.out.println(i+" "+j);
                    count++;
                    dfs(grid,vis,i,j,n,m);
                }
            }
        }
     } 
     return count;
    }
}
