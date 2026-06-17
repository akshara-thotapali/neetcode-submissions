class Solution {
    private Map<Integer,Integer> map;
    public int dfs(String s,int i)
    {
        if(i==s.length())
        {
            return 1;
        }
        if(s.charAt(i)=='0')
        {
            return 0;
        }
        if(map.containsKey(i))
        {
            return map.get(i);
        }
      int count=dfs(s,i+1);
        if(i+1<s.length()){
            int num=Integer.parseInt(s.substring(i,i+2));
            if(num<=26)
            {
        count+=dfs(s,i+2);
            }
        }
        map.put(i,count);
        return count;
    }
    public int numDecodings(String s) {
        map=new HashMap<>();
       int count=dfs(s,0);
         return count;
    }
}
