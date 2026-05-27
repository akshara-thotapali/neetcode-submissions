class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String word=new String(arr);
            if(!map.containsKey(word))
            {
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(word,list);
            }
            else{
               map.get(word).add(i);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(String w:map.keySet())
        {
            ArrayList<String> temp=new ArrayList<>();
            for(int i:map.get(w))
            {
                temp.add(strs[i]);
            }
            res.add(temp);
        }
        return res;
    }
}
