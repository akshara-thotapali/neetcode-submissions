class Solution {
    public int[] dx={0,0,-1,1};
    public int[] dy={-1,1,0,0};
    public void dfs(int[][] heights,boolean[][] vis,int i,int j,int n,int m)
    {
        if(vis[i][j])
        {
            return;
        }
        vis[i][j]=true;
        int curr=heights[i][j];
        for(int d=0;d<4;d++)
        {
           int x=i+dx[d];
           int y=j+dy[d];
           if(x>=0 && y>=0 && x<n && y<m && heights[x][y]>=curr)
           {
             dfs(heights,vis,x,y,n,m);
           } 
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        boolean[][] pac=new boolean[n][m];
        boolean[][] atla=new boolean[n][m];
        boolean flag=false;
        for(int i=0;i<m;i++)
        {
            dfs(heights,pac,0,i,n,m);
        }
        for(int i=0;i<n;i++)
        {
            dfs(heights,pac,i,0,n,m);
        }
        for(int i=0;i<m;i++)
        {
            dfs(heights,atla,n-1,i,n,m);
        }
        for(int i=0;i<n;i++)
        {
            dfs(heights,atla,i,m-1,n,m);
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(pac[i][j] && atla[i][j])
                {
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
}
