class Solution {
    public int[] dx={-1,1,0,0};
    public int[] dy={0,0,-1,1};
    public boolean checkword(char[][] board,boolean[][] vis,String word,int i,int j,int index)
    {
        if(index==word.length())
        {
            return true;
        }
        if(vis[i][j])
        {
            return false;
        }
        vis[i][j]=true;
        for(int d=0;d<4;d++)
        {
            int x=i+dx[d];
            int y=j+dy[d];
            if(x>=0 && y>=0 && x<board.length && y<board[0].length && !vis[x][y] && board[x][y]==word.charAt(index))
            {
                if(checkword(board,vis,word,x,y,index+1))
                {
                    return true;
                }
            }
        }
        vis[i][j]=false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
       boolean[][] vis=new boolean[n][m]; 
       char f=word.charAt(0);
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
            if(board[i][j]==f){
       if(checkword(board,vis,word,i,j,1))
       {
        return true;
       }
            }
        }
        }
       return false;
    }
}
