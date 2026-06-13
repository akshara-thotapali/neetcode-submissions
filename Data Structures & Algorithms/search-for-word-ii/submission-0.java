class Node{
    Node[] child;
    boolean flag;
    Node(){
        child=new Node[26];
        flag=false;
    }
}
class Solution {
    public int[] dx={0,0,-1,1};
    public int[] dy={-1,1,0,0};
    public HashSet<String> set;
    public void construct(Node root,String word)
    {
        Node temp=root;
        for(int i=0;i<word.length();i++)
        {
            int c=word.charAt(i)-'a';
            if(temp.child[c]==null)
            {
                temp.child[c]=new Node();
            }
            temp=temp.child[c];
        }
        temp.flag=true;
        return;
    }
    public void dfs(Node temp,char[][] board,int i,int j,int n,int m,boolean[][] vis,StringBuilder sb,List<String> res)
    {
        char c=board[i][j];
        if(vis[i][j] || temp.child[c-'a']==null)
        {
            return;
        }
        vis[i][j]=true;
        temp=temp.child[c-'a'];
        sb.append(c);
         if(temp.flag)
        {
            String s=sb.toString();
            if(!set.contains(s))
            {
                res.add(s);
                set.add(s);
            }
        }
        for(int d=0;d<4;d++)
        {
            int x=i+dx[d];
            int y=j+dy[d];
            if(x>=0 && x<n && y>=0 && y<m && vis[x][y]==false)
            {
                dfs(temp,board,x,y,n,m,vis,sb,res);
            }
        }
        vis[i][j]=false;
        sb.deleteCharAt(sb.length()-1);
        return;
    }
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res=new ArrayList<>();
        Node root=new Node();
        int n=board.length;
        int m=board[0].length;
            for(int j=0;j<words.length;j++)
            {
                construct(root,words[j]);
            }
                set=new HashSet<>();
                 boolean[][] vis=new boolean[n][m];
                 for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                 StringBuilder sb=new StringBuilder();
                 Node temp=root;
            dfs(temp,board,i,j,n,m,vis,sb,res);
                    }
                 }
            return res;
    }
}
