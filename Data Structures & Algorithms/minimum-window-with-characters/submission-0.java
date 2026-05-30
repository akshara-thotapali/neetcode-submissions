class Solution {
    public boolean checkFunc(String sub,HashMap<Character,Integer> map)
    {
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<sub.length();i++)
        {
            char c=sub.charAt(i);
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        for(Character key:map.keySet())
        {
            if(!map2.containsKey(key))
            {
                return false;
            }
            else{
                if(map2.get(key)<map.get(key))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
      int n=s.length();
      int m=t.length();
      if(n<m)
      {
        return "";
      }
       HashMap<Character,Integer> m1=new HashMap<>();
       for(int i=0;i<t.length();i++)
       {
        m1.put(t.charAt(i),m1.getOrDefault(t.charAt(i),0)+1);
       } 
       String res="";
       for(int i=0;i<s.length();i++)
       {
         for(int j=i+1;j<=s.length();j++)
         {
            String sub=s.substring(i,j);
            if(checkFunc(sub,m1))
            {
                if(res.length()==0 || ((j-i)<res.length())){
                res=sub;
                }
            }
         }
       }
       return res;
    }
}
