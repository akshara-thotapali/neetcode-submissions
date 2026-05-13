class Solution {
    public String foreignDictionary(String[] words) {
     Map<Character,Set<Character>> map=new HashMap<>();
     HashMap<Character,Integer> indegree=new HashMap<>();
     for(String word:words)
     {
        for(char c:word.toCharArray())
        {
            map.putIfAbsent(c,new HashSet<>());
            indegree.putIfAbsent(c,0);
        }
     } 
     for(int i=0;i<words.length-1;i++)
     {
        String a=words[i];
        String b=words[i+1];
        if(a.length()>b.length() && a.startsWith(b))
        {
            return "";
        }
        int len=Math.min(a.length(),b.length());
        for(int j=0;j<len;j++)
        {
            char c1=a.charAt(j);
            char c2=b.charAt(j);
            if(c1!=c2)
            {
                if(!map.get(c1).contains(c2))
                {
                    map.get(c1).add(c2);
                    indegree.put(c2,indegree.get(c2)+1);
                }
                break;
            }
        }
     }
        Queue<Character> q=new LinkedList<>();
        for(char c:indegree.keySet())
        {
            if(indegree.get(c)==0)
            {
                q.add(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!q.isEmpty())
        {
            char c=q.poll();
            sb.append(c);
            for(char ch:map.get(c))
            {
                indegree.put(ch,indegree.get(ch)-1);
                if(indegree.get(ch)==0)
                {
                    q.add(ch);
                }
            }
        }
        if(sb.length()!=indegree.size())
        {
            return "";
        }
        return sb.toString();
     }
    }
