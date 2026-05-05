class Solution {
    public void dfs(ArrayList<List<Integer>> list,boolean[] vis,int num)
    {
        if(vis[num])
        {
            return;
        }
        vis[num]=true;
        for(int i:list.get(num))
        {
            dfs(list,vis,i);
        }
    }
    public int countComponents(int n, int[][] edges) {
    ArrayList<List<Integer>> list=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        list.add(new ArrayList<>());
    }
    for(int i=0;i<edges.length;i++)
    {
        int u=edges[i][0];
        int v=edges[i][1];
        list.get(u).add(v);
        list.get(v).add(u);
    }
    boolean[] vis=new boolean[n];
    int count=0;
    for(int i=0;i<n;i++)
    {
        if(!vis[i])
        {
            count++;
            dfs(list,vis,i);
        }
    }
    return count;
    }
}
