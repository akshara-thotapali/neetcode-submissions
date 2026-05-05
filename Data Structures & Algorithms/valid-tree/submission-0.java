class Solution {
    public boolean checkcycle(ArrayList<List<Integer>> list,boolean[] vis,int i,int parent)
    {
        vis[i]=true;
        for(int num:list.get(i))
        {
            if(!vis[num])
            {
                if(checkcycle(list,vis,num,i))
                {
                    return true;
                }
            }
            else if(num!=parent)
            {
                return true;
            }
        }
        return false;
    }
    public boolean validTree(int n, int[][] edges) {
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
     if(checkcycle(list,vis,0,-1))
     {
        return false;
     }
     for(int i=0;i<n;i++)
     {
        if(!vis[i])
        {
            return false;
        }
     }
     return true;
    }
}
