class Solution {
    public boolean dfs(ArrayList<List<Integer>> list,boolean[] vis,boolean[] path,int curr)
    {
        vis[curr]=true;
        path[curr]=true;
        for(int i:list.get(curr))
        {
           if(!vis[i])
           {
            if(dfs(list,vis,path,i))
            {
                return true;
            }
           }
           else if(path[i])
           {
            return true;
           }
        }
        path[curr]=false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      ArrayList<List<Integer>> list=new ArrayList<>();
      for(int i=0;i<numCourses;i++)
      {
        list.add(new ArrayList<>());
      }
      int n=prerequisites.length;
      for(int i=0;i<n;i++)
      {
        int u=prerequisites[i][0];
        int v=prerequisites[i][1];
        list.get(u).add(v);
      }  
      boolean[] vis=new boolean[numCourses];
      boolean[] path=new boolean[numCourses];
      for(int i=0;i<numCourses;i++)
      {
        if(!vis[i])
        {
            if(dfs(list,vis,path,i))
            {
                return false;
            }
        }
      }
      return true;
    }
}
